package com.local.AlgoWithDataStructure.Data_Structure.Algo

class SelectionSort[T](private val list:List[T]) {

  def getList():List[T] = {
    this.list
  }

  def setList(newList:List[T]):SelectionSort[T]={
    val newSelectionSort:SelectionSort[T] = new SelectionSort(newList)
    newSelectionSort
  }


}
