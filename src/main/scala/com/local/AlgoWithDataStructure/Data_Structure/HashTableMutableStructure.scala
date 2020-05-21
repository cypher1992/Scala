package com.local.AlgoWithDataStructure.Data_Structure
import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.HashTable

class HashTableMutableStructure[Key,Value](size:Int) extends HashTable[Key,Value]{

  private val hashArray:Array[List[(Key,Value)]] = Array.fill(size)(List[(Key,Value)]())

  def hashCode[Key](mykey:Key):Int = {
    val tempHashCode:Int = mykey.## % size
    if(tempHashCode <0){
      tempHashCode + size
    }else{
      tempHashCode
    }
  }

  /*
  def insert(key:Key,value:Value):Unit
  def search(key:Key):Option[Value]
  def delete(key:Key):Option[Value]*/

}
