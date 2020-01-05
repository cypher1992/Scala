package com.local.ClassesAndObject.Implicit

object HotelImplictCaseClass extends App{

/*
 How use Implicit Class to add methods to an object without modifying
 the source code of the object - also commonly known as extension methods.
 Using Implicit Class to extend functionality of an object can be quite
 handy especially when you do have have access to modify the source object.
  */
  case class Hotel(name:String,address:String,UniqueID:Int)

  val hotel:Hotel = new Hotel("Z Hotel","Astoria",1)

object HotelImplicts{
    implicit class AugmentedHotel(hotel:Hotel){
      def doSomthingNewAfterCreatingACaseClass: String =
        s"""
           |${hotel.name}
           |${hotel.address}
           | ${hotel.UniqueID}
         """.stripMargin
    }

  }

  import HotelImplicts._
  println(
    s"""
       |${hotel.doSomthingNewAfterCreatingACaseClass}
     """.stripMargin)


}
