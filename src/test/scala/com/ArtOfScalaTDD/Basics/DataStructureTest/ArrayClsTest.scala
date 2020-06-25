package com.ArtOfScalaTDD.Basics.DataStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.DataStructure.ArrayCLS

class ArrayClsTest extends AnyFlatSpec with Matchers{

  "ArtOfScala ArrayCls: test instanceOfArrayCls" should "Return true" in {
    val array:Array[Int] = new Array[Int](3)
    val arrCls:ArrayCLS[Int] = new ArrayCLS(array)
    assert( arrCls.isInstanceOf[ArrayCLS[Int]] )
  }
}
