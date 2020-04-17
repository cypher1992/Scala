package com.local.AlgoWithDataStructure.Data_Structure.Algo

class InsertionSort(private var list:List[Int]){

  def getList():List[Int] = this.list

  def setList(newList:List[Int]):List[Int] = {
    this.list = newList
    this.list
  }

  def insertSortList(list:List[Int]=this.getList()):List[Int]={

    def insert(index:Int,sorted:List[Int]):List[Int] ={
      sorted match{
        case Nil => index::Nil
        case h::t => if(index < h) index :: sorted else h::insert(index,t)
      }
    }

    def helper(sorted:List[Int] =Nil,unsorted:List[Int]=list):List[Int] ={
      unsorted match {
        case Nil => sorted
        case h::t => helper(insert(h,sorted),t)
      }
    }

    helper()
  }

}
