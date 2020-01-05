package com.review.Basic

object ForControl extends App{


  case class Stock(name:String,ticker:String,price:Array[(String,Double)])
  case class portfolio(stocks:List[Stock],sizeDerivative:Int,beta:Double)

  val bx = new Stock("BlackStone","BX",Array(("Open",42.16),("Close",42.16),("High",45.55),("Low",42.11)))
  val c = new Stock("Citi Group","C",Array(("Open",109.21),("Close",107.76),("High",109.21),("Low",106.94)))
  val jpm = new Stock("JP Morgan","JPM",Array(("Open",531.41),("Close",524.12),("High",575.91),("Low",531.41)))
  val bac = new Stock("Bank Of America Corp","BAC",Array(("Open",53.75),("Close",31.74),("High",55.55),("Low",30.75)))
  val wfc = new Stock("Wells Fargo Corp","",Array(("Open",10.75),("Close",10.21),("High",10.99),("Low",10.03)))

  val listOfStock:List[Stock] = List(bx,c,jpm,bac,wfc)

    var stockName:List[String] = List()
    for(stock <- 0 to listOfStock.size-1) {
      stockName = stockName :+ listOfStock(stock).name
    }

    println(stockName)


    val stock:List[Stock] = for{
      stockReturn <- listOfStock
      if( stockReturn.name=="JP Morgan" || stockReturn.name == "Wells Fargo Corp")
    } yield stockReturn


    val checkIf:Boolean = if(stock.size < 2)(true)else(false)
    println(checkIf)
    println(stock.size)
    println(stock(0).price.mkString(","))



}
