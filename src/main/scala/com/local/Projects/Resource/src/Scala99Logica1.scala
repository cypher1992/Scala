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

}
