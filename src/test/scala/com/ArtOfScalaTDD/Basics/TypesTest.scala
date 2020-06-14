package com.ArtOfScalaTDD.Basics

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.Types

class TypesTest extends AnyFlatSpec with Matchers {

  "ArtOfScala Basics Types: initDouble(double)" should "return double" in {
    val types:Types = new Types()
    val actual:Double = types.initDouble(52.00)
    val expected:Double = 52.00
    types.print(actual)
    assert(expected == actual)
  }

  "ArtOfScala Basics Types: initFloat(float)" should "return float" in {
    val types:Types = new Types()
    val actual:Float = types.initFloat(3.2202F)
    val expected:Float = 3.2202F
    types.print(actual)
    assert(expected == actual)
  }

  "ArtOfScala Basics Types: initInteger(int)" should "return integer" in {
    val types:Types = new Types()
    val actual:Integer = types.initInteger(100)
    val expected:Integer = 100
    types.print(actual)
    assert(expected == actual)
  }

  "ArtOfScala Basics Types: initLong(long)" should "return long" in {
    val types:Types = new Types()
    val actual:Long = types.initLong(1000000)
    val expected:Long = 1000000
    types.print(actual)
    assert(expected == actual)
  }

  "ArtOfScala Basics Types: initShort(short)" should "return short" in {
    val types:Types = new Types()
    val actual:Short = types.initShort(10)
    val expected:Short = 10
    types.print(actual)
    assert(expected == actual)
  }

  "ArtOfScala Basics Types: initByte(byte)" should "return byte" in {
    val types:Types = new Types()
    val actual:Byte = types.initByte(126)
    val expected:Byte = 126
    types.print(actual)
    assert(expected == actual)
  }

}
