package com.local.ClassesAndObject.Covariance_TypeWithContraVariance

abstract class Financial_Instrument(price:Option[Double],typeOfInstrument:String, quantity:Option[Int]) {

  def cost(): Option[Double]
  def stat():Unit
}