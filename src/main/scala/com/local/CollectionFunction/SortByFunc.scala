package com.local.CollectionFunction

object SortByFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-sortby-example/
  OBJ:  We will learn how to use the sortBy function with examples on collection data structures in Scala.
  INFO: The sortBy method takes a predicate function and will use it to sort the elements in the collection.
  FUNC: def sortBy[B](f: (A) ⇒ B)(implicit ord: math.Ordering[B]): Repr
  */

  case class Hotel(name:String,price:Double)

  val hotels:Seq[Hotel] = Seq(Hotel("Z-Hotel",150.75),Hotel("Grand Budapest Hotel",321.19),Hotel("Paper Factory Hotel",121.00),Hotel("Feather Factory Hotel",127.04),Hotel("Pod 39",75.12))
  val sortedHotelByPrice:Seq[Hotel] = hotels.sortBy(hotel => hotel.price)
  val sortedHotelByName:Seq[Hotel] = hotels.sortBy(hotel => hotel.name)

  println(
    s"""
      |Initialize Hotels Sequence
      |${hotels}
      |Sort By name
      |${sortedHotelByName}
      |Sort by Price
      |${sortedHotelByPrice}
    """.stripMargin)

}
