package com.local.CollectionFunction

object MaxByFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-maxby-example/
OBJ:  we will learn how to use the maxBy function with examples on collection data structures in Scala.
INFO: The maxBy function is similar to the previous max function with regards to finding the largest, or maximum, item in
      a collection. It, however, allows you to provide a predicate function to drive the criteria for comparing each element
FUNC: def maxBy[B](f: (A) => B)(implicit cmp: math.Ordering[B]): A
*/

case class Stock(ticker:String, price:Double)

val stockSeq: Seq[Stock] = Seq(Stock("BX",17.24),Stock("C",5.73),Stock("JPM",99.91),Stock("WFC",71.42),Stock("BAC",5000.11))
val findMaxStockPrice:Stock = stockSeq.maxBy(stock => stock.price)
// Create a Value Function
val stockPriceVF:(Stock) => Double = (stock) => stock.price
val findMaxStockPriceWithVF:Stock = stockSeq.maxBy(stockPriceVF)

println(
  s"""
    |Initialization of Stock Sequence
    |${stockSeq}
    |Find Max Stock in a Sequence using MaxBy
    |${findMaxStockPrice}
    |Find Max Stock in a Sequence using MaxBy using Value Function
    |${findMaxStockPriceWithVF}
  """.stripMargin)

}
