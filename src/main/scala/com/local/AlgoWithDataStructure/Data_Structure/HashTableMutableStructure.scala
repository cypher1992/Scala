package com.local.AlgoWithDataStructure.Data_Structure
import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.HashTable

class HashTableMutableStructure[Key,Value](size:Int) extends HashTable[Key,Value]{

  def insert(key:Key,value:Value)

  def search(key:Key):Option[Value]
  def delete(key:Key):Option[Value]

}
