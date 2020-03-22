package com.local.AlgoWithDataStructure.Data_Structure

import scala.collection.immutable.Stream

class StreamStructure {

  def appendStream[T](stream:Stream[T],add:T):Stream[T] = stream.appended(add)

  
}
