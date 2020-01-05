package com.local.CollectionFunction

object DiffFunc extends App{

/*
URL:   http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-diff-function/
OBJ:   We will learn how to use the diff function on collection data structures in Scala. The diff function is applicable to
       both Scala's Mutable and Immutable collection data structures.
INFO:  The diff function is typically applicable to a Set data structure, and you can use it to find the elements that differ
       between two Sets. As of the Scala 2.13.0 version, the diff function is a member of the Set³²⁷ trait and is defined as follows
*/

val hotels:Set[String] = Set("Feather Factory Hotel", "Paper Factory Hotel", "Z-Hotel","Pod39 Hotel")
val moreHotels:Set[String] = Set("Hilton Hotel","Z-Hotel")

val difBetweenSets:Set[String] = hotels diff moreHotels
val difbetweenSets2:Set[String] = moreHotels diff hotels
val dif2SubtractionSign:Set[String] = hotels -- moreHotels


println(
  s"""
    |Initialized Set
    |${hotels}
    |Initialized Second Set
    |${moreHotels}
    |Difference Between Sets using diff function
    |${difBetweenSets}
    |Inverse of diff function
    |${difbetweenSets2}
    |Difference using -- instead of diff function
    |${dif2SubtractionSign}
  """.stripMargin)


}
