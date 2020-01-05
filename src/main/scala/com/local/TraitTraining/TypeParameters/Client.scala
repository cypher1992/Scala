package com.local.TraitTraining.TypeParameters

object Client extends App{

val bx:Equities = new Equities("BUY",60,"BX", List(48.87,49.09,49.68,48.68))
val yield30yr:FixedIncome = new FixedIncome("SELL",360,"30YUS",List(2.294,2.294,2.294,2.294))

val trade = new Trade()

 trade.buy(bx)
 trade.sell(yield30yr)

}
