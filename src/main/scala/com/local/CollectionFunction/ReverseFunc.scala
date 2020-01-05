package com.local.CollectionFunction

object ReverseFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-reverse-example/
OBJ:  we will learn how to use the reverse function with examples on collection data structures in Scala.
INFO: The reverse method will create a new sequence with the elements in reversed order.
FUNC: def reverse: Repr
*/


val tickers:Seq[String] = Seq("BX","C","BAC","WFC","JPM")
val reverseTickers:Seq[String] = tickers.reverse

println(
  s"""
     |Initialized Sequence for Tickers
     |${tickers}
     |Reversed Ticker Sequence
     |${reverseTickers}
   """.stripMargin)

}
