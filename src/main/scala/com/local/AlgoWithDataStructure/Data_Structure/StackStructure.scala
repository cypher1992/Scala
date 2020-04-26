package com.local.AlgoWithDataStructure.Data_Structure

class StackStructure(maxSize:Int){

  private var stackBox:Array[Int] = Array.empty[Int]
  private var top:Int = -1

  def push(value:Int):Unit={
    top+=1
    stackBox(top) = value
  }

}
