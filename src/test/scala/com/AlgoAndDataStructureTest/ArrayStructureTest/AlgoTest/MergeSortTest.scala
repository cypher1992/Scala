package com.AlgoAndDataStructureTest.ArrayStructureTest.AlgoTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Algo.MergeSort
class MergeSortTest extends AnyFlatSpec with Matchers{

  "AlgoAndDataStructure MergeSort: getList()" should "return list" in {
    val emptyList:List[Int] = List.empty[Int]
    val ms:MergeSort = new MergeSort(emptyList)
    val expected:List[Int] = List.empty[Int]
    val actual:List[Int] = ms.getList()

    assert(expected === actual)
  }

  "AlgoAndDataStructure MergeSort: setList()" should "return Unit" in {
    val emptyList:List[Int] = List.empty[Int]
    val list:List[Int] = List(1)
    val ms:MergeSort = new MergeSort(emptyList)
    ms.setList(list)
    val expected:List[Int] = List(1)
    val actual:List[Int] = ms.getList()

    assert(expected === actual)
  }


  "AlgoAndDataStructure MergeSort: mergeSort(emptyList)" should "return emptyList" in {
    val emptyList:List[Int] = List.empty[Int]
    val ms:MergeSort = new MergeSort(emptyList)
    val actual:List[Int] = ms.mergeSort(emptyList)
    val expected:List[Int] = List.empty[Int]

    assert(expected === actual)
  }

}
