package com.Scala99Test.ListTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Projects.Resource.src.Scala99ListChallenge

class ListTest extends  AnyFlatSpec with Matchers {

  val sl99: Scala99ListChallenge = new Scala99ListChallenge()

  behavior of "Scala99ListChallenge"

  /*
    P01 (*) Find the last element of a list.
    Example:
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8

    def lastElement(list:List[Int])=
      list match{
        case list.size > 0  => list(list.size-1)
        case _ => Nil
      }

    def last[T](list:List[T]):T ={
      list match {
        case a if(list.size == 0) => list.head
        case _ => last(list.tail)
      }
    }
   */

  "Scala99ListChallenge Test: Empty List" should "Return Nil" in {

    val emptyList: List[Int] = List.empty[Int]
    val actualNil: Any = sl99.lastElement(emptyList)
    val expectedNil: Any = Nil

    assert(actualNil === expectedNil)
  }

  "Scala99List Challenge Test: List with 3 Values List(1,2,3)" should "Return Last Position: Value 3" in {

    val list: List[Int] = List.range(1, 4)
    val actualLastValue: Any = sl99.lastElement(list)
    val expectedLastValue: Any = 3

    assert(actualLastValue === expectedLastValue)

  }

  "Scala99ListChallenge Test: Last Func: Empty List" should "Throw Exception" in {

    val emptyList: List[Int] = List.empty[Int]

    assertThrows[java.util.NoSuchElementException] {
      sl99.last(emptyList)
    }
  }

  "Scala99List Challenge Test: Last Func: List with 3 Values List(1,2,3)" should "Return Last Position: Value 3" in {

    val list: List[Int] = List.range(1, 4)
    val actualLastValue: Any = sl99.last(list)
    val expectedLastValue: Any = 3

    assert(actualLastValue === expectedLastValue)

  }


  /*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))


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
      case a => last(list.tail)
    }
  }
*/

  "Scala99List Challenge Test: lastOfLastElement: Empty List" should "Expect Nil" in {
    val emptyList: List[Int] = List.empty[Int]
    val actualNil: Any = sl99.lastOfLastElement(emptyList)
    val expectedNil: Any = Nil

    assert(actualNil === expectedNil)
  }

  "Scala99List Challenge Test: lastOfLastElement: List(1,2,3,4)" should "Expect Value 3" in {
    val list: List[Int] = List.range(1, 5)
    val actualIndex: Any = sl99.lastOfLastElement(list)
    val expectedIndex: Any = 3

    assert(actualIndex === expectedIndex)
  }

  "Scala99List Challenge Test: penultimate: Empty List" should "Throws NoSuchElement Exception" in {
    val emptyList: List[Int] = List.empty[Int]
    assertThrows[java.util.NoSuchElementException] {
      sl99.penultimate(emptyList)
    }
  }

  "Scala99List Challenge Test: penultimate: List(1,2,3,4)" should "Expect Value 3" in {
    val list: List[Int] = List.range(1, 5)
    val actualIndex: Any = sl99.penultimate(list)
    val expectedIndex: Any = 3

    assert(actualIndex === expectedIndex)
  }


  /*
  P03 (*) Find the Kth element of a list.
  By convention, the first element in the list is element 0.
  Example:
  scala> nth(2, List(1, 1, 2, 3, 5, 8))
  res0: Int = 2

  def nth(position:Int,list:List[Int]):Any={
    position match{
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
*/

  "Scala99List Challenge Test: nth position of an Empty list" should "returns Nil" in {

    val emptyList: List[Int] = List.empty[Int]
    val actualNil: Any = sl99.nth(0, emptyList)
    val expectedNil: Any = Nil
    assert(actualNil === expectedNil)
  }

  "Scala99List Challenge Test: nth position of an List with Index out of bound index" should "returns Nil" in {

    val list: List[Int] = List.range(1, 4)
    val actual: Any = sl99.nth(6, list)
    val expected: Any = Nil

    assert(actual === expected)
  }


