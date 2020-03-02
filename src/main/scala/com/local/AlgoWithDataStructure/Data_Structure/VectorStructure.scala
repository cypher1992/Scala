package com.local.AlgoWithDataStructure.Data_Structure

class VectorStructure{

  def appendVectorLambda[T](vec:Vector[T],value:T):Vector[T] = vec.appended(value)

  def appendVector[T](vec:Vector[T],value:T):Vector[T] = vec :+ value

}
