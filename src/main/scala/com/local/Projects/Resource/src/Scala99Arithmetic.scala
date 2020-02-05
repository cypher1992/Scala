package com.local.Projects.Resource.src

class Scala99Arithmetic {

  /*
    P31 (**) Determine whether a given integer number is prime.
    scala> 7.isPrime
    res0: Boolean = true
  */

  def isPrime(num: Int): Boolean = {

    def isPrimeRecur(n:Int = num,start:Int=2,state:Boolean = true):Boolean ={
      n match {
        case 1 | 2 | 3 => true
        case a if (n < 1) => false
        case b if (start == n | state == false) => state
        case c if(n%start == 0) => isPrimeRecur(n,start+1,false)
        case _ => isPrimeRecur(n,start+1,true)
      }
    }
    isPrimeRecur()
    //(((num % (num / 2)) != 0) & ((num % (num / 3) != 0)))
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

  /*
    P34 (**) Calculate Euler's totient function phi(m).
    Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
    scala> 10.totient
    res0: Int = 4
  */

  def phi(m:Int):Int = {

    def totalPhi(num:Int = m-1, total:Int=0):Int ={
      num match {
        case 1  => total
        case a  if(isPrime(num)) => totalPhi(num-1,total+1)
        case _ =>   totalPhi(num-1,total)
      }
    }

    m match{
      case 1 => 1
      case a if(isPrime(m)) => m-1
      case _ => totalPhi()
    }
  }

}
