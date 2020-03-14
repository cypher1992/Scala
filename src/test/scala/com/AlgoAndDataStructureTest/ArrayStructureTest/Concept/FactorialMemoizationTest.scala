package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Concepts.FactorialMemoization


class FactorialMemoizationTest extends AnyFlatSpec with Matchers {

  val fm:FactorialMemoization = new FactorialMemoization

  "AlgoAndDataStructure Memoization: appendMap(emptyMap,0,2)" should "return Map(0,2)" in {
    val map:Map[Int,Int] = Map.empty[Int,Int]
    val actual:Map[Int,Int] = fm.appendToMap(map,0,2)
    val expected:Map[Int,Int] = Map(0 -> 2)

    assert(actual === expected)
  }
  

}
