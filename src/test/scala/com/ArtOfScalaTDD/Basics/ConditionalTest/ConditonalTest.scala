package com.ArtOfScalaTDD.Basics.ConditionalTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.Conditonal

class ConditonalTest extends AnyFlatSpec with Matchers{

  "ArtOfScala Basics Conditional: ifElseEqualsCondtion(Int 3, Int 4)" should "return false" in {
    val conditional:Conditonal[Int] = new Conditonal[Int]
    val actual:Boolean = conditional.ifElseEqualsCondtion(3,4)
    val expected:Boolean = false
    assert(actual == expected)
  }

  "ArtOfScala Basics Conditional: ifElseEqualsCondtion(Int 3, Int 3)" should "return true" in {
    val conditional:Conditonal[Int] = new Conditonal[Int]
    val actual:Boolean = conditional.ifElseEqualsCondtion(3,3)
    val expected:Boolean = true
    assert(actual == expected)
  }


  "ArtOfScala Basics Conditional: ifElseEqualsCondtion(Int 3, Int 4, Int 5)" should "return false" in {
    val conditional:Conditonal[Int] = new Conditonal[Int]
    val actual:Boolean = conditional.ifElseIfElseEqualsCondtion(3,4,5)
    val expected:Boolean = false
    assert(actual == expected)
  }

  "ArtOfScala Basics Conditional: ifElseEqualsCondtion(Int 3, Int 3, Int 5)" should "return true" in {
    val conditional:Conditonal[Int] = new Conditonal[Int]
    val actual:Boolean = conditional.ifElseIfElseEqualsCondtion(3,3,5)
    val expected:Boolean = true
    assert(actual == expected)
  }

  "ArtOfScala Basics Conditional: ifElseEqualsCondtion(Int 3, Int 4, Int 3)" should "return true" in {
    val conditional:Conditonal[Int] = new Conditonal[Int]
    val actual:Boolean = conditional.ifElseIfElseEqualsCondtion(3,4,3)
    val expected:Boolean = true
    assert(actual == expected)
  }
}
