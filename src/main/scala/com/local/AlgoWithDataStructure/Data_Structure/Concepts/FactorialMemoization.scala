package com.local.AlgoWithDataStructure.Data_Structure.Concepts

class FactorialMemoization {

  /*
    Use of cache previous values and to save memory with process time
  */

  val map:Map[Int,Int] = Map.empty[Int,Int]

  def appendToMap(map1:Map[Int,Int]= map,i:Int, i2:Int):Map[Int,Int] = map1 + (i -> i2)

  def findValue(key:Int, map:Map[Int,Int]):Int = map(key)

}
