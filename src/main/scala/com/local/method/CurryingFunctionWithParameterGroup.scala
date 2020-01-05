package com.local.method

object CurryingFunctionWithParameterGroup extends App{


  class Stock(price:Double)(quantity:Int)(ticker:String){

    def captialInvested():Double={
      lazy val capital:Double = price*quantity
      capital
    }

  }

  // partially applied fucnction opting to use only what you need as a function
  def portfolioAllocation(capital:Double,instrumentList:List[Stock])(leverage:Double = 3000.00):Double={
    var sum:Double = 0.00

    for(stock<- instrumentList){
      sum = sum + stock.captialInvested()
    }


    val allocation:Double = capital - sum

    allocation
  }


    val blackstone:Stock = new Stock(36.00)(100)("BX")
    val bankOfAmerica:Stock = new Stock(26.31)(25)("BAC")
    val jpMorgan:Stock = new Stock(110.14)(1000)("JPM")

    val stockList:List[Stock] = List(blackstone,bankOfAmerica,jpMorgan)

    // _ used as a placeholder for rest of the parameters leverage in this case
    val partialStockPortfolioWithoutLeverage = portfolioAllocation(40000.00,stockList)_
    // even with default the value is required to display; if not the reference in memory value shows
    println(s"${partialStockPortfolioWithoutLeverage(3000)}")



}
