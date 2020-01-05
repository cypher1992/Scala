package com.local.CollectionFunction

object DropWhileFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-dropwhile-function/
    OBJ:  we will learn how to use the dropWhile function on collection data structures in Scala
    INFO: The dropWhile function takes a predicate function as parameter that will be used to drop certain
           elements in a collection which satisfies the predicate function. The dropping process, or removal of
           elements, will stop as soon as it encounters an element that does not match the predicate function
   */

  val hotels:Seq[String] = Seq("Z-Hotel", "Zuzu Hotel", "Feather Factory Hotel","Paper Factory Hotel","Pod39 Hotel","Hilton Hotel")
  val dropZHotel:Seq[String]= hotels.dropWhile(_.charAt(0) == 'Z')


  println(
    s"""
      |Sequence Hotel Initialzation
      |${hotels}
      |Drop for hotels start with Z at starting 0 position the dropwhile fuction fails once the boolean identifies the first String with no Z at 0 place
      |${dropZHotel}
    """.stripMargin)
}