  "Scala99List Challenge Test: nth position of 2" should "returns 2" in {

    val list: List[Int] = List.range(1, 4)
    val actual: Any = sl99.nth(2, list)
    val expected: Any = 2

    assert(actual === expected)
  }


  "Scala99List Challenge Test: kth position of an Empty List" should "throws NoSuchElement Exception" in {
    val emptyList: List[Int] = List.empty[Int]

    assertThrows[java.util.NoSuchElementException] {
      sl99.kth(0, emptyList)
    }
  }

  "Scala99List Challenge Test: Position greater than list size" should "throws NosuchElement Exception" in {
    val list: List[Int] = List.range(1, 5)
    val listSizePlus1: Int = list.size + 1
    assertThrows[java.util.NoSuchElementException] {
      sl99.kth(listSizePlus1, list)
    }
  }

  "Scala99List Challenge Test: kth list of position is 2" should "return 3" in {
    val list: List[Int] = List.range(1, 5)
    val actual: Int = sl99.kth(2, list)
    val excepted: Int = 3

    assert(actual == excepted)
  }

  /*
  P04 (*) Find the number of elements of a list.
  Example:
  scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6

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
*/
  "Scala99List Challenge Test: length() List is empty" should "returns 0" in {

    val list: List[Int] = List.empty[Int]
    val actual: Int = sl99.length(list)
    val expected: Int = 0

    assert(actual === expected)
  }

  "Scala99List Challenge Test: length() List(1,2,3,4)" should "returns 4" in {

    val list: List[Int] = List.range(1, 5)
    val actual: Int = sl99.length(list)
    val expected: Int = 4

    assert(actual === expected)
  }

  "Scala99List Challenge: Len() with Empty List" should "returns 0" in {
    val emptyList: List[Int] = List.empty[Int]
    val actual: Int = sl99.len(emptyList)
    val expected: Int = 0

    assert(actual === expected)
  }

  "Scala99List Challenge: Len() with List(1,2,3,4)" should "returns 4" in {
    val list: List[Int] = List.range(1, 5)
    val actual: Int = sl99.len(list)
    val expected: Int = 4

    assert(actual === expected)
  }


  /*
  P05 (*) Reverse a list.
  Example:
  scala> reverse(List(1, 1, 2, 3, 5, 8))
  res0: List[Int] = List(8, 5, 3, 2, 1, 1)

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
         case a if(lst.isEmpty) => Nil
         case _ => revAppend(lst.tail,lst.head +: emptyList)
       }
     }
   revAppend(list,reverseList)
  }
  */

  "Scala99List Challenge: Rev() Pass Empty List" should "Empty List" in {
    val emptyList: List[Int] = List.empty[Int]
    val actual: List[Int] = sl99.rev(emptyList)
    val expected: List[Int] = emptyList

    assert(actual === expected)
  }

  "Scala99List Challenge: Rev() Pass List of Char" should "Reverse List" in {
    val list: List[Char] = List('A', 'B', 'C', 'D')
    val expected: List[Char] = sl99.rev(list)
    val actual = List('D', 'C', 'B', 'A')

    assert(expected === actual)
  }

  /*
    P06 (*) Find out whether a list is a palindrome.
    Example:
    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true

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
  */
  "Scala99List Challenge: Palindrome Func: Empty List" should "Return False" in {
    val emptyList: List[Int] = List.empty[Int]
    val actual: Boolean = sl99.palindrome(emptyList)
    val expected: Boolean = false

    assert(actual === expected)
  }

  "Scala99List Challenge: Palindrome Func: Even Palindrome List" should "Return True" in {
    val evenList: List[Int] = List(1, 2, 2, 1)
    val actual: Boolean = sl99.palindrome(evenList)
    val excepted: Boolean = true

    assert(actual === excepted)
  }

  "Scala99List Challenge: Palindrome Func: Even Regular List" should "Return False" in {
    val evenList: List[Int] = List(1, 2, 1, 2)
    val actual: Boolean = sl99.palindrome(evenList)
    val excepted: Boolean = false

    assert(actual === excepted)
  }

