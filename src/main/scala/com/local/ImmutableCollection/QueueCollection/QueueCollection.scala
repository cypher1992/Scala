package com.local.ImmutableCollection.QueueCollection
import scala.collection.immutable._


object QueueCollection extends App{

/*
URL: http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-queue/
AIM:  We will learn how to use Scala's Immutable Queue and perform common operations such as initialization, adding or removing elements,
      find elements by key within the Queue, enqueue and dequeue.
INFO:  You would typically use a Queue to benefit from First In First Out (FIFO) semantics
*/

val stock:Queue[String] = Queue("BX","BAC","C","JPM")
val goldmanSacs:String = "GS"
val addStock:Queue[String] = stock :+ goldmanSacs
val societeGenerale:String = "SG"
val moreStocks:Queue[String] = addStock.enqueue(societeGenerale)
val dequeue:(String,Queue[String]) = moreStocks.dequeue
val head:String = dequeue._1
val tail:Queue[String] = dequeue._2
val stocks:Queue[String] = Queue(goldmanSacs,societeGenerale)
val newStock:Queue[String] = stock++stocks
val emptyStock:Queue[String] = Queue.empty[String]

println(
  s"""
    |Initialization Queue
    |${stock}
    |Val Declaration
    |${goldmanSacs}
    |Adding Element to Queue
    |${addStock}
    |Val Declaration
    |${societeGenerale}
    |Adding Element to Queue
    |${moreStocks}
    |Dequeue
    |${dequeue}
    |Head
    |${head}
    |Tail
    |${tail}
    |Add Stocks with another Queue
    |${newStock}
    |Empty Queue
    |${emptyStock}
  """.stripMargin)



}
