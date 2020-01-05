package com.local.CollectionFunction

object MaxFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-max-example/
    OBJ:  we will learn how to use the max function with examples on collection data structures in Scala.
    INFO: The max function, as its name implies, will iterate through each element in a collection, and return the largest,
          or maximum, item.
    FUNC: def max: A
  */


  val stockPrice:Seq[Double] = Seq(0.15,0.17,0.45,0.75,0.01,0.24,0.99,0.14,0.91)
  val stockName:Seq[String]= Seq("BX","C","BAC","WFC","JPM")
  val maxStockPrice:Double = stockPrice.max
  val maxStockName:String = stockName.max

  println(
    s"""
      |Initialization Sequence for Stock Price
      |${stockPrice}
      |Initialization Sequence for Stock Name
      |${stockName}
      |Stock Price MAX
      |${maxStockPrice}
      |Stock Name Max
      |${maxStockName}
    """.stripMargin)

}
