package com.local

import com.local.HotelAttributes.{AugmentedHotel, DateTime, Hotel}

/*
OBJ: Package Object: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-package-object/

Purpose of this is to implement additional method after a class has been created using implict and using package
object to automatically import libraries using type without defining it in the same class
*/


package object HotelAttributes{

  type DateTime = org.joda.time.DateTime

  case class Hotel(name:String,location:String,costPerNight:Option[Double]=None)

  // Implicit class intends to extend on the class Hotel functions by add uuid
  implicit class AugmentedHotel(hotel:Hotel){

    def uuid():String ={
      s"""
        |${hotel.name}
        |${hotel.location}
      """.stripMargin
    }
  }

}

object Client extends App{

  val time = new DateTime()

  val paperHotel:Hotel = new Hotel("Paper Factory Hotel", "Brooklyn",Some(100.00))

  println(
    s"""
       |NAME:${paperHotel.name}
       |LOCATION: ${paperHotel.location}
       |COST: ${paperHotel.costPerNight.getOrElse(0.00)}
       |UUID: ${paperHotel.uuid()}
       |TIME: ${time}
     """.stripMargin)

}

