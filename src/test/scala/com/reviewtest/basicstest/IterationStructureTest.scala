package com.reviewtest.basicstest
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.refresher.basics.IterationStructures

class IterationStructureTest extends AnyFlatSpec with Matchers{

  "Refresher: is is Instance of IterationStructures" should "return true" in {
    val is:IterationStructures = new IterationStructures(0,5)
    assert(is.isInstanceOf[IterationStructures])
  }

  "Refresher: 0 to 5 is.ForToLoop()" should "return 5" in {
    val is:IterationStructures = new IterationStructures(0,5)
    val actual:Integer = is.forToLoop()
    val expected:Integer = 5
    assert(actual == expected)
  }

  "Refresher: 0 to 5 is.whileLoop()" should "return 5" in {
    val is:IterationStructures = new IterationStructures(0,5)
    val actual:Integer = is.whileLoop()
    val expected:Integer = 5
    assert(actual == expected)
  }

  "Refresher: 0 to 5 is.doWhileLoop()" should "return 5" in {
    val is:IterationStructures = new IterationStructures(0,5)
    val actual:Integer = is.doWhileLoop()
    val expected:Integer = 5
    assert(actual == expected)
  }

}
