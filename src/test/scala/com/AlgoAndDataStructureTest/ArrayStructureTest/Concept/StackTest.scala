package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import com.local.AlgoWithDataStructure.Data_Structure.StackStructure
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers



class StackTest extends AnyFlatSpec with Matchers{

  "AlgoAndDataStructure StackStructure: create instance of stack" should "returns stack" in {
    val stack:StackStructure = new StackStructure(3)
    val isStack:Boolean = stack.isInstanceOf[StackStructure]
    assert(isStack)
  }
}
