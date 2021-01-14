package com.refresher.basics

class IterationStructures(private val start:Int,private val end:Int) {

  private var counter:Int =0

  def forToLoop():Int = {
    //this iterate up to end
    for(counter <- start to end){
      println(counter)
    }
    counter
  }

  def forUntilLoop():Int = {
    // this iterate up to end-1
    for(counter <- start until end){
      println(counter)
    }
    counter
  }

  def whileLoop(): Int ={
    while(counter<end){
      println(counter)
      counter+=1
    }
    counter
  }

  def doWhileLoop():Int ={
    do{
      println(counter)
      counter+=1
    }while(counter<end)
    counter
  }

}
