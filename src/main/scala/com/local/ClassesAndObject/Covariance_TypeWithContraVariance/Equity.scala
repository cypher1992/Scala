package com.local.ClassesAndObject.Covariance_TypeWithContraVariance

import com.local.ClassesAndObject.Covariance_TypeWithContraVariance.Financial_Instrument


case class Equity(price:Option[Double],typeOfInstrument:String,quantity:Option[Int], ticker:String) extends Financial_Instrument(price,typeOfInstrument,quantity) {

  override def cost():Option[Double]= Some(quantity.getOrElse(0) * price.getOrElse(0.00))
  def stat():Unit ={
    println(
      f"""
         |TICKER: ${this.ticker}
         |PRICE: $$ ${this.price.getOrElse(0.00)}
         |TYPE: ${this.typeOfInstrument}
         |QUANTITY: ${this.quantity.getOrElse(0)}
         |TOTAL CAPITAL: ${this.cost().getOrElse(0.00)}
       """.stripMargin
    )
  }
}
