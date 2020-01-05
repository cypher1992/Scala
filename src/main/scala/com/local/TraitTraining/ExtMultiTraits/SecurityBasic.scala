package com.local.TraitTraining.ExtMultiTraits

trait SecurityBasic[S]{

  def buy(security:S):String
  def sell(security:S): String
  def hold(security:S):String


}
