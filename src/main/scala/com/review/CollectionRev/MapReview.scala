package com.review.CollectionRev
import scala.collection.immutable.ListMap

object MapReview extends App{

  val stockTime:Map[String,String] = Map(("NOV-1-2019","$26.08"),("NOV-2-2019","$25.06"),("NOV-3-2019","$25.13"),("NOV-4-2019","$26.20"),("NOV-5-2019","$25.11"))
  val stockTime2:Map[String,String] = Map(("NOV-1-2019","$26.08"),("NOV-2-2019","$25.06"),("NOV-3-2019","$14.23"),("NOV-4-2019","$26.20"),("NOV-5-2019","$25.11"))
  val sortStockTime = ListMap(stockTime.toSeq.sortBy(_._1):_*)
  // Retriving Value via Key using get or getOrElse
  val getNov2:Option[String] = stockTime get "NOV-1-2019"
  val ifNov3Exist:Boolean = stockTime contains "NOV-9-2019"

  // Adding Values to Map
  val addNov69Map:Map[String,String] = stockTime + ("NOV-6-2019" -> "25.12","NOV-9-2019" -> "26.11")

  // Removal Values from Map
  val removeNov1AND2:Map[String,String] = stockTime - ("NOV-1-2019","NOV-2-2019")

  // Differ Func
  val differMap = stockTime.toList.diff(stockTime2.toList)
  println(
    s"""
       |Get Nov 2nd Value: ${getNov2.getOrElse("NAN")}
       |
       |If Nov 3rd Exist: ${ifNov3Exist}
       |
       |Adding Value Nov 6th AND 9TH to Map ${addNov69Map}
       |
       |Removal Value Nov 1 and 2 ${removeNov1AND2}
       |
       |Differ Map: ${differMap}
       """.stripMargin)



  for(timeStock <- sortStockTime){

    println(s"${timeStock._1} | ${timeStock._2}")
  }



}
