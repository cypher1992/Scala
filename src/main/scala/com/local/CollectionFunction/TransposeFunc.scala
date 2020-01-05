package com.local.CollectionFunction

object TransposeFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-transpose-example/
    OBJ:  we will learn how to use the transpose function with examples on collection data structures in Scala.
    INFO: The transpose method will pair and overlay elements from another collections into a single collection.
    FUNC: def transpose[B](implicit asTraversable: (A) ⇒ GenTraversableOnce[B]): CC[CC[B]
   */


  val hotels:Seq[String] = Seq("Z-Hotel","Grand Budapest Hotel","Paper Factory Hotel","Feather Factory Hotel","Pod 39 Hotel")
  val hotelsPrice:Seq[Double] = Seq(150.14,523.74,121.35,110.79,75.64)
  val hotelsWithNameAndPrice:List[Any] = List(hotels,hotelsPrice)
  //val transposeHotelwithPrice = hotelsWithNameAndPrice.transpose(_)

  println(
    s"""
      |Initialize Hotel
      |${hotels}
      |Initialize Hotel with Price
      |${hotelsPrice}
      |List with Both hotels and hotel's price
      |${hotelsWithNameAndPrice}
      |Transpose toa pair hotel with price
    """.stripMargin)
}
