package com.local.AlgoWithDataStructure.Data_Structure

class GraphStructure[T](list:List[Tuple2[T,T]]){

  def getList():List[Tuple2[T,T]] = this.list

  def calcSuccessorSet(vertex:T,graph:List[Tuple2[T,T]]=this.getList()):List[T] = {
    graph match {
      case Nil => Nil
      case x :: xs if(vertex == x._1) => x._2 ::  calcSuccessorSet(vertex,xs)
      case _ :: xs =>   calcSuccessorSet(vertex,xs)
    }
  }

}
