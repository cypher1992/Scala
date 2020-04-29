package com.local.AlgoWithDataStructure.Data_Structure

import scala.collection.mutable.ArrayBuffer

class StackStructure(maxSize:Int){

  private var stackBox:Array[Int] = new Array(maxSize)
  private var top:Int = -1

  def getStackBox():Array[Int] = this.stackBox

  def push(value:Int):Unit={
    if(this.maxSize > this.top){
      this.top+=1
      this.stackBox(top) = value
    }else{
      println("Value is greater than maxSize of Stack");
    }
  }

  def pop():Int={
    val value:Int = this.stackBox(top)
    this.stackBox(top) = 0
    this.top-=1
    value
  }
}
