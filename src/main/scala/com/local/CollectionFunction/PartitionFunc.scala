package com.local.CollectionFunction

object PartitionFunc extends App{
/*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-partition-example/
  OBJ:  we will learn how to use the partition function with examples on collection data structures in Scala.
  INFO: The partition method takes a predicate function as its parameter and will use it to return two collections: one collection
        with elements that satisfied the predicate function and another collection with elements that did not match the predicate function.
  FUNC: def partition(p: (A) ⇒ Boolean): (Repr, Repr)

*/
  val hotel:Seq[Any] = Seq("Z-Hotel",151.50,"Paper Factory Hotel",125.00,"Feather Factory Hotel",135.00)

  val partionHotelAndPrice:(Seq[Any],Seq[Any])= hotel.partition{
    case name:String => true
    case price:Double => false
  }

  println(
    s"""
       |Initialization of Hotel Sequence
       |${hotel}
       |Partition by Hotel Name
       |${partionHotelAndPrice._1}
       |Partition by Hotel Price
       |${partionHotelAndPrice._2}
     """.stripMargin)


}
