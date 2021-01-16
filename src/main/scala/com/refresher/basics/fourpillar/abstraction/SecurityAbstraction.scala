package com.refresher.basics.fourpillar.abstraction

abstract class SecurityAbstraction (private val ticker:String, private val exchange:String){

  def getTicker:String = this.ticker
  def getExchange:String = this.exchange
  def info():String =
    s"""
      |Exchange: ${this.exchange}
      |Ticker: ${this.ticker}
      |""".stripMargin

}
