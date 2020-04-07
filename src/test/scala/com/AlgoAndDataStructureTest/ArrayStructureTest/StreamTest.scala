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

  "AlgoAndDataStructure Stream Structure: findLambdaStream(emptyStream, 10)" should "return false" in {

    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Boolean = streamS.findLambdaStream(10, emptyStream)
    val expected:Boolean = false

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream Structure: findLambdaStream(stream, 10)" should "return true" in {

    val stream:Stream[Int] = Stream(1,2,4151,10)
    val actual:Boolean = streamS.findLambdaStream(10, stream)
    val expected:Boolean = true

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream Structure: updateStream(1,2,emptyStream)" should "return emptyStream" in {

    val emptystream:Stream[Int] = Stream.empty[Int]
    val actual:Stream[Int] = streamS.updateSteam(1,2,emptystream)
    val expected:Stream[Int] = Stream.empty[Int]

    assert(actual == expected)

  }

  "AlgoAndDataStructure Stream Structure: replaceValue(10,4,11)" should "return 10" in {

    val index:Int = 10
    val targetValue:Int = 4
    val replacement:Int = 11
    val actual:Int = streamS.replaceValue(index,targetValue,replacement)
    val expected:Int = 10

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream Structure: replaceValue(10,10,11)" should "return 11" in {

    val index:Int = 10
    val targetValue:Int = 10
    val replacement:Int = 11
    val actual:Int = streamS.replaceValue(index,targetValue,replacement)
    val expected:Int = 11

    assert(actual == expected)
  }

  "AlgoAndDataStrucuture Stream Strucutre: updateLambdaStream(10,4,emptyStream)" should "return emptyStream" in {
    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Stream[Int] = streamS.updateLambdaStream(10,4,emptyStream)
    val expected:Stream[Int] = Stream.empty[Int]
    assert(actual == expected)
  }

  "AlgoAndDataStrucuture Stream Strucutre: updateLambdaStream(10,4,stream)" should "return Stream(2,4,6,8,4)" in {
    val emptyStream:Stream[Int] = Stream(2,4,6,8,10)
    val actual:Stream[Int] = streamS.updateLambdaStream(10,4,emptyStream)
    val expected:Stream[Int] = Stream(2,4,6,8,4)
    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream Structure: removeStream(8,emptyStream)" should "return emptyStream" in{
    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Stream[Int] = streamS.removeStream(8,emptyStream)
    val expected:Stream[Int] = Stream.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream: removeStream(8,Stream(2,4,6,8,10))" should "Stream(2,4,6,10)" in {
    val stream:Stream[Int] = Stream(2,4,6,8,10)
    val actual:Stream[Int] = streamS.removeStream(8,stream)
    val expected:Stream[Int] = Stream(2,4,6,10)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream: removeElement(5,5)" should "return none" in{
    val actual:Option[Int] = streamS.removeElement(5,5)
    println(streamS.removeElement(5,5))
    val expected:Option[Int] = None
    assert(actual == expected)

  }

  "AlgoAndDataStructure Stream: removeElement(1,5)" should "return nothing" in{
    val actual:Option[Int] = streamS.removeElement(1,5)
    val expected:Int = 1
    assert(actual.getOrElse(None) == expected)
  }

  "AlgoandDataStructure Stream: removeStreamLambda(5,emptyStream)" should "return emptyStream" in {
    val emptyStream:Stream[Int] = Stream.empty[Int]
    val actual:Stream[Int] = streamS.removeStreamLambda(5,emptyStream)
    val expected:Stream[Int] = Stream.empty[Int]
    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream: removeStreamLambda(5,stream(1,2,3,4,5))" should "return stream(1,2,3,4)" in {
    val stream:Stream[Int] = Stream(1,2,3,4,5)
    val actual:Stream[Int] = streamS.removeStreamLambda(5,stream)
    val expected:Stream[Int] = Stream(1,2,3,4)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Stream: swapValues(5,emptyStream,70,emptyStream)" should  "none,none" in {

    val emptySrcStream:Stream[Int] = Stream.empty[Int]
    val emptyTrgStream:Stream[Int] = Stream.empty[Int]
    val actual:(Option[Stream[Int]],Option[Stream[Int]]) = streamS.swapValues(5,emptySrcStream,70,emptyTrgStream)
    val expected:(Option[Stream[Int]],Option[Stream[Int]]) = (None,None)

    assert(actual == expected)
  }


  "AlgoAndDataStructure Stream: swapValues(5,emptyStream,70,trgtStream)" should  "none,none" in {

    val emptySrcStream:Stream[Int] = Stream.empty[Int]
    val trgtStream:Stream[Int] = Stream(50,60,70,80,90)
    val actual:(Option[Stream[Int]],Option[Stream[Int]]) = streamS.swapValues(5,emptySrcStream,70,trgtStream)
    val expected:(Option[Stream[Int]],Option[Stream[Int]]) = (None,None)

    assert(actual == expected)
  }


  "AlgoAndDataStructure Stream: swapValues(5,srcStream,70,emptyStream)" should  "none,none" in {

    val srcStream:Stream[Int] = Stream(1,2,3,4,5)
    val emptyTrgStream:Stream[Int] = Stream.empty[Int]
    val actual:(Option[Stream[Int]],Option[Stream[Int]]) = streamS.swapValues(5,srcStream,70,emptyTrgStream)
    val expected:(Option[Stream[Int]],Option[Stream[Int]]) = (None,None)

    assert(actual == expected)
  }

}

