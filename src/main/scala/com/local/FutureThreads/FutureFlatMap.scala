package com.local.FutureThreads

import org.joda.time.Seconds

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}


/*
  URL:  http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#chain-futures-using-flatmap
  OBJ:  In this section, we will show how you can easily chain futures by using the flatMap() method.
 */

object FutureFlatMap extends App{

  def stockEMA(name:String):Future[Double] = Future{

    println("Above 200 Moving Average")
    54.20
  }

  def buyStock(price:Double):Future[Boolean] = Future{

    println("Yes BUY!!!!!")
    true
  }

  val longStock = stockEMA("Bx").flatMap(price => buyStock(price))

  val success = longStock.onComplete{
    case Success(longStock) => println(s"Boolean Returned Value: ${longStock}")
    case Failure(e) => println(s"${e}")
  }

  Thread.sleep(3000)
  println(s"Thread Complete: Future Sucessful")
}
