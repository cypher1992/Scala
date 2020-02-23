package com.local.AlgoWithDataStructure.Data_Structure

class ArrayStructure{
  /*
    Arrays follow O(1) in the Asymptotic
    Arrays are linear data structure
    Arrays start at 0 and end at n-1; n represents the size of the array
  */
  def multiply2(array:Array[Int]):Array[Int] ={
    array match{
      case a if(array.isInstanceOf[Array[Int]]) => array.map(_ * 2)
    }
  }
}
