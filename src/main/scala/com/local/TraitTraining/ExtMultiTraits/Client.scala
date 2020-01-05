package com.local.TraitTraining.ExtMultiTraits

object Client extends App{

  val BlackstoneCorporateBond:Bond = new Bond("BX30BBB",1000.65,true,"6/01/2019")
  val BlackstoneEquity:Equity = new Equity("BX",36.05,true,0.02)

  val tradeExe:Trade = new Trade()

  println(tradeExe.buy(BlackstoneCorporateBond))
  println(tradeExe.sell(BlackstoneEquity))

  val bondConversion:Equity = tradeExe.convertSecurity(BlackstoneCorporateBond,0.01,"BX")

  println(bondConversion.stats())




}
