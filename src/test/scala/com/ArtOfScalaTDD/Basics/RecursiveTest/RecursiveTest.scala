package com.ArtOfScalaTDD.Basics.RecursiveTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.Recursion


class RecursiveTest extends AnyFlatSpec with Matchers {

  "ArtofScala Recusion: MultiplyItSelf(0)" should "return 0" in {
    val recur:Recursion = new Recursion()
    val actual:Int = recur.multiplyItSelf(0)
    val expected:Int = 0
    assert(actual == expected)
  }

  "ArtofScala Recusion: MultiplyItSelf(1)" should "return 1" in {
    val recur:Recursion = new Recursion()
    val actual:Int = recur.multiplyItSelf(1)
    val expected:Int = 1
    assert(actual == expected)
  }

  "ArtofScala Recusion: MultiplyItSelf(2)" should "return 2" in {
    val recur:Recursion = new Recursion()
    val actual:Int = recur.multiplyItSelf(2)
    val expected:Int = 2
    assert(actual == expected)
  }


}
