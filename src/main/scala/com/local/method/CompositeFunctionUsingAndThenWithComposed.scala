package com.local.method

object CompositeFunctionUsingAndThenWithComposed extends App{


  /*

  Val functions inherit the andThen function and we will show how to use
  the andThen function to compose two functions together.
  Mathematically speaking, f(x) andThen g(x) = g(f(x)).
  The results of the first function f(x) is ran first and will
  be passed as input to the second function g(x).



   */

  case class Stock(numberOfStock:Int,stockPrice:Double){

    def totalCost():Double ={
      numberOfStock*stockPrice
    }
  }


  val bx:Stock = new Stock(150,56.71)

  val cost:Double = bx.totalCost()

  val dividend = (stockCost:Double) => {
    val yieldOfReturn = 0.02

    stockCost*yieldOfReturn
  }

  val costOfBusiness = (stockCost:Double,dividend:Double) => {

    val expense:Double = 0.22

    (stockCost+dividend)*(1-expense)

  }

  /*val andThenReturn:Double = (dividend andThen costOfBusiness)(cost,dividend(cost))*/

  println(f"${cost}%.2f")

  println(f"DIVIDENDS: ${dividend(cost)}%.2f")
  println(f"EXPENSE: ${costOfBusiness(cost,dividend(cost))}%.2f")



}
