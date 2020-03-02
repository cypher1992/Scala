package com.AlgoAndDataStructureTest.ArrayStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.VectorStructure

class VectorTest extends AnyFlatSpec with Matchers {

  val vecClass:VectorStructure = new VectorStructure


  "AlgoAndDataStructure Vector: appendVectorLambda(emptyVector,8)" should "return Vector(8)" in {
    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Vector[Int] = vecClass.appendVectorLambda(emptyVector,8)
    val expected:Vector[Int] = Vector(8)

    assert(actual == expected)

  }

  "AlgoAndDataStructure Vector: appendVectorLambda(Vector(2,4,6),8)" should "return Vector(2,4,6,8)" in {
    val vector:Vector[Int] = Vector(2,4,6)
    val actual:Vector[Int] = vecClass.appendVectorLambda(vector,8)
    val expected:Vector[Int] = Vector(2,4,6,8)

    assert(actual == expected)

  }



}
