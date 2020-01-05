package com.local.CollectionFunction

object MapFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-map-example/
  OBJ:  we will learn how to use the map function with examples on collection data structures in Scala.
  INFO: If you recall from the earlier sections on the flatMap and flatten functions, perhaps the map function can be thought of as somewhere in-between those two functions
  FUNC: def map[B](f: (A) => B): Iterable[B]
  */


  val hotels:Set[String] = Set("Grand Budapest Hotel","Z-Hotel","Paper Factory Hotel","Feather Factory Hotel", "Hilton Hotel")
  val hotels2:Set[AnyRef] = Set("Grand Budapest Hotel","Z-Hotel","Paper Factory Hotel","Feather Factory Hotel", "Hilton Hotel",None)

  def addHotelStr(str:String):String ={
    str+" Hotel"
  }

val anyRefHotels:Set[AnyRef] = hotels2.map{

  case hotel:String => hotel + "Hotel2"
  case _ => "Unknown Hotel"
}


  def removeHotel(str:String):String ={
    val lower:String = str.toLowerCase
    val findStr:String = lower.replaceFirst("hotel","")
    findStr
  }


  val hotelsRemoteStr:Set[String] = hotels.map(removeHotel)

  println(
    s"""
      |Intialization Of Set Hotel
      |${hotels}
      |Map Func with Adding String
      |${hotelsRemoteStr}
      |Map Func to process None AnyRef values
      |${anyRefHotels}
    """.stripMargin)

}