  "Scala99List Challenge: Palindrome Func: Odd List" should "Return True" in {
    val oddList: List[Int] = List(1, 2, 3, 2, 1)
    val actual: Boolean = sl99.palindrome(oddList)
    val excepted: Boolean = true

    assert(actual === excepted)
  }

  "Scala99List Challenge: Palindrome Func: Odd Regular List" should "Return False" in {
    val oddList: List[Int] = List(1, 2, 3, 1, 2)
    val actual: Boolean = sl99.palindrome(oddList)
    val excepted: Boolean = false

    assert(actual === excepted)
  }

  /*
  P07 (**) Flatten a nested list structure.
  Example:
  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  case: What if there is a empty list of empty list
  case: List with empty and list of values
  case: What if it is already flatten

  //NS - ANS
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
*/

  "Scala99List Challenge: Flatten -> Empty List of Empty List" should "=> Empty List" in {

    val emptyNestedEmptyList: List[Any] = List(List.empty[Any], List.empty[Any])
    val actual: List[Any] = sl99.flatten(emptyNestedEmptyList)
    val expected: List[Any] = List.empty[Any]

    assert(actual == expected)
  }


  "Scala99List Challenge: Flatten ->  List of List with Empty List" should "=> List" in {


  val list:List[Any] = List(List(1,2),3,List(9,8,4,List(11,7),5))
  val actual:List[Any] = sl99.flatten(list)
  val expected:List[Any] = List(1,2,3,9,8,4,11,7,5)

  assert(actual == expected)
}

/*
  Eliminate  duplicates of list elements.
  Example:
  scala> dedup(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'd, 'e)
  P09 (**) Pack consecutive duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.
  Example:

  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

  def dedup[T](list:List[T]):List[T]= list.distinct

  def rmDuplicates[T](list:List[T]):List[T]={

    val emptyList:List[T] = List.empty[T]

    def appendDistinct(lst:List[T],append:List[T]):List[T]={

      list match {
        case a if(lst.isEmpty) => append
        case a if(append.isEmpty) => appendDistinct(list.tail,append :+ lst.head)
        case a if(append.exists(index => index == lst.head)) => appendDistinct(list.tail,append)
        case _ => appendDistinct(list.tail,append :+ lst.head)
      }
    }

    appendDistinct(list,emptyList)
  }

*/

  "Scala99List Challenge: dedup Func empty list of empty list" should "List of empty list" in {

    val emptyList:List[Any] = List(List.empty[Int],List.empty[Int],List(List.empty[Int]))
    val actual:List[Any] = sl99.dedup(emptyList)
    val expected:List[Any] = List(List(), List(List()))

    assert(actual == expected)
  }


  "Scala99List Challenge: dedup func List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)" should "Return List('a, 'b, 'c, 'd, 'e)" in {

    val list:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[Char] = sl99.dedup(list)
    val expected:List[Char] = List('a', 'b', 'c', 'd', 'e')

    assert(actual == expected)
  }


  "Scala99List Challenge: rmDuplicates Func empty list of empty list" should "Empty list" in {

    val emptyList:List[Any] = List.empty[Any]
    val actual:List[Any] = sl99.rmDuplicates(emptyList)
    val expected:List[Any] = List.empty[Any]
    assert(actual == expected)
  }

  "Scala99List Challenge: rmDuplicates func List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)" should "Return List('a, 'b, 'c, 'd, 'e)" in {

    val list:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[Char] = sl99.rmDuplicates(list)
    val expected:List[Char] = List('a', 'b', 'c', 'd', 'e')

    assert(actual == expected)
  }

  /*
  P08 (**) Eliminate consecutive duplicates of list elements.
    If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
    Example:

    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

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

  */

  "Scala99List Challenge: compress func Empty List" should "Return Empty List" in {

    val list:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.compress(list)
    val expected:List[Char] = Nil

    assert(actual == expected)
  }

  "Scala99List Challenge: compress func List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)" should "Return List('a, 'b, 'c, 'a, 'd, 'e)" in {

    val list:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[Char] = sl99.compress(list)
    val expected:List[Char] = List('a', 'b', 'c','a', 'd', 'e')

    assert(actual == expected)
  }

