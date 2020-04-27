package com.local.AlgoWithDataStructure.Data_Structure

import scala.collection.mutable.ArrayBuffer

class StackStructure(maxSize:Int){

  private var stackBox:Array[Int] = new Array(maxSize)
  private var top:Int = -1

  def getStackBox():Array[Int] = this.stackBox

  def push(value:Int):Unit={
    this.top+=1
    this.stackBox(top) = value
  }

}
