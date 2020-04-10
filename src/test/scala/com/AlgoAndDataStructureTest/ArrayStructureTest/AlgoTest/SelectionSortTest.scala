package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.SelectionSort

class SelectionSortTest extends AnyFlatSpec with Matchers {

  "AlgoAndDataStructure: SelectionSort getList()" should "return list" in {
    val list:List[Int] = List(3,2,1)
    val ss:SelectionSort[Int] = new SelectionSort(list)
    val actual:List[Int] = ss.getList()
    val expected:List[Int] = List(3,2,1)
    assert(expected == actual)
  }

  "AlgoAndDataStructure: SelectionSort setList(list)" should "new list" in {
    val list:List[Int] = List.empty[Int]
    val newList:List[Int] = List(1,2,3)
    val ss:SelectionSort[Int] = new SelectionSort(list)
    val newSS:SelectionSort[Int] = ss.setList(newList)
    val actual:List[Int] = newSS.getList()
    val expected:List[Int] = List(1,2,3)
    assert(expected == actual)
  }

}
