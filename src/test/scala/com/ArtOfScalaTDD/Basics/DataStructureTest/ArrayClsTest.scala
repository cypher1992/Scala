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

  "ArtOfScala ArrayCls: emptyArray.mkStringX()" should "empty String" in {
    val array: Array[Int] =  Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:String = arr.mkStringX()
    val expected:String = array.mkString
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.mkStringX()" should "2468" in {
    val array: Array[Int] =  Array(2,4,6,8)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:String = arr.mkStringX()
    val expected:String = array.mkString
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.reverseX()" should "Array(8,6,4,2)" in {
    val array: Array[Int] =  Array(2,4,6,8)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int]= arr.reverseX()
    val expected:Array[Int] = Array(8,6,4,2)
    assert(actual === expected)
  }


  "ArtOfScala ArrayCls: array.reverseX()" should "Array(8,8,4,4)" in {
    val array: Array[Int] =  Array(4,4,8,8)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int]= arr.reverseX()
    val expected:Array[Int] = Array(8,8,4,4)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.reverseX()" should "Array(2,2,2,2)" in {
    val array: Array[Int] =  Array(2,2,2,2)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int]= arr.reverseX()
    val expected:Array[Int] = Array(2,2,2,2)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.reverseX()" should "Array.empty[Int]" in {
    val array: Array[Int] =  Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Int]= arr.reverseX()
    val expected:Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.toListX()" should "List(2,4,6,8)" in {
    val array: Array[Int] =  Array(2,4,6,8)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:List[Int]= arr.toListX()
    val expected:List[Int] = List(2,4,6,8)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.toListX()" should "List.empty[Int]" in {
    val array: Array[Int] =  Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:List[Int]= arr.toListX()
    val expected:List[Int] = List.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.zipX(array)" should "Array((1,5),(2,4),(3,3),(4,2),(5,1)" in {
    val array: Array[Int] =  Array(1,2,3,4,5)
    val arrayReverse: Array[Int] =  Array(1,2,3,4,5).reverse
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Tuple2[Int,Int]] = arr.zipX(arrayReverse)
    val expected:Array[Tuple2[Int,Int]] = Array((1,5),(2,4),(3,3),(4,2),(5,1))
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.zipX(arrayEmpty)" should "Array()" in {
    val array: Array[Int] =  Array(1,2,3,4,5)
    val arrayEmpty: Array[Int] =  Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Tuple2[Int,Int]] = arr.zipX(arrayEmpty)
    val expected:Array[Tuple2[Int,Int]] = Array()
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: arrayEmpty.zipX(array)" should "Array()" in {
    val array: Array[Int] =  Array.empty[Int]
    val arrayEmpty: Array[Int] = Array(1,2,3,4,5)
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Tuple2[Int,Int]] = arr.zipX(arrayEmpty)
    val expected:Array[Tuple2[Int,Int]] = Array()
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: arrayEmpty.zipX(array)" should "arrayEmpty" in {
    val array: Array[Int] =  Array.empty[Int]
    val arrayEmpty: Array[Int] = Array.empty[Int]
    val arr:ArrayCLS[Int] = new ArrayCLS(array)
    val actual:Array[Tuple2[Int,Int]] = arr.zipX(arrayEmpty)
    val expected:Array[Tuple2[Int,Int]] = Array()
    assert(actual === expected)
  }


  "ArtOfScala ArrayCls: array.zipWithIndeX()" should "Array(('A',0),('B',1),('C',2))" in {
    val array: Array[Char] =  Array('A','B','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Tuple2[Char,Int]] = arr.zipWithIndeX()
    val expected:Array[Tuple2[Char,Int]] = Array(('A',0),('B',1),('C',2))
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.zipWithIndeX()" should "Array(('A',0))" in {
    val array: Array[Char] =  Array('A')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Tuple2[Char,Int]] = arr.zipWithIndeX()
    val expected:Array[Tuple2[Char,Int]] = Array(('A',0))
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.zipWithIndeX()" should "Array.empty[Tuple2[Char,Int]]" in {
    val array: Array[Char] =  Array()
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Tuple2[Char,Int]] = arr.zipWithIndeX()
    val expected:Array[Tuple2[Char,Int]] = Array.empty[Tuple2[Char,Int]]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.countX()" should "1" in {
    val array: Array[Char] =  Array('A','B','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.countX('A')
    val expected:Int = 1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.countX()" should "2" in {
    val array: Array[Char] =  Array('A','B','C','A')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.countX('A')
    val expected:Int = 2
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.countX()" should "3" in {
    val array: Array[Char] =  Array('A','B','a','C','A','A')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.countX('A')
    val expected:Int = 3
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.countX()" should "0" in {
    val array: Array[Char] =  Array('a','B','a','C','a','a')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.countX('A')
    val expected:Int = 0
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.dropWhileX()" should "Array('B','C')" in {
    val array: Array[Char] =  Array('A','B','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.dropWhileX('A')
    val expected:Array[Char] = Array('B','C')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.dropWhileX()" should "Array('B','C','A')" in {
    val array: Array[Char] =  Array('A','B','C','A')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.dropWhileX('A')
    val expected:Array[Char] = Array('B','C','A')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.dropWhileX('a')" should "Array('B','C')" in {
    val array: Array[Char] =  Array('a','B','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.dropWhileX('a')
    val expected:Array[Char] = Array('B','C')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.existX('C')" should "true" in {
    val array: Array[Char] =  Array('a','B','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Boolean = arr.existX('C')
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.existX('C')" should "false" in {
    val array: Array[Char] =  Array('a','B','c')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Boolean = arr.existX('C')
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.existX('C')" should "false" in {
    val array: Array[Char] =  Array.empty[Char]
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Boolean = arr.existX('C')
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.filterX('C')" should "Array('A','B')" in {
    val array: Array[Char] =  Array('A','C','B')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.filterX('C')
    val expected:Array[Char] = Array('A','B')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.filterX('c')" should "Array('A','C','B')" in {
    val array: Array[Char] =  Array('A','C','B')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.filterX('c')
    val expected:Array[Char] = Array('A','C','B')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.filterX('c')" should "Array()" in {
    val array: Array[Char] =  Array.empty[Char]
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.filterX('c')
    val expected:Array[Char] = Array.empty[Char]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.filterNot('C')" should "Array('A','B')" in {
    val array: Array[Char] =  Array('A','C','B')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.filterNotX('C')
    val expected:Array[Char] = Array('A','B')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.filterNot('c')" should "Array('A','C','B')" in {
    val array: Array[Char] =  Array('A','C','B')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.filterNotX('c')
    val expected:Array[Char] = Array('A','C','B')
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.filterNot('c')" should "Array.empty[Char]" in {
    val array: Array[Char] =  Array.empty[Char]
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Array[Char] = arr.filterNotX('c')
    val expected:Array[Char] = Array.empty[Char]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.forAllX('c')" should "true" in {
    val array: Array[Char] =  Array('c','c','c')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Boolean = arr.forAllX('c')
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.forAllX('c')" should "false" in {
    val array: Array[Char] =  Array('c','A','c')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Boolean = arr.forAllX('c')
    val expected:Boolean = false
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.forAllX('c')" should "true" in {
    // this is broken
    // where all instance of an empty array is true
    val array: Array[Char] =  Array.empty[Char]
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Boolean = arr.forAllX('c')
    val expected:Boolean = true
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.indexWhereX('c')" should "-1" in {
    val array: Array[Char] =  Array.empty[Char]
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.indexWhereX('c')
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.indexWhereX('C)" should "0" in {
    val array: Array[Char] =  Array('C','A','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.indexWhereX('C')
    val expected:Int = 0
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.indexWhereX('A)" should "1" in {
    val array: Array[Char] =  Array('C','A','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.indexWhereX('A')
    val expected:Int = 1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.lastIndexWhereX('c')" should "-1" in {
    val array: Array[Char] =  Array.empty[Char]
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.lastIndexWhereX('c')
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.lastIndexWhereX('C)" should "2" in {
    val array: Array[Char] =  Array('C','A','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.lastIndexWhereX('C')
    val expected:Int = 2
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.lastIndexWhereX('A)" should "1" in {
    val array: Array[Char] =  Array('C','A','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.lastIndexWhereX('A')
    val expected:Int = 1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.lastIndexWhereX('B)" should "-1" in {
    val array: Array[Char] =  Array('C','A','C')
    val arr:ArrayCLS[Char] = new ArrayCLS(array)
    val actual:Int = arr.lastIndexWhereX('B')
    val expected:Int = -1
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.map(2x)" should "Array(2)" in {
    val array: Array[Int] = Array(1)
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def twoTimes(int: Int): Int = int * 2
    val actual: Array[Int] = arr.mapX(twoTimes)
    val expected: Array[Int] = Array(2)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.map(2x)" should "Array(2,4)" in {
    val array: Array[Int] = Array(1, 2)
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def twoTimes(int: Int): Int = int * 2
    val actual: Array[Int] = arr.mapX(twoTimes)
    val expected: Array[Int] = Array(2, 4)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.map(2x)" should "emptyArray" in {
    val array: Array[Int] = Array.empty[Int]
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def twoTimes(int: Int): Int = int * 2
    val actual: Array[Int] = arr.mapX(twoTimes)
    val expected: Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.partionX(lessThan10)" should "Array.empty[Int]" in {
    val array: Array[Int] = Array.empty[Int]
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def lessThan10(int: Int):Boolean = if(int< 10) true else false
    val actual: Array[Int] = arr.partionX(lessThan10)._1
    val expected: Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: emptyArray.partionX(lessThan10)" should "Second Tuple return Array.empty[Int]" in {
    val array: Array[Int] = Array.empty[Int]
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def lessThan10(int: Int):Boolean = if(int< 10) true else false
    val actual: Array[Int] = arr.partionX(lessThan10)._2
    val expected: Array[Int] = Array.empty[Int]
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.partionX(lessThan10)" should "Array(1)" in {
    val array: Array[Int] = Array(1,10)
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def lessThan10(int: Int):Boolean = if(int< 10) true else false
    val actual: Array[Int] = arr.partionX(lessThan10)._1
    val expected: Array[Int] = Array(1)
    assert(actual === expected)
  }

  "ArtOfScala ArrayCls: array.partionX(lessThan10)" should "Second Tuple return Array(1)" in {
    val array: Array[Int] = Array(1,10)
    val arr: ArrayCLS[Int] = new ArrayCLS(array)
    def lessThan10(int: Int):Boolean = if(int< 10) true else false
    val actual: Array[Int] = arr.partionX(lessThan10)._2
    val expected: Array[Int] = Array(10)
    assert(actual === expected)
  }
}
