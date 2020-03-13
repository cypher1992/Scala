package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.Concepts.EagerVLazy

class EagarVLazyTest extends AnyFlatSpec with Matchers {

  val evl:EagerVLazy = new EagerVLazy()

  "AlgoAndDataStrucutures Concept: EagerVLazy: testing val lazy " should "return not instantiated" in{

    println(
      s"""
        |${evl.lazyList.getClass}
      """.stripMargin)

  }

  "AlgoAndDataStrucutures Concept: EagerVLazy: testing val eager " should "return eager" in{

    println(
      s"""
         |${evl.eagerList.getClass}
      """.stripMargin)

  }

}
