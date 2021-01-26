package com.refresher.basics.collectionsdemo.immutablecls
/*
* Immutable List are list that cannot be changed
* */

class ListCLS(private val list:List[Int]= List.empty[Int]){

  def getList():List[Int] = this.list
  def get(index:Int):Int = this.list(index)
  def append(value:Int,list:List[Int]=list):List[Int] = list :+ value
  def prepend(value:Int,list:List[Int]=list):List[Int] = value +: list
  def appendList(newList:List[Int],list:List[Int]=list):List[Any] = list :: newList

  def headElement(list:List[Int]):Int = list.head
  def tailList(list:List[Int]):List[Int] = list.tail
  def createEmptyList():List[Int] = Nil


}
