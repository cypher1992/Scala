package com.local.TraitTraining.TypeParameters

trait SecurtiesFunctions[S] {
  /*
   OBJ:
   In this tutorial, we will learn how to create trait with type parameters which defines methods that a consuming class should implement.
   This is similar to implementing a generics interface if you come from an Object Oriented background and have used Java
   eg. S = the type of security ; ie. Fixed Income, Equity, etc.
   URL: http://allaboutscala.com/tutorials/chapter-5-traits/scala-trait-type-parameters/
  */

  def buy(security:S):Boolean
  def sell(security:S):Boolean
  def hold(security:S):(Boolean)

}
