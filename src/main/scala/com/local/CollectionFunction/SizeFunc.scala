package com.local.CollectionFunction

object SizeFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-size-example/
OBJ:  we will learn how to use the size function with examples on collection data structures in Scala.
INFO: The size method calculates the number of elements in a collection and return its size.
FUNC: def size: Int
  */

val hotel:Seq[String] = Seq("Z-Hotel","Grand Budapest Hotel","Paper Factory Hotel","Feather Factory Hotel","Pod 39")
val sizeHotel:Int = hotel.size

println(
  s"""
     |Hotel Sequence Initialization
     |${hotel}
     |Size of Hotel
     |${sizeHotel}
   """.stripMargin)

}
