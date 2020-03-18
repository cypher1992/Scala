package com.local.AlgoWithDataStructure.Data_Structure.Concepts

case class FactorialMemoization(var map:Map[Int,Option[Int]]){

  /*
    Use of cache previous values and to save memory with process time
  */

  //private var map:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]

  def getMap():Map[Int,Option[Int]] = return this.map

  def setMap(mapObj:Map[Int,Option[Int]]):Unit = {
     this.map = this.map ++ mapObj
  }

  def appendToMap(i:Int, i2:Int):Map[Int,Option[Int]] = getMap() + (i -> Some(i2))

  def findValue(key:Int):Any = {
    try{
      map(key).getOrElse(key,None)
    }catch{
      case e:Exception => None
    }

  }

  def factorial(x:Int):Any ={
    x match {
      case 0 | 1 => 1
      case a if(this.findValue(x) != None) => this.findValue(x)
      case _ => 1000000
    }
  }

}
