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
    val actual:List[Int] = ms.mergeSort()
    val expected:List[Int] = List.empty[Int]

    assert(expected === actual)
  }

  "AlgoAndDataStructure MergeSort: mergeSort(1vallist)" should "return 1vallist" in {
    val oneValList:List[Int] = List(1)
    val ms:MergeSort = new MergeSort(oneValList)
    val actual:List[Int] = ms.mergeSort()
    val expected:List[Int] = List(1)

    assert(expected === actual)
  }

  "AlgoAndDataStructure MergeSort: mergeSort(list)" should "return sortedList" in {
    val oneValList:List[Int] = List(5,4,3,2,1)
    val ms:MergeSort = new MergeSort(oneValList)
    val actual:List[Int] = ms.mergeSort()
    val expected:List[Int] = List(1,2,3,4,5)

    assert(expected === actual)
  }

}
