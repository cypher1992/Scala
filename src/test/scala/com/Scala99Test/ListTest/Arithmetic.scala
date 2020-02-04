package com.Scala99Test.ListTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Projects.Resource.src.Scala99Arithmetic

class Arithmetic extends AnyFlatSpec with Matchers{

  val sl99:Scala99Arithmetic = new Scala99Arithmetic

  /*
  P31 (**) Determine whether a given integer number is prime.
  scala> 7.isPrime
  res0: Boolean = true

   def isPrime(num:Int):Boolean = {

      num match {
        case 1 | 2 | 3 => true
        case a if(num < 1) => false
        case b if(((num/2)%2) != 0) => true
        case _ => false
      }
    }

  */
  "Scala99Arithmetic Challenge: isPrime(-1)" should "Return: false" in{
    val actual:Boolean = sl99.isPrime(-1)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: isPrime(1)" should "Return: true" in{
    val actual:Boolean = sl99.isPrime(1)
    val expected:Boolean = true

    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: isPrime(4)" should "Return: false" in{
    val actual:Boolean = sl99.isPrime(4)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: isPrime(7)" should "Return: true" in{
    val actual:Boolean = sl99.isPrime(7)
    val expected:Boolean = true

    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: isPrime(9)" should "Return: false" in{
    val actual:Boolean = sl99.isPrime(9)
    val expected:Boolean = false

    assert(actual == expected)
  }

  /*
  P32 (**) Determine the greatest common divisor of two positive integer numbers.
  Use Euclid's algorithm.
  scala> gcd(36, 63)
  res0: Int = 9
  */

  "Scala99Arithmetic Challenge: gcd(-1,5)" should "return -1" in {

    val actual:Int = sl99.gcd(-1,5)
    val expected:Int = -1

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: gcd(1,-5)" should "return -1" in {

    val actual:Int = sl99.gcd(1,-5)
    val expected:Int = -1
    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: gcd(1,5)" should "return 1" in {

    val actual:Int = sl99.gcd(1,5)
    val expected:Int = 1
    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: gcd(35,10)" should "return 1" in {

    val actual:Int = sl99.gcd(35,10)
    val expected:Int = 5
    assert(actual == expected)
  }
}
