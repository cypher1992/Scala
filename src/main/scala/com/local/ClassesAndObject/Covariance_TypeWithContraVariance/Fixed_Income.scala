package com.local.ClassesAndObject.Covariance_TypeWithContraVariance
import com.local.ClassesAndObject.Covariance_TypeWithContraVariance.Financial_Instrument

case class Fixed_Income(price:Option[Double],typeOfInstrument:String,quantity:Option[Int],yieldToMaturity:Option[Double],interest:Option[Double],terms:Option[Int],period:Option[Int]) extends Financial_Instrument(price,typeOfInstrument,quantity) {

  val totalPeriods:Option[Int] = Some(terms.getOrElse(1) * period.getOrElse(1))
  val interstRatePerPeriod:Option[Double] = Some(interest.getOrElse(0.00)/period.getOrElse(1))
  val couponPayments:Option[Double] = Some(price.getOrElse(0.00)*interstRatePerPeriod.get)
  val ytm:Option[Double] = Some(1+yieldToMaturity.getOrElse(0.00))

  def cost(): Option[Double] = {
    val totalInvestment:Option[Double] =  Some((couponTotalPayment(ytm,couponPayments,totalPeriods).get + faceAppreciation(ytm,totalPeriods,price).get)*quantity.getOrElse(1))
    totalInvestment
  }

  def couponTotalPayment(ytm:Option[Double],couponPayments:Option[Double],totalPeriods:Option[Int]): Option[Double] ={

    var total: Double = 0.00
    for(intial <- 1 to totalPeriods.get ){
             total += couponPayments.get/scala.math.pow(ytm.get,intial)
    }
    val totalVal:Option[Double] = Some(total)
    totalVal
  }

  def faceAppreciation(ytm:Option[Double],totalPeriods:Option[Int],price:Option[Double]):Option[Double]={
    Some(price.getOrElse(1.00)/scala.math.pow(ytm.get,totalPeriods.get))
  }

  override def stat(): Unit = {

    val ctp = couponTotalPayment(this.ytm,this.couponPayments,this.totalPeriods)
    val fa = faceAppreciation(this.ytm,this.totalPeriods,this.price)

    println(
      f"""
         |FACE: $$ ${price.getOrElse(0.00)}%.2f
         |TYPE: ${typeOfInstrument}
         |QUANTITY: ${quantity.getOrElse(1)}
         |YIELD TO MATURITY: ${ytm.get}
         |COUPON INTEREST RATE: ${interest.getOrElse(0.00)}
         |TERMS: ${terms.getOrElse(1)}
         |PERIOD: ${period.getOrElse(1)}
         |Coupon Total Payments: $$ ${ctp.get}%.2f
         |Face Appreciation: $$ ${fa.get}%.2f
         |COST: $$ ${cost().get}%.2f
       """.stripMargin)
  }

}
