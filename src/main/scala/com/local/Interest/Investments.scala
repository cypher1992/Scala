package com.local.Interest

object Investments extends App{

  class Investment(principal:Double,terms:Int,payment:Double,roi:Double){


    def calcuateReturns(principal:Double,terms:Int,payment:Double,roi:Double):Double={

      if(terms == 1 ) {
        println(f"Term: ${terms} : $$ ${principal+payment+(principal * roi)}%.2f")
        val investmentReturn:Double = (principal+ payment+(principal * roi))
        investmentReturn
      }
      else {
        println(f"Term: ${terms} : $$ ${principal+payment+(principal * roi)}%.2f")
        calcuateReturns((principal+ payment+(principal * roi)),terms-1,payment,roi)
      }
    }

    def calculateTotalPaymentsOverTime(payment:Double,terms:Int):Double ={
      payment*terms
    }

    def afterTaxReturn(capital:Double,rate:Double): Double={
      capital*1-rate
    }

  }

  val investment = new Investment(2500,40,6000,0.07)
  val returnOnInvestment:Double = investment.calcuateReturns(2500,40,6000,0.07)
  val totalPayments:Double = investment.calculateTotalPaymentsOverTime(6000,40)
  println(f"\n\nTotal Payment: $$ ${totalPayments}%.2f")

}
