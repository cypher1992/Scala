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
  (*) Pack duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.
  Example:

  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
*/

  def dedup[T](list:List[T]):List[T]= list.distinct


  def rmDuplicates[T](list:List[T]):List[T]={

    val emptyList:List[T] = List.empty[T]

    def appendDistinct(lst:List[T],append:List[T]):List[T]={

      list match {
        case a if(lst.isEmpty) => append
        case a if(append.isEmpty) => appendDistinct(lst.tail,append :+ lst.head)
        case a if(append.exists(index => index == lst.head)) => appendDistinct(lst.tail,append)
        case _ => appendDistinct(lst.tail,append :+ lst.head)
      }
    }

    appendDistinct(list,emptyList)
  }



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
        case a if(lst.isEmpty) => append
        case a if(append.isEmpty) => appendRepeat(lst.tail, lst.head +: append)
        case a if(lst.head != append(append.size-1)) => appendRepeat(lst.tail, append :+ lst.head  )
        case _ => appendRepeat(lst.tail, append)
      }
    }
    appendRepeat(list,emptyList)
  }

/*
  P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/


  def pack[T](list:List[T]): List[List[T]] ={

    val emptyList:List[List[T]] = List.empty
    val tempList:List[T] = List.empty[T]

    def combineList(lst:List[T],append:List[List[T]],temp:List[T]): List[List[T]]={

      lst match {
        case a if(lst.isEmpty) => append :+ temp
        case b if(temp.isEmpty) => combineList(lst.tail,append,temp:+ lst.head)
        case c if(lst.head == temp(temp.size-1)) =>  combineList(lst.tail,append,temp:+ lst.head)
        case _   => combineList(lst.tail,append :+ temp,temp.empty :+ lst.head)
      }

    }
    list match {
      case a if(list.isEmpty) => emptyList
      case _ => combineList(list,emptyList,tempList)
    }
  }

/*
  P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
Example:

scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    - empty list is a case
    - List of chars
*/

  def encode[T](list:List[T]):List[Tuple2[Int,T]] ={
      val emptyList:List[Tuple2[Int,T]] = List.empty[Tuple2[Int,T]]

      def getTupleIntChar(listChar:List[T]):Tuple2[Int,T] ={
        Tuple2(listChar.size,listChar(0))
      }

      def encodeTuple(lst:List[List[T]],append:List[Tuple2[Int,T]]):List[Tuple2[Int,T]] = {
        lst match {
          case a if(lst.isEmpty) => append
          case _ => encodeTuple(lst.tail,append :+ getTupleIntChar(lst.head))
        }
      }

    list match{

      case a if(list.isEmpty) => emptyList
      case _ => encodeTuple(pack(list),emptyList)
    }

  }

 /*
    P11 (*) Modified run-length encoding.
    Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
    Example:

    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 */


  def encodeModified[T](list:List[T]):List[Any]={

    val emptyList:List[Tuple2[Int,T]] = List.empty[Tuple2[Int,T]]

    def getTupleIntChar(listChar:List[T]):Any ={
      listChar match{
        case a if(listChar.size<2) => listChar(0)
        case _ => Tuple2(listChar.size,listChar(0))
      }
    }

    def encodeTuple(lst:List[List[T]],append:List[Any]):List[Any] = {
      lst match {
        case a if(lst.isEmpty) => append
        case _ => encodeTuple(lst.tail,append :+ getTupleIntChar(lst.head))
      }
    }

    list match{

      case a if(list.isEmpty) => emptyList
      case _ => encodeTuple(pack(list),emptyList)
    }
  }

  /*
    P12 (**) Decode a run-length encoded list.
    Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
    Example:

    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */

    def decode[T](list:List[Tuple2[Int,T]]):List[T]={

      def decodeAppender(lst:List[Tuple2[Int,T]],append:List[T],tup:Tuple2[Int,T]):List[T] ={

        lst match {
          case a if(lst.isEmpty && tup._1 == 0) => append
          case b if(tup._1 > 0) => decodeAppender(lst, append :+ tup._2,(tup._1-1,tup._2))
          case _ => decodeAppender(lst.tail,append,lst.head)
        }
      }

      list match{
        case a if(list.isEmpty) => Nil
        case _ => decodeAppender(list.tail,Nil,list.head)
      }

    }

  /*
    P13 (**) Run-length encoding of a list (direct solution).
    Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
    Example:

    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */

  def encodeDirect[T](list:List[T]):List[Tuple2[Int,T]]={

    def encDirAppend(lst:List[T],append:List[Tuple2[Int,T]],tup:Tuple2[Int,T]):List[Tuple2[Int,T]]={

        lst match{
          case a if(lst.isEmpty) => append :+ tup
          case b if(tup._2 == lst.head) => encDirAppend(lst.tail,append,Tuple2(tup._1+1,tup._2))
          case _ =>  encDirAppend(lst.tail,append :+ tup,Tuple2(1,lst.head))
        }
      }

    list match{
      case a if(list.isEmpty) => Nil
      case _ =>  encDirAppend(list.tail,Nil,(1,list.head))
    }
  }

/*
    P14 (*) Duplicate the elements of a list.
    Example:
    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/

  def duplicate[T](list:List[T]):List[T]={

    def appendDup(index:T,count:Int,append:List[T]):List[T]={

      count match{
        case a if(count != 0) => appendDup(index,count-1,append :+ index)
        case _ => append
      }
    }

    def dups(lst:List[T],emptyList:List[T] =Nil,counter:Int = 1):List[T]={

      lst match {
        case a if(lst.isEmpty) => emptyList
        case b if(lst.size == 1) => appendDup(lst.head,counter*2,emptyList)
        case c if(lst.head == lst.tail.head) => dups(lst.tail,emptyList,counter+1)
        case _ => dups(lst.tail,appendDup(lst.head,counter*2,emptyList),1)
      }
    }

    dups(list)
  }

  /*
    P15 (**) Duplicate the elements of a list a given number of times.
    Example:
    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */


  def duplicateN[T](list:List[T],multiplier:Int=1):List[T]={

    def appendDup(index:T,count:Int,append:List[T]):List[T]={

      count match{
        case a if(count != 0) => appendDup(index,count-1,append :+ index)
        case _ => append
      }
    }

    def dups(lst:List[T],emptyList:List[T] =Nil,counter:Int = 1):List[T]={

      lst match {
        case a if(lst.isEmpty) => emptyList
        case b if(lst.size == 1) => appendDup(lst.head,counter*multiplier,emptyList)
        case c if(lst.head == lst.tail.head) => dups(lst.tail,emptyList,counter+1)
        case _ => dups(lst.tail,appendDup(lst.head,counter*multiplier,emptyList),1)
      }
    }

    dups(list)
  }

/*
  P16 (**) Drop Nth element from a list.
  Example:
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
*/

  def drop[T](position:Int,list:List[T]):List[T]={

    def del(pos:Int,lst:List[T],append:List[T]):List[T]={
      lst match{
        case a if(lst.isEmpty) =>append
        case b if(pos == 0) => append ::: lst.tail
        case _ => del(pos-1,lst.tail,append :+ lst.head)
      }

    }
    del(position,list,Nil)
  }


}

