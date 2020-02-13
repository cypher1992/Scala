package com.Scala99Test.ListTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Projects.Resource.src.Scala99Logica1


class Logica1 extends AnyFlatSpec with Matchers {

  val sl99:Scala99Logica1 = new Scala99Logica1
  def equalityTest[T](actual:T,expected:T):Boolean = actual == expected

  "Logical: equalityTestFunc(true,true)" should "reture true" in {
    val booleanStmt:Boolean = equalityTest(true,true)
    val expected:Boolean = true
    assert(booleanStmt == expected)
  }

  "Scala99Logical Challenge: and(false,true)" should "return false" in {
    val actual:Boolean = sl99.and(false,true)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: and(true,true)" should "return true" in {
    val actual:Boolean = sl99.and(true,true)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: or(false,true)" should "return true" in {
    val actual:Boolean = sl99.or(false,true)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: or(false,false)" should "return false" in {
    val actual:Boolean = sl99.or(false,false)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: or(true,false)" should "return true" in {
    val actual:Boolean = sl99.or(true,false)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: nand(true,false)" should "return true" in {
    val actual:Boolean = sl99.nand(true,false)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: nand(true,true)" should "return false" in {
    val actual:Boolean = sl99.nand(true,true)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

}
