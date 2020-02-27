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

  "AlgoAndDataStructureTest: mergeArrays(Array.Empty[Int],Arry(0...5))" should "return ArrayBuffer(0,1,2,3,4,5)" in {

    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val array2:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
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

  "AlgoAndDataStructureTest: mergeArrayLambda(Arry(0...5),Array.Empty[Int]" should "return ArrayBuffer(0,1,2,3,4,5)" in {

    val array:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
    val array2:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:ArrayBuffer[Int] = arrayObj.mergeArrayLambda(array,array2)
    val expected:ArrayBuffer[Int] = ArrayBuffer(0,1,2,3,4,5)
    assert( actual === expected)

  }

  "AlgoAndDataStructureTest: mergeArrayLambda(Array.Empty[Int],Arry(0...5))" should "return ArrayBuffer(0,1,2,3,4,5)" in {

    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val array2:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
    val actual:ArrayBuffer[Int] = arrayObj.mergeArrayLambda(array,array2)
    val expected:ArrayBuffer[Int] = ArrayBuffer(0,1,2,3,4,5)
    assert( actual === expected)

  }


  "AlgoAndDataStructureTest: mergeArrayLambda(Arry(0...5),Array(0..3))" should "return ArrayBuffer(0,1,2,3,4,5,0,1,2,3)" in {

    val array:ArrayBuffer[Int] = ArrayBuffer.range(0,6)
    val array2:ArrayBuffer[Int] = ArrayBuffer.range(0,4)
    val actual:ArrayBuffer[Int] = arrayObj.mergeArrayLambda(array,array2)
    val expected:ArrayBuffer[Int] = ArrayBuffer(0,1,2,3,4,5,0,1,2,3)
    assert( actual === expected)

  }

  "AlgoAndDataStructureTest: exist(query, emptyArray)" should "return false" in {
    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:Boolean = arrayObj.exist(1,array)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: exist(query,ArrayBuffer)" should "return true" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:Boolean = arrayObj.exist(5,array)
    val expected:Boolean = true

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: exist(query,ArrayBuffer)" should "return false" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:Boolean = arrayObj.exist(45,array)
    val expected:Boolean = false

    assert(actual == expected)
  }


  "AlgoAndDataStructureTest: existLambda(query, emptyArray)" should "return false" in {
    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:Boolean = arrayObj.existLambda(1,array)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: existLambda(query,ArrayBuffer)" should "return true" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:Boolean = arrayObj.existLambda(5,array)
    val expected:Boolean = true

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: existLambda(query,ArrayBuffer)" should "return false" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:Boolean = arrayObj.existLambda(45,array)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: filter(query, emptyArray)" should "return emptyArray" in {
    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:ArrayBuffer[Int] = arrayObj.filter(1,array)
    val expected:ArrayBuffer[Int] = ArrayBuffer.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: filter(query,ArrayBuffer)" should "return ArrayBuffer(5,5)" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12,5)
    val actual:ArrayBuffer[Int] = arrayObj.filter(5,array)
    val expected:ArrayBuffer[Int] = ArrayBuffer(5,5)

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: filter(query,ArrayBuffer)" should "return ArrayBuffer()" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:ArrayBuffer[Int] = arrayObj.filter(45,array)
    val expected:ArrayBuffer[Int] = ArrayBuffer.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: filterLambda(query, emptyArray)" should "return emptyArray" in {
    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:ArrayBuffer[Int] = arrayObj.filterLambda(1,array)
    val expected:ArrayBuffer[Int] = ArrayBuffer.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: filterLambda(query,ArrayBuffer)" should "return ArrayBuffer(5,5)" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12,5)
    val actual:ArrayBuffer[Int] = arrayObj.filterLambda(5,array)
    val expected:ArrayBuffer[Int] = ArrayBuffer(5,5)

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: filterLambda(query,ArrayBuffer)" should "return ArrayBuffer()" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:ArrayBuffer[Int] = arrayObj.filterLambda(45,array)
    val expected:ArrayBuffer[Int] = ArrayBuffer.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: find(query,ArrayBuffer)" should "return None" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:Option[Int] = arrayObj.find(45,array)
    val expected:Option[Int] = None

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: find(query, emptyArray)" should "return None" in {
    val array:ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    val actual:Option[Int] = arrayObj.find(1,array)
    val expected:Option[Int] = None

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: find(query,ArrayBuffer)" should "return Some(5)" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12,5)
    val actual:Option[Int] = arrayObj.find(5,array)
    val expected:Option[Int] = Some(5)

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: findLambda(query,ArrayBuffer)" should "return None" in{
    val array:ArrayBuffer[Int] = ArrayBuffer(1,2,4,5,6,12)
    val actual:Option[Int] = arrayObj.findLambda(45,array)
    val expected:Option[Int] = None

    assert(actual == expected)
  }

  "AlgoAndDataStructureTest: delimit(',', Array[String].empty)" should "return Array()" in {

    val emptyArray:Array[String] = Array.empty[String]
    val actual:Array[Tuple2[Any,Any]] = arrayObj.delimit(",",emptyArray)
    val expected:Array[Tuple2[Any,Any]] = Array.empty[Tuple2[Any,Any]]

    assert(actual === expected)

  }

  "AlgoAndDataStructureTest: delimit(',', Array(\"BX,BLACKSTONE\",\"JPM,JP MORGAN\",\"C,CITI\",\"BAC,BANK OF AMERICA\",\"WFC,WELLS FARGO\"))" should "return Array((\"BX\",\"BLACKSTONE\"),(\"JPM\", \"JP MORGAN\"),(\"C\",\"CITI\"),(\"BAC\",\"BANK OF AMERICA\"),(\"WFC\",\"WELLS FARGO\"))" in {

    val emptyArray:Array[String] = Array("BX,BLACKSTONE","JPM,JP MORGAN","C,CITI","BAC,BANK OF AMERICA","WFC,WELLS FARGO")
    val actual:Array[Tuple2[Any,Any]] = arrayObj.delimit(",",emptyArray)
    val expected:Array[Tuple2[Any,Any]] = Array(("BX","BLACKSTONE"),("JPM", "JP MORGAN"),("C","CITI"),("BAC","BANK OF AMERICA"),("WFC","WELLS FARGO"))

    assert(actual === expected)

  }


}
