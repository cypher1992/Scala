package com.local.AlgoWithDataStructure.Concepts

case class FactorialMemoization(private var map:Map[Int,Option[Int]]){

  // manage a single instance of a mutable map
  /*
    Use of cache previous values and to save memory with process time
  */

  //private var map:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]

  def getMap():Map[Int,Option[Int]] = return this.map

  def setMap(mapObj:Map[Int,Option[Int]]):Unit = {
     this.map = this.map ++ mapObj
  }

  def appendToMap(i:Int, i2:Int):Unit = setMap(getMap() + (i -> Some(i2)))

  def findValue(key:Int):Any = {
    try{
      this.map(key).getOrElse(key,None)
    }catch{
      case e:Exception => None
    }
  }

  def factorial(x:Int):Any ={
    def factorialAccumulate(value:Int = x,accumulate:Int=1): Any ={
        value match {
          case 0 | 1 => this.setMap(Map(x -> Some(accumulate)))
          case a if(this.findValue(x) != None) => this.findValue(x)
          case _ => factorialAccumulate(value-1,accumulate*value)
        }
    }
   factorialAccumulate()
   findValue(x)
  }

}
