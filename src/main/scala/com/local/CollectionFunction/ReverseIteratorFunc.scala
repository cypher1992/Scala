package com.local.CollectionFunction

object ReverseIteratorFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-reverseiterator-example/
  OBJ:  we will learn how to use the reverseIterator function with examples on collection data structures in Scala.
  INFO: The reverseIterator method returns an iterator which you can use to traverse the elements of a collection in reversed order.
  FUNC: def reverseIterator: Iterator[A]
  */

  val hotel:Seq[String] = Seq("Z-Hotel","Grand Budapest Hotel","Paper Factory Hotel","Feather Factory Hotel","Pod 39")
  val reverseIteratorHotel:Iterator[String] = hotel.reverseIterator
  val hotelList:List[String] = reverseIteratorHotel.toList

  println(
    s"""
      |Initialize Hotel
      |${hotel}
      |Reverse Iterator Hotel
      |${reverseIteratorHotel}
      |Hotel List
      |${hotelList}
    """.stripMargin)
}
