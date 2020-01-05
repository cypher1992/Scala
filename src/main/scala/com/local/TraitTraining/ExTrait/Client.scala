package com.local.TraitTraining.ExTrait

object Client extends App{

  val equityBX = new Equity("BX",21.31)

  val buy = equityBX.buy(100,equityBX.price)
  println(buy)

}
