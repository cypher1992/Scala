package com.local.TraitTraining.HotelFactory
import Hotels._


object HotelFactory {

  def hotelSelection(hotel:String): Hotel = {
    hotel match {
      case "Paper" => new PaperFactoryHotel()
      case "Feather" => new FeatherFactoryHotel()
      case _ => new OtherHotels()
    }

  }

}
