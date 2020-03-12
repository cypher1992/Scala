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

  "AlgoAndDataStructure Vector: appendVector(emptyVector,8)" should "return Vector(8)" in {
    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Vector[Int] = vecClass.appendVector(emptyVector,8)
    val expected:Vector[Int] = Vector(8)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: appendVector(Vector(2,4,6),8)" should "return Vector(2,4,6,8)" in {
    val vector:Vector[Int] = Vector(2,4,6)
    val actual:Vector[Int] = vecClass.appendVector(vector,8)
    val expected:Vector[Int] = Vector(2,4,6,8)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: findLambdaVector(5,emptyVector)" should "return None" in {
    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Option[Int] = vecClass.findLamdaVector(5,emptyVector)
    val expected:Option[Int] = None

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: findLambdaVector(5,vector)" should "return Some(5)" in {
    val vector:Vector[Int] = Vector(6,7,99,55,5)
    val actual:Option[Int] = vecClass.findLamdaVector(5,vector)
    val expected:Option[Int] = Some(5)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: findVector(5,emptyVector)" should "return None" in {
    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Option[Int] = vecClass.findVector(5,emptyVector)
    val expected:Option[Int] = None

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: findVector(5,vector)" should "return Some(5)" in {
    val vector:Vector[Int] = Vector(6,7,99,55,5)
    val actual:Option[Int] = vecClass.findVector(5,vector)
    val expected:Option[Int] = Some(5)

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: insertVector(2,3,emptyvector)" should "throw java.lang.outofbounderror" in {

    val emptyVector:Vector[Int] = Vector.empty[Int]

    assertThrows[java.lang.IndexOutOfBoundsException]{vecClass.insertVector(2,5,emptyVector)}
  }

  "AlgoAndDataStructure Vector: insertVector(0,1,emptyvector)" should "return Vector(1)" in {

    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Vector[Int] = vecClass.insertVector(0,1,emptyVector)
    val expected:Vector[Int] = Vector(1)

    assert(actual === expected)
  }

  "AlgoAndDataStructure Vector: insertVector(1,2,vector(1))" should "return Vector(1,2)" in {

    val vector:Vector[Int] = Vector(1)
    val actual:Vector[Int] = vecClass.insertVector(1,2,vector)
    val expected:Vector[Int] = Vector(1,2)

    assert(actual === expected)
  }

  "AlgoAndDataStructure Vector: insertVector(2,3,vector(1,2))" should "return Vector(1,2,3)" in {

    val vector:Vector[Int] = Vector(1,2)
    val actual:Vector[Int] = vecClass.insertVector(2,3,vector)
    val expected:Vector[Int] = Vector(1,2,3)

    assert(actual === expected)
  }

  "AlgoAndDataStructure Vector: insertVector(1,4,vector(1,2,3))" should "return Vector(1,4,2,3)" in {

    val vector:Vector[Int] = Vector(1,2,3)
    val actual:Vector[Int] = vecClass.insertVector(1,4,vector)
    val expected:Vector[Int] = Vector(1,4,2,3)

    assert(actual === expected)
  }


  "AlgoAndDataStructure Vector: insertLambdaVector(1,5,emptyvector)" should "return Vector(5)" in{

    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Vector[Int] = vecClass.insertLambdaVector(1,5,emptyVector)
    val expected:Vector[Int] = Vector(5)

    assert(actual == expected)

  }

  "AlgoAndDataStructure Vector: insertLambdaVector(1,5,Vector(5,4))" should "return Vector(5,4,5)" in{

    val vector:Vector[Int] = Vector(5,4)
    val actual:Vector[Int] = vecClass.insertLambdaVector(5,5,vector)
    val expected:Vector[Int] = Vector(5,4,5)

    assert(actual == expected)

  }

  "AlgoAndDataStructure Vector: updateVector(5,4,emptyVector)" should "return Vector.empty[Int]" in {
      val emptyVector:Vector[Int] = Vector.empty[Int]
      val actual:Vector[Int] = vecClass.updateVector(5,4,emptyVector)
      val expected:Vector[Int] = Vector.empty[Int]

      assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: updateVector(5,4,vector(5,2,7,5,1))" should "return Vector(4,2,7,4,1)" in {
      val vector:Vector[Int] = Vector(5,2,7,5,1)
      val actual:Vector[Int] = vecClass.updateVector(5,4,vector)
      val expected:Vector[Int] = Vector(4,2,7,4,1)

      assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: updateVectorLambda(5,4,emptyVector)" should "return Vector.empty[Int]" in {
    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Vector[Int] = vecClass.updateVectorLambda(5,4,emptyVector)
    val expected:Vector[Int] = Vector.empty[Int]

    assert(actual == expected)
  }

  "AlgoAndDataStructure Vector: updateVectorLambda(5,4,vector(5,2,7,5,1))" should "return Vector(4,2,7,4,1)" in {
    val vector:Vector[Int] = Vector(5,2,7,5,1)
    val actual:Vector[Int] = vecClass.updateVectorLambda(5,4,vector)
    val expected:Vector[Int] = Vector(4,2,7,4,1)

    assert(actual == expected)
  }

  "AlgoAndDataStrucuture Vector: groupbyVectorIsEvens(emptyVector(emptyVector)" should "return emptyVector" in {

    val emptyVector:Vector[Int] = Vector.empty[Int]
    val actual:Map[Boolean,Vector[Int]] = vecClass.groupbyVectorIsEvens(emptyVector)
    val expected:Map[Boolean,Vector[Int]] = Map.empty[Boolean,Vector[Int]]

    assert(actual == expected)
  }

  "AlgoAndDataStrucuture Vector: groupbyVectorIsEvens(vector, groupByVector(vector)" should "return Vector(0,2,4,6,8), false -> Vector(1,3,5,7,9))" in {

    val vector:Vector[Int] = Vector.range(0,10,1)
    val actual:Map[Boolean,Vector[Int]] = vecClass.groupbyVectorIsEvens(vector)
    val expected:Map[Boolean,Vector[Int]] = Map(true -> Vector(0,2,4,6,8), false -> Vector(1,3,5,7,9))
    assert(actual == expected)
  }

}
