package com.AlgoAndDataStructureTest.ArrayStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.StreamStructure

class StreamTest extends AnyFlatSpec with Matchers {

  val streamS:StreamStructure = new StreamStructure()

  "AlgoAndStructure Stream Structure: appendLambdaStream(emptyStream,1)" should "Stream(1)" in {

    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Stream[Int] = streamS.appendLambdaStream(emptyStream,1)
    val expected:Stream[Int] = Stream(1)

    assert(actual == expected)
  }

  "AlgoAndStructure Stream Structure: appendLambdaStream(stream,5)" should "Stream(1,2,3,4,5)" in {

    val stream:Stream[Int] = Stream(1,2,3,4)
    val actual:Stream[Int] = streamS.appendLambdaStream(stream,5)
    val expected:Stream[Int] = Stream(1,2,3,4,5)

    assert(actual == expected)
  }
}
