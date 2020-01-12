package com.local.FutureThreads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure,Success}

object FutureReturns extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#futures-introduction
    OBJ:  Define a method which returns a Future
    INFO: We've had to import scala.concurrent.Future to have access to the Future type
          We've also had to import scala.concurrent.ExecutionContext.Implicits.global which will place a default
          thread pool in scope on which our Future will be executed asynchronously.
          We will make use of Future.onComplete() callback to capture the result of a Future.
   */

  def getFutureInt(num:Int):Future[Int]= Future{
    println("do something")
    num
  }

  val futureInt:Future[Int] = getFutureInt( 100)
  println(s"${futureInt}")

  Thread.sleep(10000) // delay of 10 secs on the main block
  futureInt.onComplete{
    case Success(futureValue) => println(s"Get Value ${futureValue}")
    case Failure(e) => println(s"Exception ${e}")
  }




}
