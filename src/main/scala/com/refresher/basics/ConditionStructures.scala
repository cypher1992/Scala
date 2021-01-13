package com.refresher.basics

class ConditionStructures(private val number:Int){

  private var isPositive:Boolean = false
  private var isNegative:Boolean = false
  private var isNeutral:Boolean = false

  def getNumber():Int = this.number

  def ifNegative():Boolean = {
    if(this.getNumber()<0) {
      true
    } else {
      false
    }
  }

  // this is using match
  def ifPositive():Boolean  =
  {
    val temp:Int = this.getNumber()
    temp match {
      case temp if(this.getNumber() > 0) => true
      case _ => false
    }
  }



}
