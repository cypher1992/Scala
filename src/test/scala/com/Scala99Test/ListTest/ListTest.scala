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



}
