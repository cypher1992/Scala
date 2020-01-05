package com.local.CollectionFunction

object MkStringFunc extends App{
/*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-mkstring-example/
  OBJ:  We will learn how to use the mkString function with examples on collection data structures in Scala.
  INFO: The mkString function makes it easier to create a String representation for the items in a collection. The mkString
        function has overloaded signatures for customizing the delimiter that separates each element, and for specifying
        any prefix and postfix literals to be prepended and appended to the String representaiton.
  FUNC: NONE
*/

  val hotels: Seq[String] = Seq("Z-Hotel","Paper Factory Hotel","Feather Factory Hotel", "Grand Budapest Hotel", "Hilton Hotel", "Pod 39")
  val strHotels:String = hotels.mkString(", ")

  println(
    s"""
      |Initialization Hotel Seq of String
      |${hotels}
      |Mkstring function with Seq and separator as parameter
      |${strHotels}
    """.stripMargin)
}
