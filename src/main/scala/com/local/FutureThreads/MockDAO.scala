package com.local.FutureThreads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class MockDAO {

  def query(query:String =""):Future[List[Int]] = Future {

    def queryAppend(counter:Int=30,list:List[Int]=Nil):List[Int]={
      counter match {
        case 0 => list
        case _ => queryAppend(counter-1,list :+ counter)
      }
    }
    queryAppend()
  }

  // using Success and failure to return  object from a Future
  def futureUnWrap[T](future:Future[T]):Unit ={
    future.onComplete{
      case Success(value)=> println(s"""${value}""")
      case Failure(e) => println(s"""${e}""")
    }

  }
}
