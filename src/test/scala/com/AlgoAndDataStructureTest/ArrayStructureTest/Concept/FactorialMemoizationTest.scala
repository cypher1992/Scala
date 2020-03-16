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


  "AlgoAndDataStructure Memoization: appendMap(emptyMap,2,4)" should "return Map(0 ->2,2->4)" in {
    val map:Map[Int,Int] = Map.empty[Int,Int]
    val actual:Map[Int,Int] = fm.appendToMap(map,0,2)
    val actual2:Map[Int,Int] = fm.appendToMap(actual,2,4)
    val expected:Map[Int,Int] = Map(0 ->2,2->4)

    assert(actual2 === expected)
  }

  "AlgoAndDataStructure Memoization: findValue(key,emptyMap)" should "throws NoSuchElementException" in {
    val emptyMap:Map[Int,Int] = Map.empty[Int,Int]
    assertThrows[java.util.NoSuchElementException]{fm.findValue(4,emptyMap)}

  }

  "AlgoAndDataStructure Memoization: findValue(5,map)" should "return 1" in {
    val map:Map[Int,Int] = Map(1 ->2,2->3,4->5,5->1)
    val actual:Int = fm.findValue(5,map)
    val expected:Int = 1

    assert(actual == expected)
  }



}
