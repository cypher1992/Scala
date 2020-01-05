package com.local.ClassesAndObject.Covariance_TypeWithContraVariance

/*
Generics:
src: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-variance-contra-variance/

*/

class FinancialInstrumentTypeContraVariance[-FinIns <: Equity](financial_Instrument:Seq[FinIns]){

  def printStats: Unit = financial_Instrument.foreach(_.stat())

}
