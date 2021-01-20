package com.refresher.basics.collectionsdemo.immutablecls

/*
* Immutable List are list that cannot be changed
* */

class ListCLS(list:List[Int]){

  def get(index:Int):Int = this.list(index)
  def append(value:Int,list:List[Int]):List[Int] = list :+ value
  def prepend(value:Int,list:List[Int]):List[Int] = value +: list

}
