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

}
