package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.BubbleSort

class BubbleSortTest extends AnyFlatSpec  with Matchers {

  "AlgoAndDataStructure BubbleSort: getList()" should "return list" in {
    val emptyList:List[Int] = List.empty[Int]
    val bs:BubbleSort = new BubbleSort(emptyList)
    val expected:List[Int] = List.empty[Int]
    val actual:List[Int] = bs.getList()

    assert(expected === actual)
  }

  "AlgoAndDataStructure BubbleSort: setList()" should "return Unit" in {
    val emptyList:List[Int] = List.empty[Int]
    val list:List[Int] = List(1)
    val bs:BubbleSort = new BubbleSort(emptyList)
    bs.setList(list)
    val expected:List[Int] = List(1)
    val actual:List[Int] = bs.getList()

    assert(expected === actual)
  }


}
