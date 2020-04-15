package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.QuickSort

class QuickSortTest extends AnyFlatSpec with Matchers {

  "AlgoAndDataStructure QuickSort: qs.getArray()" should "return Array" in {
      val array:Array[Int] = Array(4,51,6,2,77,3)
      val qs:QuickSort = new QuickSort(array)
      val actual:Array[Int] = qs.getArray()
      val expected:Array[Int] = Array(4,51,6,2,77,3)

      assert(expected === actual)

  }

  "AlgoAndDataStructure QuickSort: qs.setArray(NewArray" should "return NewArray" in{
    val array:Array[Int] = Array.empty[Int]
    val newArray:Array[Int] = Array(1,34,663,36,2,324,68,9)
    val qs:QuickSort = new QuickSort(array)
    qs.setArray(newArray)
    val actual:Array[Int] = qs.getArray()
    val expected: Array[Int] = Array(1,34,663,36,2,324,68,9)
    assert(actual === expected)
  }

}
