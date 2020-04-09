package com.AlgoAndDataStructureTest.ArrayStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.ListStructure

class ListTest extends AnyFlatSpec  with Matchers {

  val listClass:ListStructure = new ListStructure

  "AlgoAndDataStructure List: add(5,List.empty[Int])" should "return List(5)" in{

    val index:Int = 5
    val emptyList:List[Int] = List.empty[Int]
    val actual:List[Int] = listClass.append(index,emptyList)
    val expected:List[Int] = List(5)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: add(5,List(5,6,5))" should "return List(5,6,5,5)" in{

    val index:Int = 5
    val list:List[Int] = List(5,6,5)
    val actual:List[Int] = listClass.append(index,list)
    val expected:List[Int] = List(5,6,5,5)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: remove(5,List())" should "return List()" in{

    val index:Int = 5
    val list:List[Int] = List.empty[Int]
    val actual:List[Int] = listClass.remove(index,list)
    val expected:List[Int] = List.empty[Int]

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: remove(5,List(5,5,6,8,9,5))" should "return List(6,8,9)" in{

    val index:Int = 5
    val list:List[Int] = List(5,5,6,8,9,5)
    val actual:List[Int] = listClass.remove(index,list)
    val expected:List[Int] = List(6,8,9)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: removeLambda(5,List())" should "return List()" in{

    val index:Int = 5
    val list:List[Int] = List.empty[Int]
    val actual:List[Int] = listClass.removeLambda(index,list)
    val expected:List[Int] = List.empty[Int]

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: removeLambda(5,List(5,5,6,8,9,5))" should "return List(6,8,9)" in{

    val index:Int = 5
    val list:List[Int] = List(5,5,6,8,9,5)
    val actual:List[Int] = listClass.removeLambda(index,list)
    val expected:List[Int] = List(6,8,9)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: insertAt(100,List(10,25),101)" should "throw error" in {

    val position:Int = 100
    val list:List[Int] = List(10,25)
    val insert:Int = 101

    assertThrows[java.lang.IndexOutOfBoundsException]{listClass.insertAt(position,list,insert)}

  }

  "AlgoAndDataStructure List: insertAt(1,List(10,25),325)" should "return List(10,325,20)" in {
    val position:Int = 1
    val list:List[Int] = List(10,25)
    val insert:Int = 325
    val actual:List[Int] = listClass.insertAt(position,list,insert)
    val expected: List[Int] = List(10,325,25)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: insertAt(0,List(10,25),325)" should "return List(325,10,20)" in {
    val position:Int = 0
    val list:List[Int] = List(10,25)
    val insert:Int = 325
    val actual:List[Int] = listClass.insertAt(position,list,insert)
    val expected: List[Int] = List(325,10,25)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: insertAt(0,List(10,25),325)" should "return List(10,20,325)" in {
    val position:Int = 2
    val list:List[Int] = List(10,25)
    val insert:Int = 325
    val actual:List[Int] = listClass.insertAt(position,list,insert)
    val expected: List[Int] = List(10,25,325)

    assert(actual == expected)

  }

  "AlgoAndDataStructure List: sortLamdbda(Nil)" should "return Nil" in {
    val emptyList:List[Int] = List.empty[Int]
    val actual:List[Int] = listClass.sortLamdbda(emptyList)
    val expected:List[Int] = List.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructure List: sortLamdbda(List(5,675,2,64,22,-4))" should "return List(-4,2,5,22,64,675)" in {
    val list:List[Int] = List(5,675,2,64,22,-4)
    val actual:List[Int] = listClass.sortLamdbda(list)
    val expected:List[Int] = List(-4,2,5,22,64,675)

    assert(actual == expected)
  }

  "AlgoAndDataStructure List: sort(emptyList,true)" should "return Nil" in{
    val emptyList:List[Int] = List.empty[Int]
    val ascend:Boolean = true
    val actual:List[Int] = listClass.sort(emptyList,ascend)
    val expected:List[Int] = List.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructure List: sort(list(5,1,7,65,24,14,52))" should "return List(1,5,7,14,24,52,65)" in {
    val list:List[Int] = List(5,1,7,65,24,14,52)
    val actual:List[Int] = listClass.sort(list)
    val expected:List[Int] = List(1,5,7,14,24,52,65)

    assert(actual == expected)
  }

  "AlgoAndDataStructure List: sort(list(5,1,7,65,24,14,52))" should "return List(65,52,24,7,14,5,1)" in {
    val list:List[Int] = List(5,1,7,65,24,14,52)
    val actual:List[Int] = listClass.sort(list,false)
    val expected:List[Int] = List(1,5,7,14,24,52,65).reverse

    assert(actual == expected)
  }

  "AlgoAndDataStructure List: slidingWindow(emptyList,2,1)" should "return List.empty[List[Int]]" in {
    val emptylist:List[Int] = List.empty[Int]
    val actual:List[List[Int]] = listClass.slidingWindow(emptylist,2,1)
    val expected:List[List[Int]] = List.empty[List[Int]]

    assert(expected == actual)

  }

  "AlgoAndDataStructure List: slidingWindow(list,2,1)" should "return List(List(1,2),List(3))" in {
    val list:List[Int] = List(1,2,3)
    val actual:List[List[Int]] = listClass.slidingWindow(list,2,1)
    val expected:List[List[Int]] = List(List(1,2),List(2,3))
    assert(expected == actual)
  }


}
