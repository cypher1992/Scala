package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Concepts.FactorialMemoization


class FactorialMemoizationTest extends AnyFlatSpec with Matchers {

  val fm:FactorialMemoization = new FactorialMemoization


  "AlgoAndDataStructure Memoization: appendMap(emptyMap,0,2)" should "return Map(0,Some(2))" in {
    val map:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
    val actual:Map[Int,Option[Int]] = fm.appendToMap(map,0,2)
    val expected:Map[Int,Option[Int]] = Map(0 -> Some(2))

    assert(actual === expected)
  }



  "AlgoAndDataStructure Memoization: appendMap(emptyMap,2,4)" should "return Map(0 ->2,2->4)" in {
    val map:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
    val actual:Map[Int,Option[Int]] = fm.appendToMap(map,0,2)
    val actual2:Map[Int,Option[Int]] = fm.appendToMap(actual,2,4)
    val expected:Map[Int,Option[Int]] = Map(0 ->Some(2),2->Some(4))

    assert(actual2 === expected)
  }
  
}
