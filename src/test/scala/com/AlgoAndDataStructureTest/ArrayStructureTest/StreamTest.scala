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

  "AlgoAndStructure Stream Structure: appendStream(emptyStream,1)" should "Stream(1)" in {

    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Stream[Int] = streamS.appendStream(emptyStream,1)
    val expected:Stream[Int] = Stream(1)

    assert(actual == expected)
  }

  "AlgoAndStructure Stream Structure: appendStream(stream,5)" should "Stream(1,2,3,4,5)" in {

    val stream:Stream[Int] = Stream(1,2,3,4)
    val actual:Stream[Int] = streamS.appendStream(stream,5)
    val expected:Stream[Int] = Stream(1,2,3,4,5)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream Structure: findStream(emptyStream, 10)" should "return false" in {

    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Boolean = streamS.findStream(10, emptyStream)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream Structure: findStream(stream, 10)" should "return true" in {

    val stream:Stream[Int] = Stream(1,2,4151,10)
    val actual:Boolean = streamS.findStream(10, stream)
    val expected:Boolean = true

    assert(actual == expected)
  }

}

