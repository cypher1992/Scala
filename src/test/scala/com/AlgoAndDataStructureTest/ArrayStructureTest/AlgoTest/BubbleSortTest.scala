package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.BubbleSort

class BubbleSortTest extends AnyFlatSpec  with Matchers {

  // need to add to test refactor git
  "AlgoAndDataStructure BubbleSort: getArray()" should "returns array" in {
    val emptyArray:Array[Int] = Array.empty[Int]
    val bs:BubbleSort = new BubbleSort(emptyArray)
    val expected:Array[Int] = Array.empty[Int]
    val actual:Array[Int] = bs.getArray()

    assert(expected === actual)
  }

  "AlgoAndDataStructure BubbleSort: setList()" should "returns Unit" in {
    val emptyArray:Array[Int] = Array.empty[Int]
    val array:Array[Int] = Array(1)
    val bs:BubbleSort = new BubbleSort(emptyArray)
    bs.setArray(array)
    val expected:Array[Int] = Array(1)
    val actual:Array[Int] = bs.getArray()

    assert(expected === actual)
  }


}
