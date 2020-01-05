package com.local.CollectionFunction

object CollectFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-collect-function/
OBJ:  we will learn how to use the collect function on collection data structures in Scala. The collect function is applicable
      to both Scala's Mutable and Immutable collection data structures.
INFO: The collect function allows you to cherry-pick certain items from a collection, based on a user provided Partial Function.
      As of the Scala 2.13.0 version, the collect function is a member of the Iterable³²⁶ trait and is defined as follows:
*/


val stockWithPrice = Seq("BX",36.00,"BAC",12.50,"JMP",124.10,"C",7.61)
val tickers:Seq[String] = stockWithPrice.collect{case ticker:String => ticker}
val prices:Seq[Double] = stockWithPrice.collect{case price:Double => price}
println(
  s"""
    |Sequence Initialized
    |${stockWithPrice}
    |Return only symbols from sequence
    |${tickers}
    |Return only prices from Sequence
    |${prices}
  """.stripMargin)


}
