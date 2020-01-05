package com.local.TraitTraining.HotelFactory

object Client extends App{

  val paperFactory = HotelFactory.hotelSelection("Paper")
  println(paperFactory.name)

}
