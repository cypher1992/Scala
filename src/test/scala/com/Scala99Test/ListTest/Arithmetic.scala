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

  "ScalaArithmetic Challenge: phi(10090)" should "return 4032 " in {
    val actual:Int = sl99.phi(10090)
    val expected:Int = 4032

    assert(actual == expected)
  }

  /*
    P35 (**) Determine the prime factors of a given positive integer.
    Construct a flat list containing the prime factors in ascending order.
    scala> 315.primeFactors
    res0: List[Int] = List(3, 3, 5, 7)

      case class numPrimeFactor(num:Int){
      def primeFactors():List[Int]={

          def pfrecur(n:Int =num,divisor:Int=3,list:List[Int]=Nil):List[Int] ={
             n%2 match {
               case 0 => pfrecur(n/2,3,list.appended(2))
               case a if(isPrime(n)) => list :+ n
               case b if(n%divisor == 0) => pfrecur(n/divisor,3,list.appended(divisor))
               case c if(n%divisor != 0) => pfrecur(n,divisor+1,list)
               case _ => list
             }
          }
        pfrecur()
      }
    }
  */

  "ScalaArithmetic Challenge: -1.primeFactors()" should "return  Nil" in {
    val pfClass = sl99.NumPrimeFactor(-1)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = Nil

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 8.primeFactors()" should "return  List(2,2,2,1)" in {
    val pfClass = sl99.NumPrimeFactor(8)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,2,2,1)

    assert(actual == expected)
  }


  "ScalaArithmetic Challenge: 22.primeFactors()" should "return List(2,11,1)" in {
    val pfClass = sl99.NumPrimeFactor(22)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,11,1)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 315.primeFactors()" should "return List(3, 3, 5, 7,1)" in {
    val pfClass = sl99.NumPrimeFactor(315)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(3, 3, 5, 7,1)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 630.primeFactors()" should "return List(3, 3, 5, 7,1)" in {
    val pfClass = sl99.NumPrimeFactor(630)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,3, 3, 5, 7,1)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 975.primeFactors()" should "return List(3, 5, 5, 13,1)" in {
    val pfClass = sl99.NumPrimeFactor(975)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(3, 5, 5, 13,1)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 5154518.primeFactors()" should "return List(2, 29, 181, 491,1)" in {
    val pfClass = sl99.NumPrimeFactor(5154518)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2, 29, 181, 491,1)

    assert(actual == expected)
  }

  "ScalaArithmetic Challenge: 74652354.primeFactors()" should "return List(2,3,3,3,3,7,65831)" in {
    val pfClass = sl99.NumPrimeFactor(74652354)
    val actual:List[Int] = pfClass.primeFactors()
    val expected:List[Int] = List(2,3,3,3,3,7,65831,1)

    assert(actual == expected)
  }


    /*
     P36 (**) Determine the prime factors of a given positive integer (2).
     Construct a list containing the prime factors and their multiplicity.
     scala> 315.primeFactorMultiplicity
     res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
     Alternately, use a Map for the result.

     def primeFactorMultiplicity(): List[Tuple2[Int,Int]] ={

         val list:List[Int] = this.primeFactors()

        def pfmAppend(lst:List[Int]=list, appendList:List[Tuple2[Int,Int]] = Nil,counter:Int = 1):List[Tuple2[Int,Int]] ={

          lst match {
            case Nil => appendList
            case a if(lst.size == 1) => appendList :+ (lst.head,1)
            case a if(lst.head == lst.tail.head) =>  pfmAppend(lst.tail,appendList,counter+1)
            case _  => pfmAppend(lst.tail,appendList :+ (lst.head,counter),1 )
          }
        }

        pfmAppend()
      }

    */

  "ScalaArtithmetic Challenge: 0.primeFactorMultiplicity()" should "return Nil" in{
    val numClass = sl99.NumPrimeFactor(0)
    val actual:List[Tuple2[Int,Int]] = numClass.primeFactorMultiplicity()
    val expected:List[Tuple2[Int,Int]] = Nil

    assert(actual == expected)
  }

  "ScalaArtithmetic Challenge: 100.primeFactorMultiplicity()" should "return List((2,2), (5,2))" in{
    val numClass = sl99.NumPrimeFactor(100)
    val actual:List[Tuple2[Int,Int]] = numClass.primeFactorMultiplicity()
    val expected:List[Tuple2[Int,Int]] = List((2,2), (5,2),(1,1))

    assert(actual == expected)
  }

  "ScalaArtithmetic Challenge: 315.primeFactorMultiplicity()" should "return List((3,2), (5,1), (7,1))" in{
    val numClass = sl99.NumPrimeFactor(315)
    val actual:List[Tuple2[Int,Int]] = numClass.primeFactorMultiplicity()
    val expected:List[Tuple2[Int,Int]] = List((3,2), (5,1), (7,1),(1,1))

    assert(actual == expected)
  }

  "ScalaArtithmetic Challenge: 8.primeFactorMultiplicity()" should "return List((2,3))" in{
    val numClass = sl99.NumPrimeFactor(8)
    val actual:List[Tuple2[Int,Int]] = numClass.primeFactorMultiplicity()
    val expected:List[Tuple2[Int,Int]] = List((2,3),(1,1))

    assert(actual == expected)
  }

  "ScalaArtithmetic Challenge: 74652354.primeFactorMultiplicity()" should "return List((2,1),(3,4),(7,1)(65831,1))" in{
    val numClass = sl99.NumPrimeFactor(74652354)
    val actual:List[Tuple2[Int,Int]] = numClass.primeFactorMultiplicity()
    val expected:List[Tuple2[Int,Int]] = List((2,1),(3,4),(7,1),(65831,1),(1,1))

    assert(actual == expected)
  }

  /*
    P37 (**) Calculate Euler's totient function phi(m) (improved).
    See problem P34 for the definition of Euler's totient function. Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.

    If the list of the prime factors of a number m is known in the form of problem P36 then the function phi(m>) can be efficiently calculated as follows: Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m. Then phi(m) can be calculated with the following formula:
    phi(m) = (p1-1)*p1(m1-1) * (p2-1)*p2(m2-1) * (p3-1)*p3(m3-1) * ...
    Note that ab stands for the bth power of a.
  */

  "Scala99Arithmetic Challenge: totient(-1)" should "return 0" in{
    val actual:Int = sl99.totient(-1)
    val expected:Int = 0

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: totient(7)" should "return 6" in{
    val actual:Int = sl99.totient(7)
    val expected:Int = 6

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: totient(10)" should "return 4" in{
    val actual:Int = sl99.totient(10)
    val expected:Int = 4

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: totient(1000)" should "return 400" in{
    val actual:Int = sl99.totient(100)
    val expected:Int = 40

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: totient(10090)" should "return 4032" in{
    val actual:Int = sl99.totient(10090)
    val expected:Int = 4032

    assert(actual == expected)

  }

  /*
    P38 (*) Compare the two methods of calculating Euler's totient function.
    Use the solutions of problems P34 and P37 to compare the algorithms. Try to calculate phi(10090) as an example.
  */
  "Scala99 Arithmetic: Compare two functions phi(10090) and totient(10090)" should "return 4032" in {

    val actual:Int = sl99.totient(10090)
    val actual2:Int = sl99.phi(10090)
    val expected:Int = 4032

    assert(actual == expected && actual2 == expected)

  }

  /*
   A list of prime numbers.
   Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
   scala> listPrimesinRange(7 to 31)
   res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
  */

  "Scala99Arithmetic Challenge: listPrimessInRange(0,4)" should "return Nil" in {

    val actual:List[Int] = sl99.listPrimesInRange(0,4)
    val expected: List[Int] = Nil

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: listPrimessInRange(1,0)" should "return Nil" in {

    val actual:List[Int] = sl99.listPrimesInRange(1,0)
    val expected: List[Int] = Nil

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: listPrimessInRange(5,2)" should "return Nil" in {

    val actual:List[Int] = sl99.listPrimesInRange(5,2)
    val expected: List[Int] = Nil

    assert(actual == expected)

  }

  "Scala99Arithmetic Challenge: listPrimessInRange(7,31)" should "return List(7, 11, 13, 17, 19, 23, 29, 31)" in {

    val actual:List[Int] = sl99.listPrimesInRange(7,31)
    val expected: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)

    assert(actual == expected)

  }

  /*
   P40_1 (**) Combination Of List possible returns of possible outcomes
   List(5,4,3,2,1,)
   Combiniation of 5C3 = 5!/3!(5-3)! = 10
  */

  "Scala99Arithmetic Challenge: Combination(List(5,4,3,2,1,))" should "Return 10" in {
    val goldbac = sl99.GoldConjecture(5)
    val list:List[Int] = List(5,4,3,2,1)
    val combo:List[List[Int]] = goldbac.combinations(3,list)
    println(
      s"""
        |${combo}
      """.stripMargin)
    val actual:Int = combo.size
    val expected:Int = 10

    assert(actual == expected)
  }

  /*
   P40 (**) Goldbach's conjecture.
   Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent). Write a function to find the two prime numbers that sum up to a given even integer.
   scala> 28.goldbach
   res0: (Int, Int) = (5,23)
  */

  "Scala99Arithmetic Challenge: 3.goldbach" should "return (0,0)" in{
    val goldBac =sl99.GoldConjecture(3)
    val actual:Tuple2[Int,Int] = goldBac.goldbach()
    val expected:Tuple2[Int,Int] = (0,0)

    assert(actual == expected)
  }


  "Scala99Arithmetic Challenge: 8.goldbach" should "return (3,5)" in{
    val goldBac =sl99.GoldConjecture(8)
    val actual:Tuple2[Int,Int] = goldBac.goldbach()
    val expected:Tuple2[Int,Int] = (3,5)

    assert(actual == expected)
  }

  "Scala99Arithmetic Challenge: -8.goldbach" should "return (3,5)" in{
    val goldBac =sl99.GoldConjecture(-8)
    val actual:Tuple2[Int,Int] = goldBac.goldbach()
    val expected:Tuple2[Int,Int] = (3,5)

    assert(actual == expected)
  }

  /*
    P41 (**) A list of Goldbach compositions.
    Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
    scala> printGoldbachList(9 to 20)
    10 = 3 + 7
    12 = 5 + 7
    14 = 3 + 11
    16 = 3 + 13
    18 = 5 + 13
    20 = 3 + 17
  */

  "Scala99Arithmetic Challenge: printGoldbachList(9 to 20)" should "Return print statement" in {
    sl99.printGoldbachList(9,20)

  }

  "Scala99Arithmetic Challenge: printGoldbachList(9 to 20)" should "Return error" in {
    sl99.printGoldbachList(-1,15)

  }

  "Scala99Arithmetic Challenge: printGoldbachList(990 to 2000)" should "Return error" in {
    sl99.printGoldbachList(990,2000)

  }

}
