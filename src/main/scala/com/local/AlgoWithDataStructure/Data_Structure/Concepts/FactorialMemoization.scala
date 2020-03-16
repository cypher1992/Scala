package com.local.AlgoWithDataStructure.Data_Structure.Concepts

class FactorialMemoization {

  /*
    Use of cache previous values and to save memory with process time
  */

  val map:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]

  def appendToMap(map1:Map[Int,Option[Int]]= map,i:Int, i2:Int):Map[Int,Option[Int]] = map1 + (i -> Some(i2))

  def findValue(key:Int, map:Map[Int,Option[Int]]):Any = {
    try{
      map(key).getOrElse(key,None)
    }catch{
      case e:Exception => None
    }

  }

  def factorial(x:Int):Int ={
    x match {
      case 0 | 1 => 1

    }
  }

}
