package com.ArtOfScalaTDD.Basics.FunctionalTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.ArtOfScala.Basics.Function


class FunctionalTest extends AnyFlatSpec with Matchers {

  "ArtOfScala Basics Functional: add(Double 3.0, Double 4.0)" should "return 7" in {
    val function:Function = new Function()
    val actual:Double = function.add(3.0,4.0)
    val expected:Double = 7
    assert(actual == expected)
  }

  "ArtOfScala Basics Functional: double(function.add(3.0,4.0), function.add(3.0,4.0))" should "return 28" in {
    val function:Function = new Function()
    val actual:Double = function.double(function.add(3.0,4.0),function.add(3.0,4.0))
    val expected:Double = 28
    assert(actual == expected)
  }

  "ArtOfScala Basics Functional: getBalance()" should "return 100.00" in {
    val function:Function = new Function()
    val account = function.initAccount(100.00)
    val actual:Double = account.getBalance()
    val expected:Double = 100.00
    assert(actual == expected)
  }

  "ArtOfScala Basics Functional: setBalance(50.00)" should "return 50.00" in {
    val function:Function = new Function()
    val account = function.initAccount(100.00)
    account.setBalance(50.00)
    val actual:Double = account.getBalance()
    val expected:Double = 50.00
    assert(actual == expected)
  }

  "ArtOfScala Basics Functional: depositIntoAccount(50.00)" should "return 150.00" in {
    val function:Function = new Function()
    val account = function.initAccount(100.00)
    account.depositIntoAccount(50.00)
    val actual:Double = account.getBalance()
    val expected:Double = 150.00
    assert(actual == expected)
  }
}
