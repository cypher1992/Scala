package com.ArtOfScalaTDD.Basics.FunctionalTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.Function

class FunctionalTest extends AnyFlatSpec with Matchers {

  "ArtOfScala Basics Functional: add(Double 3.0, Double 4.0)" should "return 7" in {
    val function:Function = new Function()
    val actual:Double = function.add(3.0,4.0)
    val expected:Double = 7
    assert(actual == expected)
  }

  "ArtOfScala Basics Functional: double(function.add(3.0,4.0), function.add(3.0,4.0))" should "return 28" in {
    val function:Function = new Function()
    val actual:Double = function.double(function.add(3.0,4.0),function.add(3.0,4.0))
    val expected:Double = 28
    assert(actual == expected)
  }

}
