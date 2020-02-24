package com.local.AlgoWithDataStructure.Data_Structure
import scala.collection.mutable.ArrayBuffer
class ArrayStructure{
  /*
    Arrays follow O(1) in the Asymptotic
    Arrays are linear data structure
    Arrays start at 0 and end at n-1; n represents the size of the array
    Array doe not grow in size after initialization so we use ArrayBuffer

    URL:https://alvinalexander.com/scala/scala-mutable-arrays-adding-elements-to-arrays
    Obj: Array vs ArrayBuffer
    Info: Just a quick note today that if you want to create a mutable Scala array — particularly an array that can grow in size after you first declare it — you need to use the Scala ArrayBuffer class instead of the Array class
  */
  def multiply2(array:ArrayBuffer[Int]):ArrayBuffer[Int] ={
    array match{
      case a if(array.isInstanceOf[ArrayBuffer[Int]]) => array.map(_ * 2)
    }
  }

  def mergeArray[T](array:ArrayBuffer[T],array2:ArrayBuffer[T]):ArrayBuffer[T] ={
    array2.size match {
      case 0 => array
      case _ => mergeArray(array :+ array2.head,array2.tail)
    }
  }

  def mergeArrayLambda[T](array:ArrayBuffer[T],array2:ArrayBuffer[T]):ArrayBuffer[T] = array ++ array2
}
