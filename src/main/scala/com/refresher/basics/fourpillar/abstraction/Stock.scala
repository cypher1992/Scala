package com.refresher.basics.fourpillar.abstraction

class Stock(private val ticker:String,private val exchange:String)extends SecurityAbstraction(ticker,exchange){

  "Inheritance is acquiring properties and behaviors of superclass via the keyword extends"
  def inStockCLS():String = "STOCKCLS"
}
