package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.InsertionSort

class InsertionSortTest extends AnyFlatSpec with Matchers{


  "AlgoAndDataStructure InsertionSort: is.getList()" should "return List" in {
    val lst:List[Int] = List(4,51,6,2,77,3)
    val is:InsertionSort = new InsertionSort(lst)
    val actual:List[Int] = is.getList()
    val expected:List[Int] = List(4,51,6,2,77,3)

    assert(expected === actual)

  }

  "AlgoAndDataStructure InsertionSort: is.setList(newList)" should "return newList" in{
    val lst:List[Int] = List.empty[Int]
    val newList:List[Int] = List(1,34,663,36,2,324,68,9)
    val is:InsertionSort = new InsertionSort(lst)
    is.setList(newList)
    val actual:List[Int] = is.getList()
    val expected: List[Int] = List(1,34,663,36,2,324,68,9)
    assert(actual === expected)
  }

  "AlgoAndDataStructure InsertionSort: is.insertSortList()" should "return emptyList" in{
    val emptyLst:List[Int] = List.empty[Int]
    val is:InsertionSort = new InsertionSort(emptyLst)
    val actual:List[Int] = is.insertSortList()
    val expected: List[Int] = List.empty[Int]
    assert(actual === expected)
  }

  "AlgoAndDataStructure InsertionSort: is.insertSortList()" should "return List(1)" in{
    val lst:List[Int] = List(1)
    val is:InsertionSort = new InsertionSort(lst)
    val actual:List[Int] = is.insertSortList()
    val expected: List[Int] = List(1)
    assert(actual === expected)
  }

}
