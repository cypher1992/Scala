package com.local.method

object FunctionWithParameters extends App{

  // function without parameters

  def ticker():String={"BX"} // method with parenthesis
  def tickerWithoutParenthesis:String = {"JPM"}
  def tickerWithoutReturnType:Unit ={
    val ticker = "BAC"
    println(s"${ticker}")
  }

  println(ticker)
  println(tickerWithoutParenthesis)
  tickerWithoutReturnType

  // function with Parameters

  case class Stock(ticker:Option[String],currentPrice:Option[Double])
  case class LongPosition(stock:Option[Stock],numberOfShares:Option[Int])

  val blackstone:Stock = Stock(Some("bx"),Some(48.81))
  val buying = LongPosition(Some(blackstone),Some(100))

  def calculateTotalSharesForStock(longPosition: LongPosition):Double={

    val stockPrice:Double = longPosition.stock.get.currentPrice.getOrElse(0.00)* longPosition.numberOfShares.getOrElse(0)

    stockPrice
  }

  println(calculateTotalSharesForStock(buying))




}
