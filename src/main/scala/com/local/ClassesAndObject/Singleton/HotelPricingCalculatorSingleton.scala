package com.local.ClassesAndObject.Singleton

object HotelPricingCalculatorSingleton {

  def calculate(perNightRate:Double, nights:Int ):Double = nights match {
      case  0 => 0.00
      case _ => nights * perNightRate
  }

}
