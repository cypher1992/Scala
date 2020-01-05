package com.local.basics

object Option extends App{

  // AVOIDING NULL EXCEPTION BEING TOSSED


  // option 1 using getOrElse()

  case class Equity(ticker:Option[String],closedPriceList:Option[List[Double]])

  val closedPriceBXSeries:Option[List[Double]] = Some(List(12.00,16.00,11.50
  ,15.75,16.00,17.25,25.00,24.25,24.25,26.75))

  val closedPriceJPMSeries:Option[List[Double]] = Some(List(103.00,101.00,102.25
    ,101.75,99.00,103.25,102.00,104.75,98.50,101.25))


  val blackstone = Equity(Some("BX"),closedPriceBXSeries)
  val jpMorgan = Equity(None,closedPriceJPMSeries)


  val bxticker = blackstone.ticker.get
  println(bxticker)

  // will get an exception tossed with the .get for jpMorgan.ticker.get need to use .getorElse()

  val jpmticker = jpMorgan.ticker.getOrElse("JPM") // ticker current has none as option so need to override it with .getElse()

  println(jpmticker)

  // option 2 using case

  val store = jpMorgan.closedPriceList match {
    case Some(list) => list
    case None =>

  }

  println(store)

// option 3 using mapping

  val bxtickerMap = blackstone.ticker.map(ticker => println(s"TICKER: ${ticker}"))
  val jpmtickerMap = jpMorgan.ticker.map(ticker => println(s"TICKER: ${ticker}"))



}