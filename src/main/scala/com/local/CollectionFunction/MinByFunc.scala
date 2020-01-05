package com.local.CollectionFunction

object MinByFunc extends App{

/*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-minby-example/
  OBJ:  We will learn how to use the minBy function with examples on collection data structures in Scala.
  INFO: The minBy function is similar to the previous min function with regards to finding the smallest, or minimum, item
        in a collection. It, however, allows you to provide a predicate function to drive the criteria for comparing each element.
  FUNC: def minBy[B](f: (A) ⇒ B): A
*/


  case class Stock(ticker:String, price:Double)

  val stockSeq: Seq[Stock] = Seq(Stock("BX",17.24),Stock("C",5.73),Stock("JPM",99.91),Stock("WFC",71.42),Stock("BAC",5000.11))
  val findMinStockPrice:Stock = stockSeq.minBy(stock => stock.price)
  // Create a Value Function
  val stockPriceVF:(Stock) => Double = (stock) => stock.price
  val findMinStockPriceWithVF:Stock = stockSeq.minBy(stockPriceVF)

  println(
    s"""
       |Initialization of Stock Sequence
       |${stockSeq}
       |Find Max Stock in a Sequence using MaxBy
       |${findMinStockPrice}
       |Find Max Stock in a Sequence using MaxBy using Value Function
       |${findMinStockPriceWithVF}
  """.stripMargin)



}
