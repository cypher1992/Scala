package com.local.AlgoWithDataStructure.Data_Structure
import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.HashTable

class HashTableMutableStructure[Key,Value](size:Int) extends HashTable[Key,Value]{

  private val myHashArray = Array.fill(size)(List[Key,Value]())

  

  /*
  def insert(key:Key,value:Value):Unit

  def search(key:Key):Option[Value]
  def delete(key:Key):Option[Value]*/

}
