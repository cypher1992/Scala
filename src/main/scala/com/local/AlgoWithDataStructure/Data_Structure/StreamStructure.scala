package com.local.AlgoWithDataStructure.Data_Structure

import scala.collection.immutable.Stream

/*
  Notes:
   - Stream is deprecated.
   - Stream implements both lazy and memoization
*/

class StreamStructure {

  def appendLambdaStream[T](stream:Stream[T],add:T):Stream[T] = stream.appended(add)
  def appendStream[T](stream:Stream[T],add:T):Stream[T] = stream :+ add


  def findStream[T](value:T,stream:Stream[T]):Boolean ={
    stream match {
      case a if(stream.isEmpty) => false
      case b if(stream.head == value) => true
      case _ => findStream(value,stream.tail)
    }
  }

  def findLambdaStream[T](value:T,stream:Stream[T]):Boolean = stream.contains(value)

}
