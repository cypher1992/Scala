package com.local.TraitTraining.ExTrait

case class Equity(ticker:String, price:Double) extends Extend_Trait_Equity {


  def buy(quantity:Int,cost: Double): String = {

    val buy:String = {

      s"""
         |Quantity: ${quantity}
         |Cost: ${cost}
         |
       """.stripMargin

    }

    buy
  }

  def sell(quantity:Int, cost:Double): String ={

    val sell:String = {

      s"""
         |Quantity: ${quantity}
         |Cost:${cost}
         |
       """.stripMargin

    }

    sell

  }

  def hold(quantity:Int, valuation:Double):String ={
    val hold:String = {

      s"""
         |Quantity: ${quantity}
         |Cost:${valuation}
         |
       """.stripMargin

    }

    hold

  }


}
