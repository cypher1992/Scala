package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.SelectionSort

class SelectionSortTest extends AnyFlatSpec with Matchers {

  "AlgoAndDataStructure: SelectionSort getArray()" should "return array" in {
    val array:Array[Int] = Array(3,2,1)
    val ss:SelectionSort = new SelectionSort(array)
    val actual:Array[Int] = ss.getArray()
    val expected:Array[Int] = Array(3,2,1)
    assert(expected === actual)
  }

  "AlgoAndDataStructure: SelectionSort setArray(list)" should "new array" in {
    val array:Array[Int] = Array.empty[Int]
    val newList:Array[Int] = Array(1,2,3)
    val ss:SelectionSort = new SelectionSort(array)
    ss.setArray(newList)
    val actual:Array[Int] = ss.getArray()
    val expected:Array[Int] = Array(1,2,3)
    assert(expected === actual)
  }

}
