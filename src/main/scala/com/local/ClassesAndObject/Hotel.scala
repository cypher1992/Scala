package com.local.ClassesAndObject

import com.local.ClassesAndObject.HotelCompanionObjectWithFactory
import com.local.ClassesAndObject.Motel
import com.local.ClassesAndObject.Airbnb


object Hotel {

  private val uuid =1


  def getterUUID():Int = {
    return uuid
  }

  def apply(name:String):HotelCompanionObjectWithFactory ={

    name match{
      case "Motel" => new Motel(name)
      case "AirBnB" => new Airbnb(name)
      case _ => new HotelCompanionObjectWithFactory(name)
    }

  }

  def apply(name:String,avgPricePerNight:Option[Double]):HotelCompanionObjectWithFactory ={

    name match{
      case "Motel" => new Motel(name,avgPricePerNight)
      case "AirBnB" => new Airbnb(name, avgPricePerNight)
      case _ => new HotelCompanionObjectWithFactory(name, avgPricePerNight)
    }

  }


}
