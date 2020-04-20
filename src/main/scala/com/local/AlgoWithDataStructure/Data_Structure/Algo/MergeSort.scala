package com.local.AlgoWithDataStructure.Data_Structure.Algo

class MergeSort(var list:List[Int]) {

    def getList():List[Int] = this.list
    def setList(newlist:List[Int]):Unit = this.list = newlist

    def merge(l1:List[Int],l2:List[Int]):List[Int] ={
      (l1,l2) match{
        case (Nil, _) => l2
        case (_,Nil) =>l1
        case (h1::t1, h2::t2) => if(h1<h2) h1::merge(t1,l2)
        else h2::merge(l1,t2)
      }
    }

    def mergeSort(list:List[Int]):List[Int] ={
      list match {
        case Nil => list
        case h::Nil => list
        case _ =>
            val (l1,l2) = list.splitAt(list.length/2)
            merge(mergeSort(l1),mergeSort(l2))

      }
    }
}
