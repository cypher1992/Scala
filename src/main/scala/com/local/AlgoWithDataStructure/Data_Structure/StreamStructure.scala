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

  def updateSteam[T](value:T,replacement:T,stream:Stream[T]):Stream[T] = {

    def updateStreamAppend(v: T = value, r: T = replacement, s: Stream[T] = stream, appendStream: Stream[T] = Stream.empty[T]): Stream[T] = {
      s match {
        case a if (s.isEmpty) => appendStream
        case b if (s.head == v) => appendStream :+ r
        case _ => updateStreamAppend(v, r, s.tail, appendStream :+ s.head)
      }
    }
    updateStreamAppend()
  }

  def replaceValue[T](index:T,value:T,replacement:T):T  ={
    index match{
      case a if(value == index) => replacement
      case _ => index
    }
  }

  def updateLambdaStream[T](value:T,replacement:T,stream:Stream[T]):Stream[T]= stream.map( (a) => this.replaceValue(a,value,replacement) )

  def removeStream[T](value:T,stream:Stream[T]):Stream[T] = {
    def removeAppend(v:T=value,stm:Stream[T]=stream,appendStream:Stream[T]=Stream.empty[T]):Stream[T] ={
      stm match {
        case a if(stm.empty) => appendStream
        case a if(v == stm.head) =>  removeAppend(v,stm.tail,appendStream)
        case _ => removeAppend(v,stm.tail, appendStream :+ stm.head)
      }
    }
    removeAppend()
  }


}
