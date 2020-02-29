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

  "AlgoAndDataStructure List: sort(Nil)" should "return Nil" in {
    val emptyList:List[Int] = List.empty[Int]
    val actual:List[Int] = listClass.sort(emptyList)
    val expected:List[Int] = List.empty[Int]

    assert(actual == expected)
  }

}
