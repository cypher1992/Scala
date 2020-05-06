package com.local.AlgoWithDataStructure.Algo

class SelectionSort(private var array:Array[Int]) {

  def getArray():Array[Int] = {
    this.array
  }

  def setArray(newList:Array[Int]):Array[Int]={
   this.array = newList
    array
  }

  def selectSortAlg():Option[Array[Int]]={
    if(!this.getArray().isEmpty) {
      for (index <- 0 until array.length - 1) {
        var min = index
        for (innerIndex <- index + 1 until array.length) {
          if (array(innerIndex) < array(min)) {
            min = innerIndex
          }
        }
        val temp: Int = array(index)
        array(index) = array(min)
        array(min) = temp
      }

      Some(this.getArray())
    }
    else{
      None
    }
  }


}
