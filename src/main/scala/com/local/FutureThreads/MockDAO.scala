package com.local.FutureThreads

import java.util.concurrent.Executors

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class MockDAO {

  //val executor =Executors.newSingleThreadExecutor()
  val executor = Executors.newCachedThreadPool()
  implicit val ec = scala.concurrent.ExecutionContext.fromExecutor(executor)

  def query(query:Int=30):Future[List[Int]] = Future {

    def queryAppend(counter:Int=query,list:List[Int]=Nil):List[Int]={
      println(Thread.currentThread().getName)
      counter match {
        case 0 => list
        case _ => queryAppend(counter-1,list :+ counter)
      }
    }
    Thread.sleep(100)
    queryAppend()
  }

  // using Success and failure to return  object from a Future
  def futureUnWrap[T](future:Future[T]):Unit ={
    future.onComplete{
      case Success(value)=> println(s"""${value}""")
      case Failure(e) => println(s"""${e}""")
    }

  }

  def waiting():Future[Unit] = Future{
    println("Future Function Called")
    Thread.sleep(3000)
  }
}
