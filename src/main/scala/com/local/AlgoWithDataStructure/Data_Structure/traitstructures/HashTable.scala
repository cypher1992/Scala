package com.local.AlgoWithDataStructure.Data_Structure.traitstructures

trait HashTable[Key,Value] {

  def insert(key:Key,value:Value):Unit
  def search(key:Key):Option[Value]
  //def delete(key:Key):Option[Value]
  def delete(key:Key):Unit
}
