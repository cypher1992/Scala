package com.local.ClassesAndObject.Case

object CaseHotel extends App{

  case class Hotel(name:String,address:String,costPerNight:Double){

    def showDescription():Unit={
      println(
        f"""
          |NAME: ${name}
          |ADDRESS: ${address}
          |Cost Per Night: $$ ${costPerNight}%.2f
        """.stripMargin)
    }

  }


  val paperHotel:Hotel = new Hotel("Paper Factory Hotel","Brooklyn",150.00)
  paperHotel.showDescription()

}
