package com.local.TraitTraining.ExtMultiTraits

class Trade extends SecurityBasic[Security] with SecurityConversion[Security] {

  def buy(security:Security):String={
    s"""
      |PURCHASE SECURITY:
      |${security.stats()}
    """.stripMargin
  }
  def sell(security:Security): String = {
    s"""
       |SELL SECURITY:
       |${security.stats()}
    """.stripMargin

  }
  def hold(security:Security):String = {
    s"""
       |HOLD SECURITY:
       |${security.stats()}
    """.stripMargin
  }

  def convertSecurity(bond:Security,percentageVotingRight:Double,identifier:String):Equity={
    val equity:Equity =  new Equity(identifier,bond.price,bond.isActive,percentageVotingRight)
    equity
  }




}
