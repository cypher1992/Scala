package com.local.Method

import scala.util.control.TailCalls._

object TailCallsRecurFunc extends App{

  /*
    URL: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-tail-recursive-function-scala-control-util-tailcalls/
    OBJ:  we will learn how to create tail recursive function by making use of utilities that Scala provides for tail recursions in the package scala.util.control.TailCalls.
    INFO: tail recursive function will help prevent overflow in your call stack because the evaluation of your looping construct happens at each step.
  */

  def find[T](query:T,list:List[T]):TailRec[Option[T]] ={
    list match {
      case Nil => done(None)
      case a if(query == list.head) => done(Some(list.head))
      case _ => tailcall(find(query,list.tail))
    }
  }

  def wrapTailCallsOpt[T](f:TailRec[Option[T]]):Any ={
    tailcall(f).result match {
      case None => tailcall(f).result
      case _ => tailcall(f).result.get
    }
  }

  val stock:List[String] = List("C","SG","GS","BAC","WFC","JPM")
  val expectedStock:Any = wrapTailCallsOpt(tailcall(find("JPM",stock)))
  val stockNotReturned:Any = wrapTailCallsOpt(tailcall(find("ENRON",stock)))
  println(
    s"""
      |${expectedStock}
      |${stockNotReturned}
    """.stripMargin)



}
