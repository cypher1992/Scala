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

  def findStream[T](value:T,stream:Stream[T]):Option[T] ={
    stream match {
      case a if(stream.isEmpty) => None
      case b if(stream.head == value) => Some(stream.head)
      case _ => findStream(value,stream.tail)
    }
  }

}
