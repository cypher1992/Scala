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
  

}
