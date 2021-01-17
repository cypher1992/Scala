package com.refresher.basics.fourpillar.abstraction

abstract class SecurityAbstraction (private val ticker:String, private val exchange:String){

  /*
   - Encapsulation is wrapping both attributes and methods into a class and also providing security via accessors
    - private - only limited to the class itself for methods and attributes
    - default - attributes and methods are only accessible within same package
    - protected - attribute and method are only accessible within same package and via inheritance
    - public - attributes and methods are visible across package and classes

   */

  def getTicker:String = this.ticker
  def getExchange:String = this.exchange
  def info():String =
    s"""
      |Exchange: ${this.exchange}
      |Ticker: ${this.ticker}
      |""".stripMargin



}
