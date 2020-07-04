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

  "ArtOfScala ArrayCls: emptyArray.isEmpty()" should "return True" in {
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

}
