package com.local.Method

object HOF extends App{

  //we will learn how to create Higher Order Function which is a function that takes another function as its parameter.
  // we will show how to pass-through an anonymous function or a regular def function to the Higher Order Function.
  //val stockList = List(Tuple3("Blackstone","BX",46.20),Tuple3("JPMorgan","JPM", 109.86))


  /*
      //How to define a higher order function which takes another function as parameter
      //
      //A Higher Order Function is a function which takes another function as its parameters.
  */


  def creditCard(principal:Double)(interestRate:Double)(daysPassedDue:Int)(discount:Double => Double): Double ={

    val calculateCost:Double = daysPassedDue match{

      case days if days >30 => principal+principal*interestRate
      case _ => principal
    }
    discount(calculateCost)
  }

  def discountOnCreditPayment(credit:Double,discount:Double):Double={
    credit-discount
  }

 // passing anonymous functions through the discount parameter
 val chaseCreditCard:Double = creditCard(3300)(0.2786)(29){cost:Double =>
  val discount:Double = 67.86
   cost-discount
 }

  // passing anonymous functions through the discount parameter
 val bOFACreditCard:Double = creditCard(3000)(0.2677)(31){cost =>
   val discount:Double = 0.00
   cost - discount
 }

// passing function as an argument
 val wellsFargoCreditCard:Double = creditCard(1000)(0.3319)(12)(discountOnCreditPayment(_,150.00))


  println(f"${chaseCreditCard}%.2f")
  println(f"${bOFACreditCard}%.2f")
  println(f"${wellsFargoCreditCard}%.2f")

}
