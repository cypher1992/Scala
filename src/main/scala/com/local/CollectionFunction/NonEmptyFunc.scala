package com.local.CollectionFunction

object NonEmptyFunc extends App{

/*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-nonempty-example/
  OBJ:  We will learn how to use the nonEmpty function with examples on collection data structures in Scala.
  INFO: The nonEmpty function, as its name implies, will test whether a given collection is not empty, and will return true or
        false, accordingly.
  FUNC: def nonEmpty: Boolean
*/

  val seqHotel:Seq[String] = Seq("Z-Hotel","Grand Budapest Hotel","Paper Factory Hotel","Pod 39")
  val isSeqHotelNonEmpty:Boolean = seqHotel.nonEmpty
  val emptyHotel:Seq[String] = Seq.empty[String]
  val isEmptyHotelNonEmpty:Boolean = emptyHotel.nonEmpty

  println(
    s"""
      |Initialization of Sequence String
      |${seqHotel}
      |Initialization of Empty Sequence String
      |${emptyHotel}
      |Is NonEmpty for Sequence String
      |${isSeqHotelNonEmpty}
      |Is NonEmpty for Empty Sequence String
      |${isEmptyHotelNonEmpty}
    """.stripMargin)

}
