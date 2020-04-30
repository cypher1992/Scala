package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import com.local.AlgoWithDataStructure.Data_Structure.StackStructure
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import scala.collection.mutable.ArrayBuffer

class StackTest extends AnyFlatSpec with Matchers{

  "AlgoAndDataStructure StackStructure: create instance of stack" should "returns stack" in {
    val stack:StackStructure = new StackStructure(3)
    val isStack:Boolean = stack.isInstanceOf[StackStructure]
    assert(isStack)
  }

  "AlgoAndDataStructure StackStructure: stack.getStackBox" should "returns Array[Int]" in {
    val stack: StackStructure = new StackStructure(3)
    val actual:Array[Int] = stack.getStackBox()
    val expected:Array[Int] = Array(0,0,0)
    assert(actual === expected)
  }

  "AlgoAndDataStructure StackStructure: stack.push(1)" should "returns Array(1,0,0)" in {
    val stack: StackStructure = new StackStructure(3)
    stack.push(1)
    val actual:Array[Int] = stack.getStackBox()
    val expected:Array[Int] = Array(1,0,0)
    assert(actual === expected)
  }

  "AlgoAndDataStructure StackStructure: stack.push(1)" should "returns Array(1,1,0)" in {
    val stack: StackStructure = new StackStructure(3)
    stack.push(1)
    stack.push(1)
    val actual:Array[Int] = stack.getStackBox()
    val expected:Array[Int] = Array(1,1,0)
    assert(actual === expected)
  }

  "AlgoAndDataStructure StackStructure: stack.push(1)" should "returns logError" in {
    val stack: StackStructure = new StackStructure(3)
    stack.push(1)
    stack.push(1)
    stack.push(1)
    stack.push(1)
    val actual:Array[Int] = stack.getStackBox()
    val expected:Array[Int] = Array(1,1,1)
    assert(actual === expected)
  }
  "AlgoAndDataStructure StackStructure: stack.pop()" should "returns 1" in {
    val stack: StackStructure = new StackStructure(3)
    stack.push(1)
    stack.push(1)
    val actual:Int = stack.pop()
    val expected:Int = 1
    assert(actual === expected)
  }

  "AlgoAndDataStructure StackStructure: stack.pop()" should "returns Array(1,0,0)" in {
    val stack: StackStructure = new StackStructure(3)
    stack.push(1)
    stack.push(1)
    stack.pop()
    val expected:Array[Int] = Array(1,0,0)
    val actual:Array[Int] = stack.getStackBox()
    assert(actual === expected)
  }

  "AlgoAndDataStructure StackStructure: stack.pop()" should "returns Array(0,0,0)" in {
    val stack: StackStructure = new StackStructure(3)
    stack.push(1)
    stack.pop()
    stack.pop()
    val expected:Array[Int] = Array(1,0,0)
    val actual:Array[Int] = stack.getStackBox()
    assert(actual === expected)
  }

}
