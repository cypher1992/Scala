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

      println(
        s"""
          |pos: ${p}
          |index: ${i}
          |vector: ${vec}
          |append: ${append}
        """.stripMargin)

      vec match {
        case a if(p == 0) => append ++ (i +: vec)
        case _ => appendVector(p-1,i,vec.tail,append :+ vec.head)
      }
    }

    position match {
      case a if( position < 0 || position> vector.size) => throw new java.lang.IndexOutOfBoundsException
      case b if(vector.isEmpty && position == 0) => vector :+ index
      case _ => appendVector()
    }
  }

  def insertLambdaVector[T](position:Int,index:T,vector: Vector[T]):Vector[T] = vector.splitAt(position) match {
    case (prevec,postvec) => prevec ++( index +: postvec)
  }

  def updateVector[T](index:T,replacement:T,vector:Vector[T]):Vector[T] = {

    def updateAppend(i:T=index,r:T=replacement,vec:Vector[T]=vector,append:Vector[T]=Vector.empty[T]):Vector[T]={
      vec match {
        case a if(vec.isEmpty) => append
        case b if(vec.head == index) =>  updateAppend(i,r,vec.tail,append :+ r)
        case _ => updateAppend(i,r,vec.tail,append :+ vec.head)
      }
    }
    updateAppend()
  }

  def updateVectorLambda[T](index:T,replacement:T,vector:Vector[T]):Vector[T] = {

    def ifEquals[T](x:T,y:T=index,r:T=replacement):T ={
      if(x==y){
        r
      }
      else{
        x
      }
    }

    vector.map(ifEquals(_))

  }

  def groupByVector(vector:Vector[Int])=vector.groupBy(x => x%2 == 0)

}
