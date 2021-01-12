package com.reviewtest.basicstest
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.refresher.basics.VariablesAndTypes

class VariableAndTypesTest extends AnyFlatSpec with Matchers {

  /*
  Formatting Testing for first time:
  1. import org.scalatest.flatspec.AnyFlatSpec
  2. import org.scalatest.matchers.must.Matchers
  3. import the target class under testing: import com.refresher.basics.VariablesAndTypes

  Formatting for test is
  "String of the function being undertest" should "Return Results"
  {
    // wrapped around with curly braces then the executions to validated assertion
    obj = Constructor()
    ...
    actual = actual results
    expected = expected value(s)
    assert(actual == expected)
  }

  "ArtOfScala Basics Functional: add(Double 3.0, Double 4.0)" should "return 7" in {
    val function:Function = new Function()
    val actual:Double = function.add(3.0,4.0)
    val expected:Double = 7
    assert(actual == expected)
  }

  */
  "Refresher: vat is Instance of VariablesAndTypes" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    assert(vat.isInstanceOf[VariablesAndTypes])
  }

  "Refresher: actual is Instance of Byte" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    val actual:Byte = vat.getBYTE()
    assert(actual.isInstanceOf[Byte])
  }

  "Refresher: actual is Instance of Short" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    val actual:Short = vat.getSHORT()
    assert(actual.isInstanceOf[Short])
  }

  "Refresher: actual is Instance of Int" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    val actual:Int = vat.getINT()
    assert(actual.isInstanceOf[Int])
  }

  "Refresher: actual is Instance of Long" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    val actual:Long = vat.getLong()
    assert(actual.isInstanceOf[Long])
  }

  "Refresher: actual is Instance of Float" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    val actual:Float = vat.getFLOAT()
    assert(actual.isInstanceOf[Float])
  }

  "Refresher: actual is Instance of Double" should "return true" in {
    val vat:VariablesAndTypes = new VariablesAndTypes()
    val actual:Double = vat.getDOUBLE()
    assert(actual.isInstanceOf[Double])
  }

}
