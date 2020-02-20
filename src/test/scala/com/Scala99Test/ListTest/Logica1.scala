package com.Scala99Test.ListTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Projects.Resource.src.Scala99Logica1


class Logica1 extends AnyFlatSpec with Matchers {

  val sl99:Scala99Logica1 = new Scala99Logica1
  def equalityTest[T](actual:T,expected:T):Boolean = actual == expected

  /*
    P46 (**) Truth tables for logical expressions.
    Define functions and, or, nand, nor, xor, impl, and equ (for logical equivalence) which return true or false according to the result of their respective operations; e.g. and(A, B) is true if and only if both A and B are true.
    scala> and(true, true)
    res0: Boolean = true

    scala> xor(true. true)
    res1: Boolean = false
  */

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

  "Scala99Logical Challenge: equ(true,true)" should "return true" in {
    val actual:Boolean = sl99.equ(true,true)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: equ(false,false)" should "return true" in {
    val actual:Boolean = sl99.equ(false,false)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: xor(true,true)" should "return false" in {
    val actual:Boolean = sl99.xor(true,true)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: xor(false,true)" should "return false" in {
    val actual:Boolean = sl99.xor(false,true)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: xor(false,false)" should "return false" in {
    val actual:Boolean = sl99.xor(false,false)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: impl(true,true)" should "return true" in {
    val actual:Boolean = sl99.impl(true,true)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: impl(false,true)" should "return true" in {
    val actual:Boolean = sl99.impl(false,true)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: impl(false,true)" should "return false" in {
    val actual:Boolean = sl99.impl(true,false)
    val expected:Boolean = false

    assert(equalityTest(actual,expected))
  }

  "Scala99Logical Challenge: impl(false,false)" should "return true" in {
    val actual:Boolean = sl99.impl(false,false)
    val expected:Boolean = true

    assert(equalityTest(actual,expected))
  }

  /*P46
    Now, write a function called table2 which prints the truth table of a given logical expression in two variables.

    scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
    A     B     result
    true  true  true
    true  false true
    false true  false
    false false false
  */

  "Scala99Logical Challenge: table2((a: Boolean, b: Boolean) => sl99.and(a, sl99.or(a, b)))" should "return table" in {

    sl99.table2((a: Boolean, b: Boolean) => sl99.and(a, sl99.or(a, b)))
  }

  /*
    P47 (*) Truth tables for logical expressions (2).
    Continue problem P46 by redefining and, or, etc as operators. (i.e. make them methods of a new class with an implicit conversion from Boolean.) not will have to be left as a object method.
    scala> table2((a: Boolean, b: Boolean) => a and (a or not(b)))
    A     B     result
    true  true  true
    true  false true
    false true  false
    false false false

  */

  "Scala99Logical Challenge: table2((a: Boolean, b: Boolean) => a and (a or not(b)))" should "return table" in {

    sl99.table2((a: Boolean, b: Boolean) => sl99.and(a,sl99.or(a,!b)))
  }

  "Scala99Logical Challenge: grey(1)" should "return List(0,1)" in {
    val actual:List[String] = sl99.grey(0)
    val expected:List[String] = List("0","1")

    assert(actual == expected)
  }

}
