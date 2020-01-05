package com.local.ClassesAndObject.Typed_Class

class TypeHotels[H <: Hotel](hotels: Seq[H]) {


  def printHotel: Unit = {

    hotels.foreach(_.stats())

  }
}
