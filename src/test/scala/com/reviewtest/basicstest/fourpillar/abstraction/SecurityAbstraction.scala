package com.reviewtest.basicstest.fourpillar.abstraction

abstract class SecurityAbstraction(private val ticker:String, private val exchangeTraded:String) {

  def getTicker:String = this.ticker
  def getExchangeTraded:String = this.exchangeTraded

}
