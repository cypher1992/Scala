package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import com.local.AlgoWithDataStructure.Algo.BubbleSort
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

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

  "AlgoAndDataStructure Bubblesort: bubbleSort(emptyArray)" should "returns emptyArray" in {
    val emptyArray:Array[Int] = Array.empty[Int]
    val bs:BubbleSort = new BubbleSort(emptyArray)
    val expected:Array[Int] = Array.empty[Int]
    val actual:Array[Int] = bs.bubbleSort()
    assert(expected === actual)
  }

  "AlgoAndDataStructure Bubblesort: bubbleSort(array)" should "returns array" in {
    val array:Array[Int] = Array(1)
    val bs:BubbleSort = new BubbleSort(array)
    val expected:Array[Int] = Array(1)
    val actual:Array[Int] = bs.bubbleSort()
    assert(expected === actual)
  }

  "AlgoAndDataStructure Bubblesort: bubbleSort(duplicateValuesArray)" should "returns array" in {
    val array:Array[Int] = Array(1,1)
    val bs:BubbleSort = new BubbleSort(array)
    val expected:Array[Int] = Array(1,1)
    val actual:Array[Int] = bs.bubbleSort()
    assert(expected === actual)
  }

  "AlgoAndDataStructure Bubblesort: bubbleSort(multiDuplicateValuesArray)" should "returns array" in {
    val array:Array[Int] = Array(1,1,2,1,2,1)
    val bs:BubbleSort = new BubbleSort(array)
    val expected:Array[Int] = Array(1,1,1,1,2,2)
    val actual:Array[Int] = bs.bubbleSort()
    assert(expected === actual)
  }

  "AlgoAndDataStructure Bubblesort: bubbleSort(valuesArray)" should "returns array" in {
    val array:Array[Int] = Array(5,3,1,2,4)
    val bs:BubbleSort = new BubbleSort(array)
    val expected:Array[Int] = Array(1,2,3,4,50)
    val actual:Array[Int] = bs.bubbleSort()
    assert(expected === actual)
  }

}
