package com.local.CollectionFunction

object UnZipFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-zip-example/
    OBJ:  we will learn how to use the zip function with examples on collection data structures in Scala.
    INFO: The zip method takes another collection as parameter and will merge its elements with the elements of the current
          collection to create a new collection consisting of pairs or Tuple2 elements from both collections.
    FUNC: def zip[B](that: GenIterable[B]): Iterable[(A, B)]
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-unzip-example/
    OBJ:  we will learn how to use the unzip function with examples on collection data structures in Scala.
    INFO: The unzip method will unzip and un-merge a collection consisting of element pairs or Tuple2 into two separate collections.
    FUNC: def unzip[A1, A2](implicit asPair: (A) ⇒ (A1, A2)): (CC[A1], CC[A2])
   */

  val hotel:Seq[String] = Seq("Z-Hotel","Paper Factory Hotel","Feather Factory Hotel","Grand Budapest Hotel","Pod 39")
  val hotelPrice:Seq[Double] = Seq(150.41,121.50,100.64,512.61,80.91)
  val hotelNamePrice:Seq[(String,Double)] = hotel zip hotelPrice
  val unZipHotelNamePrice:(Seq[String],Seq[Double]) = hotelNamePrice.unzip


  println(
    s"""
      |Hotel Initialization Sequence
      |${hotel}
      |Hotel Price Intialization Sequence
      |${hotelPrice}
      |Zip together Hotel Name and Hotel Price
      |${hotelNamePrice}
      |Unzip Hotel Name and Hotel Price
      |${unZipHotelNamePrice}
    """.stripMargin)

}
