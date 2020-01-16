package com.local.Projects.Resource.src

class Scala99ListChallenge {
/*
P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
*/
  def lastElement(list: List[Int]): Any = {
    val listSize: Int = list.size
    listSize match {
      case listSize if (listSize > 0) => list(list.size - 1)
      case _ => Nil
    }
  }

/*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
*/

  def lastOfLastElement(list: List[Int]): Any= {
    val listSize:Int = list.size
    listSize match {
      case listSize if(listSize > 0 ) =>  list(listSize-2)
      case _ => Nil
    }
  }

/*
P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
*/

  def nth(position:Int,list:List[Int]):Any={
    position match{
      case pos if(list.isEmpty) => Nil
      case pos if(position> -1 & position <= list.size) => list(position-1)
      case _ => Nil
    }
  }

/*
P04 (*) Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
*/

def length(list:List[Int]):Int = if(list.size > 0) {list.size} else 0

}
