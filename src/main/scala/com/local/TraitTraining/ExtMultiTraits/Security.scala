package com.local.TraitTraining.ExtMultiTraits

abstract case class Security(identifier: String, price:Double,isActive:Boolean) {

  def stats():String

}
