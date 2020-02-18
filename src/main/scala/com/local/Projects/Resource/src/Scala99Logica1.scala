package com.local.Projects.Resource.src

class Scala99Logica1 {

  /*
    P46 (**) Truth tables for logical expressions.
    Define functions and, or, nand, nor, xor, impl, and equ (for logical equivalence) which return true or false according to the result of their respective operations; e.g. and(A, B) is true if and only if both A and B are true.
    scala> and(true, true)
    res0: Boolean = true

    scala> xor(true. true)
    res1: Boolean = false
  */

  def and(a:Boolean,b:Boolean):Boolean = {
    (a,b) match {
      case (true,true) => true
      case _ => false
    }
  }

  def or (a:Boolean,b:Boolean):Boolean ={
    (a,b) match {
      case (true,true) | (true,false) | (false,true) => true
      case  _ => false
    }
  }

  def nand (a:Boolean,b:Boolean):Boolean = {

    (a,b) match {
      case (false,false) | (false,true) | (true,false) => true
      case _ => false
    }
  }

  // exculsive
  def equ(a:Boolean,b:Boolean):Boolean = or(and(a,b),!and(a,b))
  // exculsive or
  def xor(a:Boolean,b:Boolean):Boolean = !equ(a,b)
  //
  def impl(a:Boolean,b:Boolean):Boolean = or(!a,b)


  /*P46
    Now, write a function called table2 which prints the truth table of a given logical expression in two variables.

    scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
    A     B     result
    true  true  true
    true  false true
    false true  false
    false false false
  */

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

  def table2(f: (Boolean,Boolean) => Boolean): Unit = {
    println("A | B | Result")
    for { a <- List(true,false)
          b <- List(true,false)}{
      printf("%-5s %-5s %-5s\n", a, b, f(a,b))
    }
  }

  /*
    P49 (**) Gray code.
    An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules. For example,
    n = 1: C(1) = ("0", "1").
    n = 2: C(2) = ("00", "01", "11", "10").
    n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
    Find out the construction rules and write a function to generate Gray codes.

    scala> gray(3)
    res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)
    See if you can use memoization to make the function more efficient.
  */



}
