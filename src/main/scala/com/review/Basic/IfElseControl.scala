package com.review.Basic

object IfElseControl extends App{

  /*
   *Setup
   */
  case class Stock(ticker:String, price:Double)
  val bx:Stock = new Stock("Bx",35.24)

  /*
   *If condition
   */
    if(bx.ticker.equals("BX")){
      println(
        s"""
          |TICKER: ${bx.ticker}
        """.stripMargin)
    }


  /*
   *If/Else condition
   */
  if(bx.ticker.equals("BX")){
    println(
      s"""
         |TICKER: ${bx.ticker}
        """.stripMargin)
  }else{
    println(None)
  }

  /*
   *If/ElseIf/Else condition
   */
  if(bx.ticker.equals("BX")){
    println(
      s"""
         |TICKER: ${bx.ticker}
        """.stripMargin)
  }else if (bx.ticker == None){

  }else{
    println(null)
  }


  /*
   *If/ElseIf/Else expression
   */
  val storeResult:Any = if(bx.ticker.equals("BX"))(
    bx.ticker
  )else if (bx.ticker == None)(
    None
  )else(
    null
    )

  println(s"$storeResult")



}
