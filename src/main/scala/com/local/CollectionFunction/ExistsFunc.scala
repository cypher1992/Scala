package com.local.CollectionFunction

object ExistsFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-exists-function/
OBJ:  In this tutorial, we will learn how to use the exists function on collection data structures in Scala.
INFO: The exists function takes a predicate function as parameter, and will find the first element that satisfy this predicate
       function. As of the Scala 2.13.0 version, the exists function is a member of the Iterable³³⁰ trait and is defined as follows:
*/

  val hotels:Seq[String] = Seq("Z-Hotel","Feather Factory Hotel","Paper Factory Hotel","Pod 39 Hotel")
  //def exists(p: (A) ⇒ Boolean): Boolean
  val hotelExist:Boolean = hotels.exists(hotelName => hotelName == "Paper Factory Hotel")
  // partial function with predicates
  val pfPredicate:(String) =>Boolean = (hotelName) => hotelName == "Paper Factory Hotel"
  val hotelExistPredicate:Boolean = hotels.exists(pfPredicate)

println(
  s"""
    |Initialized Hotel
    |${hotels}
    |Hotel Exist
    |${hotelExist}
    |Using Predicates
    |${pfPredicate}
    |If Hotel Exist using Predicate
    |${hotelExistPredicate}
  """.stripMargin)

}
