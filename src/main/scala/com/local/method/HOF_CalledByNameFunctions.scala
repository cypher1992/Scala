package com.local.Method

object HOF_CalledByNameFunctions extends App{

  //we will learn how to create Higher Order Function which is a function that takes another function as its parameter.

  val stockList = List(Tuple4("Blackstone","BX",52.14,100),Tuple4("JPMorgan","JPM",109.36,25))

  /*
  By-name parameters are only evaluated when used. They are in contrast to by-value parameters.
  To make a parameter called by-name, simply prepend => to its type
  By-name parameters have the advantage that they are not evaluated if they aren’t used in the function body.
  On the other hand, by-value parameters have the advantage that they are evaluated only once.
  */

  def exchangeRate(usdToEuro:Double):Double ={
    usdToEuro*0.91
  }

  val exchangeRateUsdToEur = (capital:Double) =>  (capital*0.91)

  // implementation of currying
  def costOfOwnershipForForeignInvestor(listStock : List[(String,String,Double,Int)])(exchangeRate:Double => Double):Double = {

    var capitalInvested:Double = 0.00

    /*
      Instead of using ListStock
      for(stock <-  stockList){
        capitalInvested+= stock._3*stock._4
      }
     */

    listStock.foreach{
      stock =>
        capitalInvested +=stock._3*stock._4
    }
     exchangeRate(capitalInvested)
  }

  println(s"${costOfOwnershipForForeignInvestor(stockList)(exchangeRate(_))}")
  println(s"${costOfOwnershipForForeignInvestor(stockList)(exchangeRateUsdToEur(_))}")

}
