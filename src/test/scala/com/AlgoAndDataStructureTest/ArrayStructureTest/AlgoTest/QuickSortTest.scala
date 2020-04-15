package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.QuickSort

class QuickSortTest extends AnyFlatSpec with Matchers {

  "AlgoAndDataStructure QuickSort: qs.getList()" should "return List" in {
      val lst:List[Int] = List(4,51,6,2,77,3)
      val qs:QuickSort = new QuickSort(lst)
      val actual:List[Int] = qs.getList()
      val expected:List[Int] = List(4,51,6,2,77,3)

      assert(expected === actual)

  }

  "AlgoAndDataStructure QuickSort: qs.setList(newList)" should "return newList" in{
    val lst:List[Int] = List.empty[Int]
    val newList:List[Int] = List(1,34,663,36,2,324,68,9)
    val qs:QuickSort = new QuickSort(lst)
    qs.setList(newList)
    val actual:List[Int] = qs.getList()
    val expected: List[Int] = List(1,34,663,36,2,324,68,9)
    assert(actual === expected)
  }

}
