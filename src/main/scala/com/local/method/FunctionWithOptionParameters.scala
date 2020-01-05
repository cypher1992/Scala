package com.local.method

object FunctionWithOptionParameters extends App{


  // case class has default values for options
  case class Equity(ticker:Option[String] = None,company:Option[String] = None,closedPrice:Option[Double] = Some(0.00))

  val bofa:Equity = Equity(Some("BAC"),Some("Bank Of America Corp"), Some(26.47))
  val citi:Equity = Equity(None,Some("Citigroup Inc"),Some(61.95))
  val wellFargo:Equity = Equity()

  def getTicker(equity:Equity):Option[String ]= {

    val ticker:Option[String]= equity.ticker match{
      case ticker => ticker
      case _ => None
    }
    ticker
  }

  println(getTicker(bofa))
  println(getTicker(citi))
  println(getTicker(citi))





}
