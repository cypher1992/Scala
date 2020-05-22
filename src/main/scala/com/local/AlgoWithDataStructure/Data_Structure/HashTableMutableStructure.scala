package com.local.AlgoWithDataStructure.Data_Structure
import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.HashTable

class HashTableMutableStructure[Key,Value](size:Int) extends HashTable[Key,Value]{

  private val hashArray:Array[List[Tuple2[Key,Value]]] = Array.fill(size)(List[(Key,Value)]())

  def hashCode[Key](key:Key):Int = {
    val tempHashCode:Int = key.## % size
    if(tempHashCode <0){
      tempHashCode + size
    }else{
      tempHashCode
    }
  }

  override def insert(key:Key,value:Value):Unit = {
    val list:List[(Key,Value)] = hashArray(hashCode(key))
    hashArray(hashCode(key)) = (key,value) +: list.filter(x => x._1 != key)
  }

  override def search(key:Key):Option[Value]={
    val list:List[(Key,Value)] = hashArray(hashCode(key))
    list.find(x => x._1 == key).map(y => y._2)
  }

  override def delete(key:Key):Option[Value] ={
    val list:List[(Key,Value)] = hashArray(hashCode(key))
    hashArray(hashCode(key)) == list.filter(x=> x._1 != key)
    list.find(x => x._1 == key).map(y => y._2)
  }



}
