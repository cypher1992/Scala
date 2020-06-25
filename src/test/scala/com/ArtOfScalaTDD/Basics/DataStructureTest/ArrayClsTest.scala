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
}
