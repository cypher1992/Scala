package com.local.method

object FunctionWithReturnOptionType extends App{

  def getStockPriceChangeYTD():Option[Double]={

    val stockClosedPriceYTD:Double = 34.31
    val stockCurrentClosedPrice: Double = 24.97

    val percentageInChange:Double =  ((stockCurrentClosedPrice - stockClosedPriceYTD)/ stockClosedPriceYTD) *100

    Option(percentageInChange)
  }

  //conversion of strings very useful:
  // val str:String= getStockPriceChangeYTD.fold("")(_.toString)
   val percertageInChange:Double = getStockPriceChangeYTD.get
   val percertageInChangeDefaultValue:Double = getStockPriceChangeYTD().getOrElse(0.00)

  println(f"Percentage in change with regular get method ${percertageInChange}%1.2f")
  println(f"Percentage in change with getOrElse method ${percertageInChangeDefaultValue}%1.2f")

  val result:Option[Double]= getStockPriceChangeYTD match{
    case getStockPriceChangeYTD  => getStockPriceChangeYTD
    case _ => None
  }

  val resultMAP:Option[Double]= getStockPriceChangeYTD().map(value => (value+1))

  println(result.get)
  print(resultMAP.get)
}
