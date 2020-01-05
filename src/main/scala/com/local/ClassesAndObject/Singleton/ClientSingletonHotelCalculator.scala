package com.local.ClassesAndObject.Singleton

object ClientSingletonHotelCalculator extends App{

  val price:Double = HotelPricingCalculatorSingleton.calculate(500.00,0)
  val price2:Double = HotelPricingCalculatorSingleton.calculate(500.00,10)

  println(
    f"""
       |CLASS: ${HotelPricingCalculatorSingleton.hashCode()}
       |PRICE  $$${price}%.2f
       |PRICE2 $$${price2}%.2f
     """.stripMargin)

}
