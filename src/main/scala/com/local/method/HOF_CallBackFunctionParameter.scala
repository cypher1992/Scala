package com.local.method

object HOF_CallBackFunctionParameter extends App{

  /*
 This tutorial is a continuation of the previous Higher Order Function tutorial and
 we will showcase how to define a function which has a
 callback or Option callback parameter.
  */

  case class Investment(assetType:String,value:Double,terms:Int,rate:Double)

  val investment:Investment = new Investment("EQUITY",100000.00,10,0.17)

  def sendToDB():Unit={
    println(
      """
        | Open DB Connection
        | QueryStatement
        | WriteTODB
        | Close DB Connection
        |
      """.stripMargin)
  }

  def printReport(writeToDB: () =>Unit):Unit={

    println(
      s"""
        | INVESTMENT REPORTS:
        |
        | ASSET TYPE: ${investment.assetType}
        | VALUE: ${investment.value}
        | TERM(S): ${investment.terms}
        | RATE: ${investment.rate}
        |
        | END REPORT
        |
      """.stripMargin)

    sendToDB()
  }



  printReport(sendToDB)


}
