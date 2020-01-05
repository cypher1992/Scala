package com.local.CollectionFunction

object FlatMapFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-flatmap-function/
OBJ:  we will learn how to use the flatMap function on collection data structures in Scala.
INFO: The flatMap function is a handy function for producing a similar behavior to combining a map function followed by a
      flatten function. We, of course, cover the map and flatten functions individually in this chapter
FUNC: def flatMap[B](f: (A) => IterableOnce[B]): Iterable[B]
*/

val usStocks:Seq[String] = Seq("BX","JPM","C","GS","BAC")
val internationalStocks:Seq[String] = Seq("SG","MUFG","BNP")
val stocks:Seq[Seq[String]] = Seq(usStocks,internationalStocks)
val flattenStock:Seq[String] = stocks.flatMap(seq => seq)

println(
  s"""
    |Initialization US Stock Sequence
    |${usStocks}
    |Initialization EURO Stock Sequence
    |${internationalStocks}
    |Initialization Stock Sequence within Sequence of Strings
    |${stocks}
    |Flatmap the collection for Sequence
    |${flattenStock}
  """.stripMargin)

}
