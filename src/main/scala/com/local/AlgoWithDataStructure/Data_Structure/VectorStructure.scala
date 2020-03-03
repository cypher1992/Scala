package com.local.AlgoWithDataStructure.Data_Structure

class VectorStructure{

  def appendVectorLambda[T](vec:Vector[T],value:T):Vector[T] = vec.appended(value)

  def appendVector[T](vec:Vector[T],value:T):Vector[T] = vec :+ value

  def findLamdaVector[T](query:T,vector:Vector[T]):Option[T] = vector.find(x => x == query)

  def findVector[T](query:T,vector:Vector[T]):Option[T] = {
    vector match {
      case a if(vector.isEmpty) => None
      case b if(vector.head == query) => Some(vector.head)
      case _ => findVector(query,vector.tail)
    }
  }
}
