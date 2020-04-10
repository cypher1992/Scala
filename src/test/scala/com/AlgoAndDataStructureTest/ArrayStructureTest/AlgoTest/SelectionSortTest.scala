package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.SelectionSort

class SelectionSortTest extends AnyFlatSpec with Matchers {

  "AlgoAndDataStructure: SelectionSort def getList()" should "return list" in {
    val list:List[Int] = List(3,2,1)
    val ss:SelectionSort = new SelectionSort(list)
    val actual:List[Int] = ss.getList()
    val expected:List[Int] = List(3,2,1)
    assert(expected == actual)
  }

}
