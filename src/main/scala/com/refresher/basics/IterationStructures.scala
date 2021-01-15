package com.refresher.basics

class IterationStructures(private val start:Int,private val end:Int) {

  private var counter:Int =0

  def setCounter(newCounter:Int):Unit = this.counter = newCounter
  def getCounter():Int = this.counter

  def forToLoop():Int = {
    //this iterate up to end
    for(counter <- start to end){
      println(this.counter)
      this.setCounter(counter)
    }
    this.getCounter()
  }

  def forUntilLoop():Int = {
    // this iterate up to end-1
    for(counter <- start until end){
      println(counter)
      this.setCounter(counter)
    }
    this.getCounter()
  }

  def whileLoop(): Int ={
    while(counter<end){
      println(counter)
      counter+=1
      this.setCounter(counter)
    }
    this.getCounter()
  }

  def doWhileLoop():Int ={
    do{
      println(counter)
      counter+=1
      this.setCounter(counter)
    }while(counter<end)
    this.getCounter()
  }

}
