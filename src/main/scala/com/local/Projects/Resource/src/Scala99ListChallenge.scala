package com.local.Projects.Resource.src

import scala.util.Random._


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
  P16 (*) Drop Nth element from a list.
  Example:
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
*/

  def drop[T](position:Int,list:List[T]):List[T]={

    def del(pos:Int,lst:List[T],append:List[T]):List[T]={
      lst match{
        case a if(lst.isEmpty) =>append
        case b if(pos == 1) => append ::: lst.tail
        case _ => del(pos-1,lst.tail,append :+ lst.head)
      }

    }
    del(position,list,Nil)
  }


/*
  P17 (**) DropAdvance every Nth element from a list.
  Example:
  scala> dropAdvance(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/

  def dropAdvance[T](int:Int,list:List[T]):List[T]={

    def dropXn(pos:Int=int,lst:List[T]=list,append:List[T]=Nil):List[T] ={
      lst match {
        case a if(lst.isEmpty) => append
        case b if(pos == 1) => dropXn(int,lst.tail,append)
        case _ => dropXn(pos-1,lst.tail,append:+lst.head)
      }
    }

    dropXn()
  }

/*
  P18 (*) Split a list into two parts.
  The length of the first part is given. Use a Tuple for your result.
  Example:

  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*/

  def split[T](position:Int,list:List[T]):(List[T],List[T]) = {

    def splitAppend(pos:Int =position,lst:List[T]=list,append:List[T]=Nil):(List[T],List[T]) ={
      list match {
        case a if(lst.isEmpty) => (Nil,Nil)
        case b if(pos <1 || pos > lst.size ) => (Nil,lst)
        case c if(pos==1) => (append:+lst.head,lst.tail)
        case _ => splitAppend(pos-1,lst.tail,append :+ lst.head)
      }
    }
    splitAppend()
  }

/*
  P18 (**) Extract a slice from a list.
  Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  Example:

  scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g)
*/

  def slice[T](start:Int,end:Int,list:List[T]):List[T]={

    def sliceAppend(s:Int=start,e:Int=end,lst: List[T]=list,append:List[T]=Nil):List[T]={

      lst match{
        case a if(lst.isEmpty) => Nil
        case c if(e == 0) => append
        case d if(s == 0 ) => sliceAppend(s,e-1,lst.tail,append :+ lst.head)
        case _ => sliceAppend(s-1,e-1,lst.tail,append)
      }
    }

    list match{
      case a if(start < end) => sliceAppend()
      case _ => list
    }
  }

