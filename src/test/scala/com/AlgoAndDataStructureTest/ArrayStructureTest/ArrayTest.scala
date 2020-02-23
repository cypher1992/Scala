package com.AlgoAndDataStructureTest.ArrayStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.AlgoWithDataStructure.Data_Structure.ArrayStructure

class ArrayTest extends AnyFlatSpec with Matchers {
  val arrayObj:ArrayStructure = new ArrayStructure

  "AlgoAndDataStructureTest: multiply2(Arry(0...5))" should "return Array(0,2,4,6,8,10)" in {
    val array:Array[Int] = Array.range(0,6)
    val actual:Array[Int] = arrayObj.multiply2(array)
    val expected:Array[Int]= Array(0,2,4,6,8,10)

    assert( actual === expected)
  }

}
