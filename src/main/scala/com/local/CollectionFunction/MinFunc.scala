package com.local.CollectionFunction

object MinFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-min-example/
  OBJ:  We will learn how to use the min function with examples on collection data structures in Scala.
  INFO: The min function, as its name implies, will iterate through each element in a collection, and return the smallest,
        or minimum, item.
  FUNC: def min: A
  */

  val hotel:Seq[String] = Seq("Z-Hotel","Paper Factory Hotel", "Feather Factory Hotel","Grand Budapest Hotel", "Hilton Hotel")
  val hotelPrice:Seq[Double] = Seq(150.04,121.50,110.45,500.60,60.71)

  val minHotel:String = hotel.min
  val minPrice:Double = hotelPrice.min

  println(
    s"""
      |Initialization of Hotel String Sequence
      |${hotel}
      |Initialization of Hotel Price Sequence
      |${hotelPrice}
      |Min String of Hotel
      |${minHotel}
      |Min Price of Hotel
      |${minPrice}
    """.stripMargin)
}
