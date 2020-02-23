package com.local.Method

import java.security.KeyStore.TrustedCertificateEntry

import annotation.tailrec

object TailRecursiveFunction extends App{

  /*
    URL: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-tail-recursive-function-tailrec-annotation/
    OBJ: we will learn how to create tail recursive function and also make use of the annotation @annotation.tailrec which will instruct the compiler to apply any further optimisation.
    INFO: Tail recursive function will help prevent overflow in your call stack because the evaluation of your looping construct happens at each step.

    NOTES: The @annotation.tailrec instructs the compiler to add any optimisations with regards to stack frame management as this function is recursive.
  */
  val stockArray:Array[String] = Array("BX","C","BAC","JPM","WFC")

  @annotation.tailrec
  def search[T](query:T,arry:Array[T]):Option[Boolean] = {
    arry match{
      case a if(arry.isEmpty) => None
      case b if(arry.head == query)=> Some(true)
      case _ => search(query,arry.tail)
    }
  }

  val result:Option[Boolean] = search("C",stockArray)
  val result2:Option[Boolean] = search("SG",stockArray)

  print(
    s"""
       |Expected: True if C exist in Array
       |${result.get == true}
       |Expected: None if SG exist in Array
       |${result2 == None}
     """.stripMargin )
}
