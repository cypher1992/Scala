package com.local.ImmutableCollection.VectorCollection
import scala.collection._
object VectorCollection extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-vector/
OBJ:  We will learn how to use Scala's Immutable Vector to perform common operations such as initialize a Vector, access elements at specific index, append and prepend elements to Vector, and create an empty Vector.
INFO: The Vector class implements the IndexedSeq²⁸⁶ trait and, as a result, optimizes for fast random access.
*/

val guestHotel:Vector[Tuple2[String,String]] = Vector(Tuple2("Z - Hotel","Williamson"),Tuple2("Feather Hotel","Hanif"),Tuple2("Pod39","Yassin"),Tuple2("Paper Hotel","Reguieg"))
val reyesHilton:Tuple2[String,String] = ("Hilton Hotel","Reyes")
val singleGuestHotel:Vector[Tuple2[String,String]] = Vector(Tuple2("Hilton","Hilton"))
val addGuestHotel:Vector[Tuple2[String,String]] = guestHotel :+ reyesHilton
val addingVectors:Vector[Tuple2[String,String]] = guestHotel ++ singleGuestHotel
val emptyVector:Vector[String] = Vector.empty[String]
println(
  s"""
    |Vector Initialization
    |${guestHotel}
    |Access Elements of Vector
    |${guestHotel(3)}
    |Add Element to Vector
    |${addGuestHotel}
    |Adding Vector to Vector
    |${addingVectors}
    | Empty Vector
    |${emptyVector}
  """.stripMargin)


}