/*
  P19 (**) Rotate a list N places to the left.
  Examples:
  scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
*/

  // Needs to be Redone!  Doesnt work!
  def rotate[T](position:Int,list:List[T]):List[T] = {

    def rotateAppend(pos:Int =position,lst:List[T]=list,append:List[T]=Nil):List[T] ={
      list match {
        case a if(lst.isEmpty) => Nil
        case b if(pos <1 || pos > lst.size ) => lst
        case c if(pos==1) => lst.tail ::: (append:+lst.head)
        case _ => rotateAppend(pos-1,lst.tail,append :+ lst.head)
      }
    }
    rotateAppend()
  }

  def rotateRefact[T](position:Int,list:List[T]):List[T]={


    list match{
      case a if(list.isEmpty) => list
      case b if(position<0) => rotateRefact(list.size-(position* -1),list)
      case c if(position>0) =>rotateRefact(position-1,list.tail:+list.head)
      case _ => list

    }
  }

  /*
    P20 (*) Remove the Kth element from a list.
    Return the list and the removed element in a Tuple. Elements are numbered from 0.
    Example:

    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */


  def removeAt[T](position:Int,list:List[T]):Any={

    def rmAppend(pos:Int=position,lst:List[T]=list,append:List[T]=Nil):Any={
      lst match{
        case a if(lst.isEmpty) => append
        case b if(pos == 0) => (append ::: lst.tail,lst.head)
        case _  => rmAppend(pos-1,lst.tail,append :+ lst.head)
      }
    }

    rmAppend()
  }

  /*
    P21 (*) Insert an element at a given position into a list.
    Example:
    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */

  def insertAt[T](insert:T,position:Int,list:List[T]):List[Any] ={

    def insertAppend(ins:T=insert,pos:Int=position,lst:List[T]=list,append:List[T]=Nil):List[Any] ={

      lst match{
          case a if(lst.isEmpty || pos == lst.size )=> lst :+ ins
          case b if(pos < 0 || pos > lst.size) => Nil
          case d if(pos == 0) => (append :+ins ) ::: lst
          case _ => insertAppend(ins,pos-1,lst.tail,append:+lst.head)
      }
    }

    insertAppend()
  }

  /*
    P22 (*) Create a list containing all integers within a given range.
    Example:
    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */

  def range(start:Int,end:Int):List[Int] ={

    def rangeAppend(s:Int=start,e:Int=end,append:List[Int]=Nil):List[Int] ={

      s match {
        case a if(s == e ) => append :+ s
        case b if(s < e) => rangeAppend(s+1,e,append :+ s)
        case _ if(s > e) => rangeAppend(s-1,e,append :+s)
      }

    }

    rangeAppend()
  }


  /*
    P23 (**) Extract a given number of randomly selected elements from a list.
    Example:
    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)
  */

  def randomSelect[T](numberItems:Int,list:List[T]):List[T]={

   def generator(listGen:List[T]):Int = nextInt(listGen.size)

   def random(num:Int=numberItems, lst:List[T]=list,position:Int= generator(list),append:List[T]=Nil):List[T]={

     lst match{
       case a if(num == 0) => append
       case b if(lst.size == 1) => append ::: lst
       case c if(position == 0) => random(num-1,lst.tail,generator(lst.tail),append:+lst.head)
       case _ => random(num,lst.tail :+ lst.head,position-1,append)
     }

   }

    list match {
      case a if(numberItems < 1 || list.isEmpty) => list
      case _ => random()
    }

  }

  /*
    P24 (*) Lotto: Draw N different random numbers from the set 1..M.
    Example:
    scala> lotto(6, 49)
    res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */


  def lotto(size:Int,max:Int):List[Int] ={

    def rangeList(maxSize:Int = max, lst:List[Int]=Nil):List[Int]={
      maxSize match {
        case a if(maxSize ==1) => lst:+1
        case _ => rangeList(maxSize-1,lst :+ maxSize)
      }
    }

    max match{
      case a if(max<1 || size <1) => Nil
      case _ => randomSelect(size,rangeList())
    }

  }

  /*
    P25 (*) Generate a random permutation of the elements of a list.
    Hint: Use the solution of problem P23.
    Example:

    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  */

  def randomPermute[T](list:List[T]):List[T]={
    randomSelect(list.size,list)
  }

  /*
    P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
    In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
    12C3 -> 12! / 3!*(12-3)! = 12*11*10*9*8*7*6*5*4*3*2*1/3*2*1(9*8*7*6*5*4*3*2*1) = 12*11*10*9*8*7*6*5*4/9*8*7*6*5*4*3*2*1 = 12*11*10/3*2*1 = 220
    Example:

    scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
    6C3 => 6!/3!(6-3)! = 6!/3!*3! = 6*5*4/3*2*1 = 5*4/1 = 20 possibilities
  */

  def calculateFactorial(number:Int,store:Int = 1):Int= {

    number match{
      case 0 => 0
      case 1 => store
      case _ => calculateFactorial(number-1,number*store)
    }
  }

  def calculatePermutation(numberOfObjects:Int,options:Int):Int={
    (numberOfObjects,options) match {
      case (0,_) => 1
      case (_,0) => 1
      case _ => calculateFactorial(numberOfObjects)/(calculateFactorial(options)*calculateFactorial(numberOfObjects-options))
    }

  }

  def combinations[T](int:Int,list:List[T]):List[List[T]] = {

    List(Nil)
  }
}

