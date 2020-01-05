package com.local.CollectionFunction

object ReduceFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-reduce-example/
OBJ:  we will learn how to use the reduce function with examples on collection data structures in Scala.
INFO: The reduce method takes an associative binary operator function as parameter and will use it to collapse elements
      from the collection. Unlike the fold method, reduce does not allow you to also specify an initial value.
FUNC: def reduce[A1 >: A](op: (A1, A1) ⇒ A1): A1
*/


val hotelPrices:Seq[Double] = Seq(1.25,941.51,356.85,5641.152,25114.112)
val sumHotelPrice:Double = hotelPrices.reduce((a,b) => a+b)
val minHotelPrice: Double = hotelPrices.reduce(_ min _)
val maxHotelPrice:Double = hotelPrices.reduce(_ max _)


val hotelNames:Seq[String]= Seq("Z-Hotel","Feather Factory Hotel","Pod39","Paper Factory Hotel","Hilton Hotel")
val concatenateHotel:String = hotelNames.reduce((str,str2) => str + ", " + str2)

println(
  s"""
    |Initialize Hotel Price Sequence
    |${hotelPrices}
    |Sum Price of Hotel
    |${sumHotelPrice}
    |Min Hotel Price
    |${minHotelPrice}
    |Max Hotel Price
    |${maxHotelPrice}
    |Initialize Hotel Name Sequence
    |${hotelNames}
    |Concatenate Hotel Names
    |${concatenateHotel}
  """.stripMargin)

}
