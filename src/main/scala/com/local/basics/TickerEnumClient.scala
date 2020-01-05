package com.local.basics

object TickerEnumClient extends App{


  val enumTicker = new EquityEnum
  val bx  = enumTicker.BX

  println(
    s"""
       |BX Value: ${bx}
       |
     """.stripMargin)


}
