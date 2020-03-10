package com.local.FutureThreads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

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
}
