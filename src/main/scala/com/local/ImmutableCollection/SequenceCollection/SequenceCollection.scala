package com.local.ImmutableCollection.SequenceCollection

object SequenceCollection  extends App{

/*
URL:http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-sequence/
AIM: We will learn how to use Scala's Immutable Sequence and perform common operations such as initialization, adding elements, adding Sequences and creating empty Sequence.
INFO: Sequence is in fact a trait, and is designed to generalize the concept of a data structure that has some predefined ordering
*/

val hotels:Seq[String] = Seq("Paper Factory Hotel", "Z Hotel", "Pod 39 Hotel", "Feather Factory Hotel")
val gbh:String = "Grand Budapest Hotel"
val addHotel:Seq[String] = hotels :+ gbh
val hiltonHotel:String = "Hilton Hotel"
val hotelSeq:Seq[String] = Seq(gbh,hiltonHotel)
val hotelFullSeq:Seq[String] = hotels ++ hotelSeq
val emptyHotelSeq:Seq[String] = Seq.empty[String]


println(
  s"""
    |Initialize Sequence value
    |${hotels}
    |Value variable declared
    |${gbh}
    |Adding Sequence to value
    |${addHotel}
    |Value variable declared
    |${hiltonHotel}
    |Initialized Sequence value
    |${hotelSeq}
    |Adding sequence with another sequence
    |${hotelFullSeq}
    |Empty Sequeunce
    |${emptyHotelSeq}
  """.stripMargin)


}
