package com.local.AlgoWithDataStructure.Data_Structure

import scala.collection.mutable.ArrayBuffer

class StackStructure(maxSize:Int){

  private var stackBox:Array[Int] = new Array(maxSize)
  private var top:Int = -1

  def getStackBox():Array[Int] = this.stackBox

  def push(value:Int):Unit={
    if(this.maxSize > this.top+1){
      this.top+=1
      this.stackBox(top) = value
    }else{
      println("Value is greater than maxSize of Stack")
    }
  }

  def pop():Int={
    if(this.top > -1) {
      val value: Int = this.stackBox(top)
      this.stackBox(top) = 0
      println(this.stackBox)
      this.top -= 1
      value
    }else{
      0
    }
  }

  def peek():Int={
    this.top match {
      case -1 => 0
      case _ => this.stackBox(this.top)
    }
  }

  def isEmpty():Boolean = {
    this.top match{
      case  -1 => true
      case _ => false
    }
  }
}
