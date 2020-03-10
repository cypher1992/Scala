package com.AllAboutScalaExcerciseTDD
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.FutureThreads.MockDAO
import scala.language.postfixOps
import scala.concurrent.duration._
import scala.concurrent.{Await}
import org.scalatest.concurrent.ScalaFutures._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success,Failure}

class FuturesTesting extends AnyFlatSpec with Matchers{

  val mockDao:MockDAO= new MockDAO

  "FutureThreads MockDao: query()" should "return List[Int]" in {
    /*DONT USE AWAIT FUNCTION IN FUTURES! In real-world applications, you should not block on Future method calls. By contrast, you should
     also process the result from a Future operation in a non-blocking fashion.*/
    val actual:List[Int] = Await.result(mockDao.query(),5 seconds)
    val expected:List[Int] = List.range(30,0,-1)

    assert(actual === expected)
  }

  "FutureThread MockDao: futureUnWrap(query())" should "succeed" in {
    mockDao.futureUnWrap(mockDao.query())
    // validate if future object was a success or not
    succeed
  }

  "FutureThread MockDao: future waiting() executed" should "func is executed" in{
    mockDao.waiting()
  }

}
