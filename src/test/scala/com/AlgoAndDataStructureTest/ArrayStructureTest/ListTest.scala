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
  
}
