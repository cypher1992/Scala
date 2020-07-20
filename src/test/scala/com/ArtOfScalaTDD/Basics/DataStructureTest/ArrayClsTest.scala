package com.ArtOfScalaTDD.Basics.DataStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.DataStructure.ArrayCLS

class ArrayClsTest extends AnyFlatSpec with Matchers{

  "ArtOfScala ArrayCls: instanceOfArrayCls" should "Return true" in {
    val array:Array[Int] = new Array[Int](3)
    val arrCls:ArrayCLS[Int] = new ArrayCLS(array)
    assert( arrCls.isInstanceOf[ArrayCLS[Int]] )
  }

  "ArtOfScala ArrayCls: getArr()" should "return EmptyArray[Int]" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val expected: Array[Int] = new Array[Int](3)
    val actual: Array[Int] = arrCls.getArr()
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: setArr(newArry)" should "return Array(3)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val expected: Array[Int] =  Array[Int](3)
    val newArray: Array[Int] =  Array[Int](3)
    arrCls.setArr(newArray)
    val actual: Array[Int] = arrCls.getArr()
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: addIndex(2,0)" should "return Array(3,0,0)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    arrCls.addIndex(2,0)
    val actual:Array[Int] = arrCls.getArr()
    val expected:Array[Int] = Array(2,0,0)
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: addIndex(2,-1)" should "return Array(0,0,0)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    arrCls.addIndex(2,-1)
    val actual:Array[Int] = arrCls.getArr()
    val expected:Array[Int] = Array(0,0,0)
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: addIndex(2,3)" should "return Array(0,0,0)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    arrCls.addIndex(2,3)
    val actual:Array[Int] = arrCls.getArr()
    val expected:Array[Int] = Array(0,0,0)
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: addIndex(2,2)" should "return Array(0,0,2)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    arrCls.addIndex(2,2)
    val actual:Array[Int] = arrCls.getArr()
    val expected:Array[Int] = Array(0,0,2)
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: size()" should "return 3" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.size()
    val expected:Int = 3
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: size()" should "return 0" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.size()
    val expected:Int = 0
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: array.head()" should "return 0" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.head()
    val expected:Int = 0
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: emptyArray.head()" should "throws java.util.NoSuchElementException" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    assertThrows[java.util.NoSuchElementException] {
      val actual: Int = arrCls.head()
    }
  }

  "ArtOfScala ArrayCls: array.tail()" should "return Array(0,0)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.tail()
    val expected:Array[Int] = Array(0,0)
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: emptyArray.tail()" should "throws java.lang.UnsupportedOperationException" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    assertThrows[java.lang.UnsupportedOperationException] {
      arrCls.tail()
    }
  }

  "ArtOfScala ArrayCls: array.isEmpty()" should "return False" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.isEmpty()
    val expected:Boolean = false
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: array.nonEmptyX()" should "return true)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.nonEmptyX()
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.nonEmptyX()" should "return false)" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.nonEmptyX()
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.startsWithX(Array(1,2,3))" should "return True)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val testArray:Array[Int] = Array(1,2,3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.startsWithX(testArray)
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.startsWithX(Array(9,8,7))" should "return false" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val testArray:Array[Int] = Array(9,8,7)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.startsWithX(testArray)
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.startsWithX(Array(9,8,7))" should "return false" in {
    val array: Array[Int] = Array.empty[Int]
    val testArray:Array[Int] = Array(9,8,7)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.startsWithX(testArray)
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.startsWithX(Array.empty[Int])" should "return true" in {
    val array: Array[Int] = Array.empty[Int]
    val testArray:Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.startsWithX(testArray)
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.indexOfX(3)" should "return 2" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.indexOfX(3)
    val expected:Int = 2
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.indexOfX(10)" should "return -1)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.indexOfX(10)
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.indexOfX(3)" should "return -1" in {
    val array: Array[Int] =  Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.indexOfX(3)
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.lastIndexOfX(3)" should "return 2" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,2,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.lastIndexOfX(2)
    val expected:Int = 6
    assert(actual === expected)
  }


  "ArtOfScala ArrayCls: array.lastIndexOfX(10)" should "return -1)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.lastIndexOfX(10)
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.lastIndexOfX(10)" should "return -1)" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.lastIndexOfX(10)
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.endWithX(Array(9,8,7))" should "return false)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val testArray:Array[Int] = Array(9,8,7)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.endWithX(testArray)
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.endWithX(Array(2,1))" should "return false)" in {
    val array: Array[Int] = Array.empty[Int]
    val testArray:Array[Int] = Array(2,1)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.endWithX(testArray)
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.endWithX(Array(2,1))" should "return true)" in {
    val array: Array[Int] = Array.empty[Int]
    val testArray:Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.endWithX(testArray)
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.containsX(0)" should "return true" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.containsX(0)
    val expected:Boolean = true
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: array.containsX(1)" should "return false" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.containsX(1)
    val expected:Boolean = false
    assert(expected === actual)
  }


  "ArtOfScala ArrayCls: emptyarray.containsX(0)" should "return false" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Boolean = arrCls.containsX(0)
    val expected:Boolean = false
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: emptyArray.isEmpty()" should "return false" in {
    val emptyArray: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(emptyArray)
    val actual:Boolean = arrCls.isEmpty()
    val expected:Boolean = true
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: array.lastX()" should "return 0" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Int = arrCls.lastX()
    val expected:Int = 0
    assert(expected === actual)
  }

  "ArtOfScala ArrayCls: emptyArray.lastX()" should "throws java.util.NoSuchElementException" in {
    val emptyArray: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(emptyArray)
    assertThrows[java.util.NoSuchElementException] {
      val actual: Int = arrCls.lastX()
    }
  }

  "ArtOfScala ArrayCls: array.sliceX(0,2)" should "return Array(0,0)" in {
    val array: Array[Int] = new Array[Int](3)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.sliceX(0,2)
    val expected:Array[Int] = Array(0,0)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.sliceX(0,1)" should "returns EmptyArray" in {
    val emptyArray: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(emptyArray)
    val actual:Array[Int] = arrCls.sliceX(0,1)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.takeX(3)" should "return Array(1,2,3)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.takeX(3)
    val expected:Array[Int] = Array(1,2,3)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.takeX(3)" should "return Array.empty[Int]" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.takeX(3)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.takeRightX(3)" should "return Array(7,8,9)" in {
    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.takeRightX(3)
    val expected:Array[Int] = Array(7,8,9)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.takeRightX(3)" should "return Array.empty[Int]" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.takeRightX(3)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.splitAtX(5)" should "return (Array(0,1,2,3,4),Array(5,6,7,8,9))" in {
    val array: Array[Int] = Array(0,1,2,3,4,5,6,7,8,9)
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arrCls.splitAtX(5)._1
    val expected:Array[Int] = Tuple2(Array(0,1,2,3,4),Array(5,6,7,8,9))._1
    val actual2:Array[Int] = arrCls.splitAtX(5)._2
    val expected2:Array[Int] = Tuple2(Array(0,1,2,3,4),Array(5,6,7,8,9))._2
    val isTrue:Boolean = actual === expected && actual2 === expected2
    assert(isTrue)
  }

  "ArtOfScala ArrayCls: emptyarray.splitAtX(5)" should "return ()" in {
    val array: Array[Int] = Array.empty[Int]
    val arrCls: ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int]= arrCls.splitAtX(5)._1
    val expected:Array[Int] = (Array.empty[Int],Array.empty[Int])._1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.initX()" should "return (Array(0,1,2,3,4,5,6,7))" in {
    val array: Array[Int] = Array(0,1,2,3,4,5,6,7,8,9)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    arr.setArr(arr.initX)
    val actual:Array[Int] = arr.initX
    val expected:Array[Int] = Array(0,1,2,3,4,5,6,7)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.initX()" should "Throws [UnsupportedOperationException]" in {
    val array: Array[Int] = Array()
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    assertThrows[UnsupportedOperationException]{
      arr.initX
    }
  }

  "ArtOfScala ArrayCls: array.dropX(2)" should "return (Array(2,3,4,5,6,7,8,9))" in {
    val array: Array[Int] = Array(0,1,2,3,4,5,6,7,8,9)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.dropX(2)
    val expected:Array[Int] = Array(2,3,4,5,6,7,8,9)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.dropX(2)" should "expected Array.empty[Int]." in {
    val array: Array[Int] = Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.dropX(2)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.diffX(anotherArray)" should "expected Array(4)" in {
    val array: Array[Int] = Array(1,2,4)
    val anotherArray:Array[Int] = Array(1,2,3)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.diffX(anotherArray)
    val expected:Array[Int] = Array(4)
    assert(actual === expected)
  }


  "ArtOfScala ArrayCls: array.diffX(sameArray)" should "expected Array.empty[Int]" in {
    val array: Array[Int] = Array(1,2,4)
    val anotherArray:Array[Int] = Array(1,2,4)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.diffX(anotherArray)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.diffX(sameArray)" should "Array.empty[Int]" in {
    val array: Array[Int] =  Array.empty[Int]
    val anotherArray:Array[Int] = Array(1,2,4)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.diffX(anotherArray)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.diffX(emptyArray)" should "Array.empty[Int]" in {
    val array: Array[Int] =  Array.empty[Int]
    val anotherArray:Array[Int] = Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.diffX(anotherArray)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.mkStringX(emptyArray)" should "String" in {
    val array: Array[Int] =  Array.empty[Int]
    val anotherArray:Array[Int] = Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int] = arr.diffX(anotherArray)
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

}
