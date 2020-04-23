package com.local.AlgoWithDataStructure.Data_Structure.Algo

class BubbleSort (var array:Array[Int]) {
  def getArray(): Array[Int] = this.array

  def setArray(newArray: Array[Int]): Unit = this.array = newArray

  def bubbleSort(array: Array[Int] = this.getArray()): Array[Int] = {

    def sort(): Array[Int] = {
      for (i <- 0 until array.length - 1) {
        for (j <- 0 until array.length - 1 - i) {
          if (array(j) > array(j + 1)) {
            val temp: Int = array(j)
            array(j) = array(j + 1)
            array(j + 1) = temp
          }
        }
      }
      array
    }

    array match {
      case a if (array.isEmpty) => array
      case b if (array.length == 1) => array
      case _ => sort()
    }

  }
}
