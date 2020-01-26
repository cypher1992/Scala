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

  }