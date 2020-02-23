package com.AlgoAndDataStructureTest.ArrayStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import scala.collection.mutable.ArrayBuffer
import org.scalatest.Assertions._
import com.local.AlgoWithDataStructure.Data_Structure.ArrayStructure

class ArrayTest extends AnyFlatSpec with Matchers {
  val arrayObj:ArrayStructure = new ArrayStructure

  "AlgoAndDataStructureTest: multiply2(Arry(0...5))" should "return Array(0,2,4,6,8,10)" in {
    val array:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
    val actual:ArrayBuffer[Int] = arrayObj.multiply2(array)
    val expected:ArrayBuffer[Int]= ArrayBuffer(0,2,4,6,8,10)


    /*
    == vs ===
    Equals with == refers to the object location interms of hash
    Equals with === refers to the object context are the same
    */
    assert( actual === expected)
  }

  "AlgoAndDataStructureTest: mergeArrays(Arry(0...5),Array.Empty[Int]" should "return ArrayBuffer(0,1,2,3,4,5)" in {

    val array:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
    val array2:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:ArrayBuffer[Int] = arrayObj.mergeArray(array,array2)
    val expected:ArrayBuffer[Int] = ArrayBuffer(0,1,2,3,4,5)
    assert( actual === expected)

  }
  
  "AlgoAndDataStructureTest: mergeArrays(Arry(0...5),Array(0..3))" should "return ArrayBuffer(0,1,2,3,4,5,0,1,2,3)" in {

    val array:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
    val array2:ArrayBuffer[Int] = ArrayBuffer.range(0,4)
    val actual:ArrayBuffer[Int] = arrayObj.mergeArray(array,array2)
    val expected:ArrayBuffer[Int] = ArrayBuffer(0,1,2,3,4,5,0,1,2,3)
    assert( actual === expected)

  }

}
