package com.Scala99Test.ListTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Projects.Resource.src.Scala99ListChallenge

class ListTest extends  AnyFlatSpec with Matchers{

  val sl99:Scala99ListChallenge = new Scala99ListChallenge()

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

    val emptyList:List[Int] = List.empty[Int]
    val actualNil:Any = sl99.lastElement(emptyList)
    val expectedNil:Any = Nil

    assert(actualNil === expectedNil)
  }

  "Scala99List Challenge Test: List with 3 Values List(1,2,3)" should "Return Last Position: Value 3" in {

    val list:List[Int] = List.range(1,4)
    val actualLastValue:Any = sl99.lastElement(list)
    val expectedLastValue:Any = 3

    assert(actualLastValue === expectedLastValue)

  }

  "Scala99ListChallenge Test: Last Func: Empty List" should "Throw Exception" in {

    val emptyList:List[Int] = List.empty[Int]

    assertThrows[java.util.NoSuchElementException]{sl99.last(emptyList)}
  }

  "Scala99List Challenge Test: Last Func: List with 3 Values List(1,2,3)" should "Return Last Position: Value 3" in {

    val list:List[Int] = List.range(1,4)
    val actualLastValue:Any = sl99.last(list)
    val expectedLastValue:Any = 3

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
*/

  "Scale99List Challenge Test: lastOfLastElement: Empty List" should "Expect Nil" in {
    val emptyList:List[Int] = List.empty[Int]
    val actualNil:Any = sl99.lastOfLastElement(emptyList)
    val expectedNil:Any = Nil

    assert(actualNil === expectedNil)
  }

  "Scale99List Challenge Test: lastOfLastElement: List(1,2,3,4)" should "Expect Value 3" in {
    val list:List[Int] = List.range(1,5)
    val actualIndex:Any = sl99.lastOfLastElement(list)
    val expectedIndex:Any = 3

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
*/

  "Scale99List Challenge Test: nth position of an Empty list" should "returns Nil" in {

    val emptyList:List[Int] = List.empty[Int]
    val actualNil:Any = sl99.nth(0,emptyList)
    val expectedNil:Any = Nil
    assert(actualNil===expectedNil)
  }

  "Scale99List Challenge Test: nth position of an List with Index out of bound index" should "returns Nil" in {

    val list:List[Int] = List.range(1,4)
    val actual:Any = sl99.nth(6,list)
    val expected:Any = Nil

    assert(actual===expected)
  }


  "Scale99List Challenge Test: nth position of 2" should "returns 2" in {

    val list:List[Int] = List.range(1,4)
    val actual:Any = sl99.nth(2,list)
    val expected:Any = 2

    assert(actual===expected)
  }

/*
  P04 (*) Find the number of elements of a list.
  Example:
  scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6

  def length(list:List[Int]):Int = if(list.size > 0) {list.size} else 0
*/
  "Scale99List Challenge Test: length() List is empty" should "returns 0" in {

    val list:List[Int] = List.empty[Int]
    val actual:Int = sl99.length(list)
    val expected:Int = 0

    assert(actual===expected)
  }

  "Scale99List Challenge Test: length() List(1,2,3,4)" should "returns 4" in {

    val list:List[Int] = List.range(1,5)
    val actual:Int = sl99.length(list)
    val expected:Int = 4

    assert(actual===expected)
  }


}
