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
        case b if((num%(num/2)) != 0) => true
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

  "Scala99Arithmetic Challenge: range of prime between 2 to 1000 isPrime()" should "Return: 168 true" in{
    var list:List[Boolean] = List.empty[Boolean]

    for(n <- 2 to 1000){
      if(sl99.isPrime(n) == true){
        list = list.appended(sl99.isPrime(n))
      }
    }
    val actual:Int = list.size
    val expected:Int = 168

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


  /*
   P33 (*) Determine whether two positive integer numbers are coprime.
   Two numbers are coprime if their greatest common divisor equals 1.
   scala> 35.isCoprimeTo(64)
   res0: Boolean = true
 */

  "Scala99Arithmetic Challenge: 34.isCoprimeTo(64)" should "return true" in{
    val num = sl99.num(34)
    val actual:Boolean = num.isCoprimeTo(64)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: 35.isCoprimeTo(64)" should "return true" in{
    val num = sl99.num(35)

    val actual:Boolean = num.isCoprimeTo(64)
    val expected:Boolean = true

    assert(actual == expected)
  }

  /*
    P34 (**) Calculate Euler's totient function phi(m).
    Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
    scala> 10.totient
    res0: Int = 4

     def phi(m:Int):Int = {

    def totalPhi(number:Int = m, number2:Int=1,store:Int = 0):Int = {
        val numberClass = num(number)

        number match {
          case a  if (number == number2) => store
          case b  if (numberClass.isCoprimeTo(number2)) => totalPhi (m, number2 + 1, store + 1)
          case _  => totalPhi(m, number2 + 1, store)
        }

      }
      m match{
        case a if(m<1) => -1
        case 1 => 1
        case b if(isPrime(m)) => m-1
        case _ => totalPhi()
      }
    }
  */

  "ScalaArithmetic Challenge: phi(7)" should "return 6" in {

    val actual:Int = sl99.phi(7)
    val expected:Int = 6

    assert(actual == expected)
  }


  "ScalaArithmetic Challenge: phi(10)" should "return 4" in {
    val actual:Int = sl99.phi(10)
    val expected:Int = 4

    assert(actual == expected)
  }


  "ScalaArithmetic Challenge: phi(100)" should "return 40" in {
    val actual:Int = sl99.phi(100)
    val expected:Int = 40

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: phi(0)" should "return -1 " in {
    val actual:Int = sl99.phi(0)
    val expected:Int = -1

    assert(actual == expected)
  }

  /*
    P35 (**) Determine the prime factors of a given positive integer.
    Construct a flat list containing the prime factors in ascending order.
    scala> 315.primeFactors
    res0: List[Int] = List(3, 3, 5, 7)
  */

  "ScalaArithmetic Challenge: 8.primeFactors()" should "return  List(2,2,2,1)" in {
    val pfClass = sl99.numPrimeFactor(8)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,2,2,1)

    assert(actual == expected)
  }


  "ScalaArithmetic Challenge: 22.primeFactors()" should "return List(2,11)" in {
    val pfClass = sl99.numPrimeFactor(2)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,1)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 315.primeFactors()" should "return List(3, 3, 5, 7)" in {
    val pfClass = sl99.numPrimeFactor(315)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(3, 3, 5, 7)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 630.primeFactors()" should "return List(3, 3, 5, 7)" in {
    val pfClass = sl99.numPrimeFactor(630)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,3, 3, 5, 7)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 975.primeFactors()" should "return List(3, 5, 5, 13)" in {
    val pfClass = sl99.numPrimeFactor(975)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(3, 5, 5, 13)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 5154518.primeFactors()" should "return List(2, 29, 181, 491)" in {
    val pfClass = sl99.numPrimeFactor(5154518)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2, 29, 181, 491)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 74652354.primeFactors()" should "return List(2,3,3,3,3,7,65831)" in {
    val pfClass = sl99.numPrimeFactor(74652354)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,3,3,3,3,7,65831)

    assert(actual == expected)
  }

}
