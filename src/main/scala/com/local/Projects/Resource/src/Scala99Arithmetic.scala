package com.local.Projects.Resource.src

class Scala99Arithmetic {

  /*
    P31 (**) Determine whether a given integer number is prime.
    scala> 7.isPrime
    res0: Boolean = true
  */

  def isPrime(num: Int): Boolean = {

    num match {
      case 1 | 2 | 3 => true
      case a if (num < 1) => false
      case b if (((num / 2) % 2) != 0) => true
      case _ => false
    }
  }

  /*
  P32 (**) Determine the greatest common divisor of two positive integer numbers.
  Use Euclid's algorithm.
  scala> gcd(36, 63)
  res0: Int = 9
    // 35,10
    // gcd(35,10) -> 10%35->10,35 gcd(10,35)
    // 35%10 -> gcd(5,10)
    // gcd(0,5) -> 5
*/

  def gcd(num1: Int, num2: Int): Int = {

    (num1, num2) match {
      case (_, _) if (num1 < 0 || num2 < 0) => -1
      case (0, _) => num2
      case _ => gcd(num2 % num1, num1)
    }
  }


  /*
    P33 (*) Determine whether two positive integer numbers are coprime.
    Two numbers are coprime if their greatest common divisor equals 1.
    scala> 35.isCoprimeTo(64)
    res0: Boolean = true
  */

  case class num(n: Int) {
    def isCoprimeTo(int: Int): Boolean = (gcd(n, int) == 1)
  }

}
