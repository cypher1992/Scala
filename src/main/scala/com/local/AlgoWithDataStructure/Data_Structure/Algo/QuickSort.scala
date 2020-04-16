package com.local.AlgoWithDataStructure.Data_Structure.Algo

class QuickSort(private var lst:List[Int]){

  def getList():List[Int] = this.lst

  def setList(newList:List[Int]):List[Int] = {
    this.lst = newList
    this.lst
  }

  def quickSort(lst:List[Int]):List[Int] ={
    lst match {
      case Nil => Nil
      case x::Nil => lst
      case _ =>
        val pivot:Int = lst.head
        val (beforeLst,afterLst) = lst.tail.partition(_<pivot)
        (quickSort(beforeLst) :+ pivot) ++ quickSort(afterLst)
    }
  }

}
