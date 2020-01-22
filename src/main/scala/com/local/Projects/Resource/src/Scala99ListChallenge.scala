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

  def last[T](list:List[T]):T ={
    list match {
      case a if(list.isEmpty) =>  throw new java.util.NoSuchElementException
      case a if(list.size == 1) => list.head
      case a => last(list.tail)
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

  def penultimate[T](list:List[T]):T ={
    list match {
      case a if(list.isEmpty) =>  throw new java.util.NoSuchElementException
      case a if(list.size == 2) => list.head
      case a => penultimate(list.tail)
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

  def kth[T](position:Int,list:List[T]):T={

    list match {
      case a if(position == 0) => list.head
      case a if(position > 0 & position < list.size-1) => kth(position-1,list.tail)
      case _  => throw new java.util.NoSuchElementException
    }

  }

/*
P04 (*) Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
*/

def length(list:List[Int]):Int = if(list.size > 0) {list.size} else 0

def len[T](list:List[T]):Int ={
  val counter:Int = 0
  def countSize(total:Int =0,list:List[T]):Int ={
    list match {
      case a if(list.isEmpty) => total
      case _ => countSize(total+1,list.tail)
    }
  }
  countSize(counter,list)
}


/*
P05 (*) Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/

def reverse[T](list:List[T]):List[T] ={

  list match {
    case a if (list.size == 0) => Nil
    case _ => list.reverse
  }

}

def rev[T](list:List[T]):List[T] ={
  val reverseList:List[T] = List.empty[T]
 def revAppend(lst:List[T],emptyList:List[T] = reverseList):List[T] ={
   lst match {
     case a if(lst.isEmpty) => emptyList
     case _ => revAppend(lst.tail,lst.head +: emptyList)
   }
 }
  revAppend(list,reverseList)
}

/*
  P06 (*) Find out whether a list is a palindrome.
  Example:
  scala> isPalindrome(List(1, 2, 3, 2, 1))
  res0: Boolean = true

  Case: If Empty
  Case: Odd Size
  Case: Even Size
*/

  def isPalindrome[T](list:List[T]):Boolean = list == list.reverse

  def palindrome[T](list:List[T]):Boolean ={
    val halfSize:Int = list.size/2
    val (halfListA,halfListB) = list.splitAt(halfSize)

    if(list.isEmpty){
     false
    }
    else if(list.size%2 == 0){
      if(halfListA == halfListB.reverse){
        true
      }else {
        false
      }
    }
    else{
      if(halfListA == halfListB.tail.reverse){
        true
      }else {
        false
      }
    }

  }

/*
  P07 (**) Flatten a nested list structure.
  Example:
  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  case: What if there is a empty list of empty list
  case: List with empty and list of values
  case: What if it is already flatten
*/

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

/*
  Eliminate  duplicates of list elements.
  Example:
  scala> dedup(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'd, 'e)
  P09 (**) Pack duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.
  Example:

  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
*/

  def dedup[T](list:List[T]):List[T]= list.distinct

/*
  P08 (**) Eliminate consecutive duplicates of list elements.
  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  Example:

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
*/


  def compress[T](list:List[T]):List[T] ={

    val emptyList:List[T] = List.empty[T]


    def appendRepeat(lst:List[T],append:List[T]):List[T]={
      lst match{
        case a if(lst.isEmpty) => emptyList
        case a if(append.isEmpty || lst.head != append(append.size-1)) => appendRepeat(list.tail, lst.head +: append)
        case _ => appendRepeat(list.tail, append)
      }
    }

    appendRepeat(list,emptyList)
  }

}
