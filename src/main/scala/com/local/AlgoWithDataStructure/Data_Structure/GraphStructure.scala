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

  def traverseDepthFirst(start:T,graph:List[Tuple2[T,T]]):List[T] ={

    def depthFirst(vertices:List[T], visited:List[T]):List[T] = vertices match  {
      case Nil => visited
      case x :: xs => depthFirst(xs,
        if(visited.contains(x)) visited
        else depthFirst(calcSuccessorSet(x,graph),x ::visited))
    }
    depthFirst(List(start),List.empty[T]).reverse
  }

  def traverseBreadthFirst(start:T,graph:List[Tuple2[T,T]]):List[T] ={
    def breadthFirst(vertice:List[T],visited:List[T]):List[T]= vertice match {
      case Nil => visited
      case x :: xs  if visited.contains(x) => breadthFirst(xs,visited)
      case x :: xs => breadthFirst(xs ++ calcSuccessorSet(x,graph), x :: visited)
    }
    breadthFirst(List(start),List.empty[T]).reverse
  }

}
