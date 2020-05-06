package com.local.AlgoWithDataStructure.Data_Structure

class StackStructure(maxSize:Int){
  //LIFO

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

  def isFull():Boolean ={
    if(this.top == this.maxSize-1){
      return true
    }else{
      return false
    }
  }
}
