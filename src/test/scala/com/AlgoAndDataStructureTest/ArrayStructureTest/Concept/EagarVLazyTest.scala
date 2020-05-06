package com.AlgoAndDataStructureTest.ArrayStructureTest.Concept

import com.local.AlgoWithDataStructure.Concepts.EagerVLazy
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class EagarVLazyTest extends AnyFlatSpec with Matchers {

  val evl:EagerVLazy = new EagerVLazy()
  val rt = Runtime.getRuntime
  "AlgoAndDataStrucutures Concept: EagerVLazy: testing val lazy " should "return not instantiated" in{

    evl.lazyList.getClass
    val lazyMemory:Long = rt.totalMemory() - rt.freeMemory()
    val eagerMemory: Long = 58754616
    assert(lazyMemory < eagerMemory)

  }

  "AlgoAndDataStrucutures Concept: EagerVLazy: testing val eager " should "return eager" in{

    evl.eagerList.getClass
    val eagerMemory:Long = rt.totalMemory() - rt.freeMemory()
    val lazyMemory: Long = 58754616
    assert(lazyMemory < eagerMemory)

  }

}
