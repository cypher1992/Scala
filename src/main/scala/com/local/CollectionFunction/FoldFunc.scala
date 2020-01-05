package com.local.CollectionFunction

object FoldFunc extends App {

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-fold-example/
OBJ:  we will learn how to use the fold function with examples on collection data structures in Scala.
INFO: The fold function is convenient and easy-to-use whenever you have to iterate through a collection to produce a
      single accumulated value. For that reason, the fold function takes an associative binary operator as its parameter
      that is used to collapse, and hence fold, the elements in the collection. It also worth noting that the fold function
      allows you to specify an initial value.
FUNC: def fold[A1 >: A](z: A1)(op: (A1, A1) ⇒ A1): A1
*/


  val priceBx:Seq[Double] = Seq(36.24,42.16,38.76,41.97)
  val sumOfStockPrice:Double = priceBx.fold(0.00)(_+_)

  val seqStocks:Seq[String] = Seq("BX","JPM","C","BAC","WFC")
  val tickerConcatenate:String = seqStocks.fold("")((acc,ticker) => acc + ticker + " Ticker")

  println(
    s"""
      |Initialization Sequence Price of Stock
      |${priceBx}
      |Sum of Stock using fold function
      | ${sumOfStockPrice}
      |Initialization Sequence Tickers
      |${seqStocks}
      |String Concate on with Fold Function
      |${tickerConcatenate}
    """.stripMargin)

}
