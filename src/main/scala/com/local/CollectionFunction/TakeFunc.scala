package com.local.CollectionFunction

object TakeFunc extends App{

  /*
  URL:  https://ww.123movies.la/movie/rumble-in-the-bronx-y6vjgr4/watching.html
  OBJ:  we will learn how to use the take function with examples on collection data structures in Scala.
  INFO: The take method takes an integer N as parameter and will use it to return a new collection consisting of the first N elements.
  FUNC: def take(n: Int): Repr
  */


  val ticker:Seq[String] = Seq("BX","C","JPM","BAC","WFC")

  println(
    s"""
      |Initialize Sequence of Tickers
      |${ticker}
      |Take for index of sequence
      |${ticker.take(1)}
      |Take the first 3 index
      |${ticker.take(3)}
      |Take the first five index or the entire index
      |${ticker.take(5)}
    """.stripMargin)


}
