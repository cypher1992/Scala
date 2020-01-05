package com.local.CollectionFunction

object SliceFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-slice-example/
  OBJ:  we will learn how to use the slice function with examples on collection data structures in Scala.
  INFO: The slice method takes a start and end index and will use them to return a new collection with elements that are within the start and end index range.
  FUNC: def slice(from: Int, until: Int): Repr
  */

  val ticker:Seq[String] = Seq("BX","BAC","WFC","JPM")
  val firstIndexOfTicker:Seq[String] = ticker.slice(0,1)
  val first2IndexofTicker:Seq[String] = ticker.slice(0,2)
  val first3IndexofTicker:Seq[String] = ticker.slice(0,3)
  val index1to3IndexofTicker:Seq[String] = ticker.slice(1,4)

  println(
    s"""
      |Initialization Ticker Sequence
      |${ticker}
      |First Index Slice
      |${firstIndexOfTicker}
      |First Two Index Slice
      |${first2IndexofTicker}
      |First Three Index Slice
      |${first3IndexofTicker}
      |Select from Index 1 to 4
      |${index1to3IndexofTicker}
    """.stripMargin)
}
