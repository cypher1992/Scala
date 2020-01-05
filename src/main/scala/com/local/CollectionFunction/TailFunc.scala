package com.local.CollectionFunction

object TailFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-tail-example/
    OBJ:  We will learn how to use the tail function with examples on collection data structures in Scala.
    INFO: The tail method returns a collection consisting of all elements except the first one.
    FUNC: def tail: Repr
  */

  val ticker:Seq[String] = Seq("BX","WFC","JPM","BAC","C")
  val tailTicker:Seq[String] = ticker.tail

  println(
    s"""
      |Initialize Ticker Sequence
      |${ticker}
      |Tail on Sequence returns everything but the first
      |${tailTicker}
    """.stripMargin)

}
