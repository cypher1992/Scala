package com.refactortest.basicstest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.refresher.basics.ConditionStructures

class ConditionStructuresTest extends AnyFlatSpec with Matchers {

  "Refresher: cs is Instance of ConditionStructures" should "return true" in {
    val cs:ConditionStructures = new ConditionStructures(0)
    assert(cs.isInstanceOf[ConditionStructures])
  }

  "Refresher: actual isNegative ConditionStructures" should "return true" in {
    val cs:ConditionStructures = new ConditionStructures(-1)
    val actual:Boolean = cs.ifNegative()
    val expected:Boolean = true
    assert(actual == expected )
  }

  "Refresher: actual ifElseNegative ConditionStructures" should "return false" in {
    val cs:ConditionStructures = new ConditionStructures(1)
    val actual:Boolean = cs.ifElseNegative()
    val expected:Boolean = false
    assert(actual == expected )
  }

  "Refresher: actual ifElseifElseNeutral ConditionStructures" should "return true" in {
    val cs:ConditionStructures = new ConditionStructures(0)
    val actual:Boolean = cs.ifElseifElseNeutral()
    val expected:Boolean = true
    assert(actual == expected )
  }

  "Refresher: actual matchPositive ConditionStructures" should "return true" in {
    val cs:ConditionStructures = new ConditionStructures(1)
    val actual:Boolean = cs.matchPositive()
    val expected:Boolean = true
    assert(actual == expected )
  }
}
