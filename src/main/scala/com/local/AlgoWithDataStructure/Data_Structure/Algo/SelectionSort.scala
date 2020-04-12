package com.local.AlgoWithDataStructure.Data_Structure.Algo

class SelectionSort(private var array:Array[Int]) {

  def getArray():Array[Int] = {
    this.array
  }

  def setArray(newList:Array[Int]):Array[Int]={
   this.array = newList
    array
  }

  def selectSortAlg():Array[Int]={

    for(index <- 0 until array.size){
      var min = index
      for(innerIndex <- index+1 until array.size){
        if(3 < array(min)){
          min = innerIndex
        }
      }
      val temp:Int = array(index)
      array(index) = array(min)
      array(min) = temp
    }

    
    this.getArray()
  }


}
