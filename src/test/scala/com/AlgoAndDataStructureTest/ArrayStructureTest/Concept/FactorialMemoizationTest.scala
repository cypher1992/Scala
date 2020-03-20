package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Concepts.FactorialMemoization


class FactorialMemoizationTest extends AnyFlatSpec with Matchers {

  val emptyMap:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
  val fm:FactorialMemoization = new FactorialMemoization(emptyMap)

  "AlgoAndDataStrucuture Memoization: getMap()" should "return Map(1 -> Some(1))" in {
    val map:Map[Int,Option[Int]] = Map(1-> Some(1))
    val fmTest:FactorialMemoization = new FactorialMemoization(map)
    val actual:Map[Int,Option[Int]] = fmTest.getMap()
    val expected:Map[Int,Option[Int]] = Map(1 ->Some(1))
  }

  "AlgoAndDataStructure Memoization: setMap(map(1 ->3)" should "return Map(1 -> Some(3))" in {
    val map:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
    val fmTest:FactorialMemoization = new FactorialMemoization(map)
    val mapTestSet:Map[Int,Option[Int]] = Map(1->Some(3))

    fmTest.setMap(mapTestSet)
    val actual:Map[Int,Option[Int]] = fmTest.getMap()
    val expected:Map[Int,Option[Int]] = Map(1 -> Some(3))

    assert(actual == expected)
  }

  "AlgoAndDataStructure Memoization: appendMap(0,2)" should "return Map(0,Some(2))" in {
    fm.appendToMap(0,2)

    val actual:Map[Int,Option[Int]] = fm.getMap()
    val expected:Map[Int,Option[Int]] = Map(0 -> Some(2))

    assert(actual === expected)
  }

  "AlgoAndDataStructure Memoization: appendMap(2,4)" should "return Map(0 ->2,2->4)" in {
    fm.appendToMap(0,2)
    fm.appendToMap(2,4)
    val actual2:Map[Int,Option[Int]] = fm.getMap()
    val expected:Map[Int,Option[Int]] = Map(0 ->Some(2),2->Some(4))

    assert(actual2 === expected)
  }


  "AlgoAndDataStructure Memoization: findValue(key,)" should "throws NoSuchElementException" in {
    val emptyMap:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
    val actual= fm.findValue(4)
    val expected = None

    assert(actual == expected)

  }


  "AlgoAndDataStructure Memoization: findValue(5)" should "return 1" in {
    val map:Map[Int,Option[Int]] = Map(1 ->Some(2),2->Some(3),4->Some(5),5->Some(1))
    fm.setMap(map)
    val actual = fm.findValue(5)
    val expected = 1

    assert(actual == expected)
  }


    "AlgoAndDateStructure Memoization: factorial(0)" should "return 1" in {
      val value:Int = 0
      val actual:Any = fm.factorial(value)
      val expected:Int = 1

      assert(actual == expected)
    }

  /*
  "AlgoAndDateStructure Memoization: factorial(1)" should "return 1" in {
      val value:Int = 1
      val emptyMap:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
      val actual:Any = fm.factorial(value,emptyMap)
      val expected:Int = 1

      assert(actual == expected)
    }

    "AlgoAndDateStructure Memoization: factorial(2)" should "return 1" in {
      val value:Int = 2
      val emptyMap:Map[Int,Option[Int]] = Map.empty[Int,Option[Int]]
      val map:Map[Int,Option[Int]] = fm.appendToMap(emptyMap,2,5)
      val actual:Any = fm.factorial(value,map)
      val expected:Int = 5

      assert(actual == expected)
    }
    */

}
