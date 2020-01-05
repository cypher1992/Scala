package com.local.ClassesAndObject.Type_Aliasing

object TypeAliasVsCaseClassHotel extends App{

  // OBJ: Type Alias Vs Case Class
  // URL: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-tutorial-learn-use-type-alias-versus-case-class/

  // alias class
  case class Hotel(name:String,address:String,avgCostPerNight:Option[Double]=None)

  val PaperHotel:Hotel = new Hotel("Paper Hotel Factory","Brooklyn")
  val ZHotel:Hotel = new Hotel("Z Hotel","Astoria")

  // another map - Type Alias
  type hotelTuple[Hotel,Int] = Tuple2[Hotel,Int]
  type HotelType[String,Option[Double]] = Tuple3[String,String,Double]

  // implented via alias vs case
  val featherHotelTupele = new HotelType("Feather Factory Hotel","Brooklyn",0.00)
  val featherHotel = new Hotel("Feather Factory Hotel","Brooklyn",None)

  val hotel = new hotelTuple(PaperHotel,1)
  val hotel2 = new hotelTuple(ZHotel,2)
  val hotel3 = new hotelTuple(featherHotel,3)

  val seqHotels:Seq[hotelTuple[Hotel,Int]] = Seq(hotel,hotel2,hotel3)

  def displayDetail(seq:Seq[hotelTuple[Hotel,Int]]):Unit ={

    seq.foreach{hotelItem =>
      print(
        s"""
          |${hotelItem._1}
          |${hotelItem._2}
        """.stripMargin)

    }
  }

  displayDetail(seqHotels)



}
