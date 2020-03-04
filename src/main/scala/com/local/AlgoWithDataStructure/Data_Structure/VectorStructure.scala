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

  def emptyVector[T](vector: Vector[T]):Vector[T] = Vector.empty[T]

  def insertVector[T](position:Int,index:T,vector:Vector[T]):Vector[T] = {

    def appendVector[T](p:Int=position,i:T=index,vec:Vector[T]=vector,append:Vector[T] = Vector.empty[T]):Vector[T] ={
      vec match {
        case a if(vec.isEmpty) => append
        case b if(p == 0) => appendVector(p,i,Vector.empty[T],append ++ (i +:vec))
        case _ => appendVector(p-1,i,vec.tail,append :+ vec.head)
      }
    }

    position match {
      case a if( position < 0 || position> vector.size + 1) => throw new java.lang.IndexOutOfBoundsException
      case b if(vector.isEmpty && position == 0) => vector :+ index
      case _ => appendVector()
    }
  }
}
