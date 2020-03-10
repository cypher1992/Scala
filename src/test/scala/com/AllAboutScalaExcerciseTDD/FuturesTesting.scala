package com.AllAboutScalaExcerciseTDD
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.FutureThreads.MockDAO
import scala.language.postfixOps
import scala.concurrent.duration._
import scala.concurrent.{Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

class FuturesTesting extends AnyFlatSpec with Matchers{

  val mockDao:MockDAO= new MockDAO

  "FutureThreads MockDao: query()" should "return Future[List[Int]]" in {
    val actual:List[Int] = Await.result(mockDao.query(),5 seconds)
    val expected:List[Int] = List.range(30,0,-1)

    assert(actual === expected)
  }

}