  /*
  P09 (**) Pack consecutive duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.
  Example:

  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/

  "Scala99List Challenge: pack Func with Empty List" should "Return empty" in{

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[List[Any]] = sl99.pack(emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)
  }

  "Scala99List Challenge: pack Func with List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)" should "return List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))" in{

    val list:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[List[Char]] = sl99.pack(list)
    val expected:List[List[Char]] = List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))

    assert(actual == expected)

  }

  /*
  P10 (*) Run-length encoding of a list.
  Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  Example:

  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    - empty list is a case
    - List of chars

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

*/


  "Scala99List Challenge: encode Func with Empty List" should "return empty list" in {

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Tuple2[Int,Char]] = sl99.encode(emptyList)
    val expected:List[Tuple2[Int,Char]] = List.empty[Tuple2[Int,Char]]

    assert(actual == expected)

  }


  "Scala99List Challenge: encode Func with Char list" should "return encoded list with chars and int" in {

    val charList:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[Tuple2[Int,Char]] = sl99.encode(charList)
    val expected:List[Tuple2[Int,Char]] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))

    assert(actual == expected)
  }

  /*
    P11 (*) Modified run-length encoding.
    Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
    Example:

    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

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
 */

  "Scala99List Challenge: encodeModified Func: Empty" should "Returns Empty List" in{

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Any] = sl99.encodeModified(emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)

  }
  "Scala99List Challenge: encodeModifed Func: List[Tuple2[Int,T]" should "Returns List[Any]" in {

    val charList:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[Any] = sl99.encodeModified(charList)
    val expected:List[Any] = List((4,'a'), 'b', (2,'c'), (2,'a'), 'd', (4,'e'))

    assert(actual == expected)
  }


  /*
   P12 (**) Decode a run-length encoded list.
   Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
   Example:

   scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
   res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

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

 */

    "Scala99List Challenge decode Func: Empty List[Char]" should "Returns Empty List" in {

      val emptyList:List[Tuple2[Int,Char]] = List.empty[Tuple2[Int,Char]]
      val actual:List[Char] = sl99.decode(emptyList)
      val expected:List[Tuple2[Int,Char]] = List.empty[Tuple2[Int,Char]]

      assert(actual == expected)
    }


    "Scala99List Challenge decode Func: List[Tuple2[Int,Char]]" should "Returns List[Char]" in{

      val list:List[Tuple2[Int,Char]] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))
      val actual:List[Char] = sl99.decode(list)
      val expected:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

      assert(actual == expected)
    }


  /*
    P13 (**) Run-length encoding of a list (direct solution).
    Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
    Example:

    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

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

  */

  "Scala99List Challenge EncodeDirect Func: Empty List" should "Returns Empty List" in {
    val emptyList = List.empty
    val actual:List[Tuple2[Int,Char]] = sl99.encodeDirect(emptyList)
    val expected = List.empty

    assert(actual == expected)
  }

  "Scala99List Challenge EncodeDirect: List[Char]" should "Return List[Tuple2[Int,Char]]" in{
    val list:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val actual:List[Tuple2[Int,Char]] = sl99.encodeDirect(list)
    val expected:List[Tuple2[Int,Char]] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))

    assert(actual == expected)
  }

  /*
    P14 (*) Duplicate the elements of a list.
    Example:
    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)


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
  */

  "Scala99List Challenge Duplicate Func: Empty List" should "Empty List" in {

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.duplicate(emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)

  }

  "Scala99List Challenge Duplicate Func: List[Char]" should "ListChar Duplicte" in{

    val list:List[Char] = List('A','B','C','D')
    val actual:List[Char] = sl99.duplicate(list)
    val expected:List[Char] = List('A','A','B','B','C','C','D','D')

    assert(actual == expected)
  }

  "Scala99List Challenge Duplicate Func: Variation List[Char]" should "ListChar Duplicates" in{

    val list:List[Char] = List('A','B','C','C','D')
    val actual:List[Char] = sl99.duplicate(list)
    val expected:List[Char] = List('A','A','B','B','C','C','C','C','D','D')

    assert(actual == expected)
  }

  /*
    P15 (**) Duplicate the elements of a list a given number of times.
    Example:
    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

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
  */

  "Scala99List Challenge duplicateN Func: Empty List" should "Empty List" in {

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.duplicateN(emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)

  }

  "Scala99List Challenge duplicateN Func: List[Char](2X)" should "ListChar Duplicte" in{

    val list:List[Char] = List('A','B','C','D')
    val actual:List[Char] = sl99.duplicateN(list,2)
    val expected:List[Char] = List('A','A','B','B','C','C','D','D')

    assert(actual == expected)
  }

  "Scala99List Challenge duplicateN Func: Variation List[Char]" should "ListChar Duplicates" in{

    val list:List[Char] = List('a', 'b', 'c', 'c', 'd')
    val actual:List[Char] = sl99.duplicateN(list,3)
    val expected:List[Char] = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')

    assert(actual == expected)
  }

  "Scala99List Challenge duplicateN Func: Variation List[Chars]" should "ListChar Duplicates" in{

    val list:List[Char] = List('a', 'b', 'c', 'c', 'd','e')
    val actual:List[Char] = sl99.duplicateN(list,3)
    val expected:List[Char] = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd','e','e','e')

    assert(actual == expected)
  }

  /*
  P16 (**) Drop Nth element from a list.
  Example:
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

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

  */

  "Scala99list Challenge drop(0,emptyList)" should "Empty List" in {
    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.drop(0,emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)
  }

  "Scala99List Challenge drop(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))" should "return List('a', 'b', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')" in{

    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.drop(3,list)
    val expected:List[Char] = List('a', 'b', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    assert(actual == expected)
  }

  /*
  P17 (**) DropAdvance every Nth element from a list.
  Example:
  scala> dropAdvance(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

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

*/

  "Scala99list Challenge dropAdvance(0,emptyList)" should "Empty List" in {
    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.dropAdvance(0,emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)
  }

  "Scala99List Challenge dropAdvance(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))" should "return List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)" in{

    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.dropAdvance(3,list)
    val expected:List[Char] = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')

    assert(actual == expected)
  }

  /*
    P18 (*) Split a list into two parts.
    The length of the first part is given. Use a Tuple for your result.
    Example:

    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

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

  */

  "Scala99List Challenge: Split(Empty)" should "Return: (Nil,Nil)" in{

    val emptyList:List[Char] = List.empty[Char]
    val actual:Any = sl99.split(2,emptyList)
    val expected:(List[Char],List[Char]) = (List.empty[Char],List.empty[Char])

    assert(actual == expected)
  }

  "Scala99List Challenge: Split(0,List('A','B','C','D'))" should "Return: (Nil,List)" in{

    val list:List[Char] = List('A','B','C','D')
    val actual:Any = sl99.split(0,list)
    val expected:(List[Char],List[Char]) = (List.empty[Char],list)

    assert(actual == expected)
  }

  "Scala99List Challenge: Split(list.size+1,List('A','B','C','D'))" should "Return: (Nil,List)" in{

    val list:List[Char] = List('A','B','C','D')
    val sizePlus1:Int = list.size+1
    val actual:Any = sl99.split(sizePlus1,list)
    val expected:(List[Char],List[Char]) = (List.empty[Char],list)

    assert(actual == expected)
  }


  "Scala99List Challenge: Split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))" should "Return (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))" in {

    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:Any = sl99.split(3,list)
    val expected:(List[Char],List[Char]) = (List('a', 'b', 'c'),List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))

    assert(actual == expected)
  }

  /*
  P18 (**) Extract a slice from a list.
  Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  Example:

  scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */

  "Scala99List Challenge: Slice(0,2,EmptyList)" should "Return EmptyList" in{
    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.slice(0,2,emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)
  }

  "Scala99List Challenge: Slice(0,0,List)" should "Return List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')" in{
    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.slice(0,0,list)
    val expected:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    assert(actual == expected)
  }

  "Scala99List Challenge: Slice(3,7,List)" should "Return List('d, 'e, 'f, 'g)" in{
    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.slice(3,7,list)
    val expected:List[Char] = List('d', 'e', 'f', 'g')

    assert(actual == expected)
  }



  /*
    P19 (**) Rotate a list N places to the left.
    Examples:
    scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

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
 */

  "Scala99List Challenge rotate(List.empty)" should "Return empty list" in {
    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.rotate(4,emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)
  }

  "Scala99List Challenge Rotate(-1,List)" should "Return List[Char]" in {
    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.rotate(-1,list)
    val expected:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    assert(actual == expected)
  }

  "Scala99List Challenge rotateRefact(List.empty)" should "Return empty list" in {
    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.rotateRefact(4,emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)
  }

  "Scala99List Challenge rotateRefact(3,List)" should "Return List[Char]" in {
    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.rotateRefact(3,list)
    val expected:List[Char] = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')

    assert(actual == expected)
  }

  "Scala99List Challenge rotateRefact(-1,List)" should "Return List[Char]" in {
    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.rotateRefact(-1,list)
    val expected:List[Char] = List('k','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j')

    assert(actual == expected)
  }


  "Scala99List Challenge rotateRefact(-4,List)" should "Return List[Char]" in {
    val list:List[Char] = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val actual:List[Char] = sl99.rotateRefact(-4,list)
    val expected:List[Char] = List( 'h', 'i', 'j','k','a', 'b', 'c', 'd', 'e', 'f', 'g')

    assert(actual == expected)
  }

  /*
    P20 (*) Remove the Kth element from a list.
    Return the list and the removed element in a Tuple. Elements are numbered from 0.
    Example:

    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

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

  */

  "Scala99List Challenge: removeAt(EmptyList)" should "Returns Empty List" in {
    val emptyList:List[Char] = List.empty[Char]
    val actual:Any = sl99.removeAt(1,emptyList)
    val expected:Any = Nil

    assert(actual == expected)
  }

  "Scala99List Challenge: removeAt(List[Char])" should "Return (Char,List[Char])" in {
    val list:List[Char] = List('A','B','C','D')
    val actual:Any = sl99.removeAt(1,list)
    val expected:Any = Tuple2(List('A','C','D'),'B')

    assert(actual === expected)
  }

  /*
    P21 (*) Insert an element at a given position into a list.
    Example:
    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

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
  */


  "Scala99List Challenge: insertAt(EmptyList)" should "Return: Append Char to Empty List" in{

    val emptyList:List[String] = List.empty[String]
    val actual:List[Any] = sl99.insertAt('C',1,Nil)
    val expected:List[Any] = List('C')

    assert(actual == expected)
  }

  "Scala99List Challenge: insertAt('new',1,List('a','b','c','d'))" should "Return List('a','new','b','c','d')" in {

    val list:List[Char] = List('a','b','c','d')
    val actual:List[Any] = sl99.insertAt("new",1,list)
    val expected:List[Any] = List('a',"new",'b','c','d')

    assert(actual == expected)
  }


  "Scala99List Challenge: insertAt('new',1,List('a','b','c','d'))" should "Return List('a','b','c','d','new')" in {

    val list:List[Char] = List('a','b','c','d')
    val actual:List[Any] = sl99.insertAt("new",4,list)
    val expected:List[Any] = List('a','b','c','d',"new")

    assert(actual == expected)
  }

  "Scala99List Challenge: insertAt('new',0,List('a','b','c','d'))" should "Return List('new','a','b','c','d')" in {

    val list:List[Char] = List('a','b','c','d')
    val actual:List[Any] = sl99.insertAt("new",0,list)
    val expected:List[Any] = List("new",'a','b','c','d')

    assert(actual == expected)
  }

  /*
    P22 (*) Create a list containing all integers within a given range.
    Example:
    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */

  "Scala99List Challenge: range(4,9)" should "Return: List(4, 5, 6, 7, 8, 9)" in {

    val actual:List[Int] = sl99.range(4,9)
    val expected:List[Int] = List(4, 5, 6, 7, 8, 9)

    assert(actual == expected)

  }

  /*
    P23 (**) Extract a given number of randomly selected elements from a list.
    Example:
    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)
  */


  "Scala99List Challenge: range(1,-5)" should "Return: List(1,0,-1,-2,-3,-4,-5)" in{

    val actual:List[Int] = sl99.range(1,-5)
    val expected:List[Int] = List(1,0,-1,-2,-3,-4,-5)

    assert(actual==expected)
  }


  /*
    P23 (**) Extract a given number of randomly selected elements from a list.
    Example:
    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)

   def randomSelect[T](numberItems:Int,list:List[T]):List[T]={

     def generator(listGen:List[T]):Int = nextInt(listGen.size-1)

     def random(num:Int=numberItems, lst:List[T]=list,position:Int= generator(list),append:List[T]=Nil):List[T]={

       lst match{
         case a if(num == 0) => append
         case b if(position == 0) => random(num-1,lst.tail,generator(lst.tail),append:+lst.head)
         case _ => random(num,lst.tail :+ lst.head,position-1,append)
       }

     }

      list match {
        case a if(numberItems < 1 || list.isEmpty) => list
        case _ => random()
      }
    }

  */

  "Scala99List Challenge: randomSelect(3,emptyList[Char])" should "return empty list" in{

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.randomSelect(3,emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)

  }

  "Scala99List Challenge: randomSelect(3,list)" should "Return appendList size is 3" in{
    val list:List[Char] = List('a','b','c','d','f','g','h')
    val actual:Int = sl99.randomSelect(3,list).size
    val expected:Int  = 3

    assert(actual == expected)
  }

  /*
   P24 (*) Lotto: Draw N different random numbers from the set 1..M.
   Example:
   scala> lotto(6, 49)
   res0: List[Int] = List(23, 1, 17, 33, 21, 37)
 */

  "Scala99List Challenge: Lotto(3,0)" should "return Empty List" in {
    val actual:List[Int] = sl99.lotto(3,0)
    val expected:List[Int] = Nil

    assert(actual == expected)
  }

  "Scala99List Challenge: Lotto(6,49)" should "return size 6" in{
    val list:List[Int] = sl99.lotto(6,49)
    val actual:Int = list.size
    val expected:Int = 6

    assert(actual == expected)
  }

  /*
    P25 (*) Generate a random permutation of the elements of a list.
    Hint: Use the solution of problem P23.
    Example:

    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)

    def randomPermute[T](list:List[T]):List[T]={
      randomSelect(list.size,list)
    }
  */


  "Scala99List Challenge: randomPermute(emptyList)" should "Return emptyList" in {

    val emptyList:List[Char] = List.empty[Char]
    val actual:List[Char] = sl99.randomPermute(emptyList)
    val expected:List[Char] = List.empty[Char]

    assert(actual == expected)

  }


  "Scala99List Challenge: randomPermute(List('a','b','c','d','e','f'))" should "return not equal list" in{

    val list:List[Char] = List('a','b','c','d','e','f')
    val actual:List[Char] = sl99.randomPermute(list)
    val expected:List[Char] = List('a','b','c','d','e','f')

    assert(actual != expected)

  }

  /*
    P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
    In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
    12C3 -> 12! / 3!*(12-3)! = 12*11*10*9*8*7*6*5*4*3*2*1/3*2*1(9*8*7*6*5*4*3*2*1) = 12*11*10*9*8*7*6*5*4/9*8*7*6*5*4*3*2*1 = 12*11*10/3*2*1 = 220
    Example:

    scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
    6C3 => 6!/3!(6-3)! = 6!/3!*3! = 6*5*4/3*2*1 = 5*4/1 = 20 possibilities

    Dependencies: Subtest factorial, permutation , combination
  */


  "Scala99ListChallenge: factorial(0)" should "Return 0" in {
    val number:Int = 0
    val actual:Int = sl99.calutlatefactorial(0)
    val expected:Int = 0

    assert(actual == expected)
  }

  "Scala99ListChallenge: factorial(5)" should "Return 120" in {

    val num:Int = 5
    val actual:Int = sl99.calutlatefactorial(5)
    val expected:Int = 120

    assert(actual == expected)
  }




}