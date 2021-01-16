package com.refresher.basics.fourpillar.abstraction

class Stock(private val ticker:String,private val exchange:String)extends SecurityAbstraction(ticker,exchange){

  def inStockCLS():String = "STOCKCLS"

}
