package com.AlgoAndDataStructureTest.ArrayStructureTest

import com.local.AlgoWithDataStructure.Data_Structure.QueueStructure
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class QueueTest extends AnyFlatSpec with Matchers{

  "AlgoAndDataStructure Queue: is instance of QueueStructure" should "return true" in{
    val queue:QueueStructure = new QueueStructure(3)
    val isQueue:Boolean = queue.isInstanceOf[QueueStructure]
    assert(isQueue === true)
  }
}
