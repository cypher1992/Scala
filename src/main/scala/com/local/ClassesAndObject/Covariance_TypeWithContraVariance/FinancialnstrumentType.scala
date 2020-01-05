package com.local.ClassesAndObject.Covariance_TypeWithContraVariance
import com.local.ClassesAndObject.Covariance_TypeWithContraVariance

/*
Covariance_Type: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-variance-covariance/
Covariance_Type: Used on Abstract or Inheritence classes that have different types
We've enabled covariance of type Donuts using the notation [+D <: Donut]
In other words, you can now create instances of ShoppingCart of type Donut or sub-types of Donuts such as VanillaDonut.
*/

class FinancialnstrumentType[+FinIns <: Financial_Instrument](financial_Instrument:Seq[FinIns]){

  def printStats: Unit = financial_Instrument.foreach(_.stat())

}
