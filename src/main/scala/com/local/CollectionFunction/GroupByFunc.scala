package com.local.CollectionFunction

object GroupByFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-groupby-example/
    OBJ:  We will learn how to use the groupBy function with examples on collection data structures in Scala.
    INFO: The groupBy function is a natural fit when you need to organize items in a collection by some key. Therefore, the return
          type of the groupBy function is a Map - that is, in order to associate each key to its corresponding value.
    FUNC: def groupBy[K](f: (A) => K): immutable.Map[K, Iterable[A]]
  */

  val stock:Seq[String] = Seq("BX","C","BAC","JPM","WFC")
  val mapStock:Map[Char,Seq[String]]= stock.groupBy(_.charAt(0))

  case class Stock(ticker:String,dailyPrice:Seq[Tuple2[String,Double]])
  val bxStock:Stock = new Stock(stock(0),Seq(Tuple2("OPEN",42.16),Tuple2("CLOSE",44.25),Tuple2("HIGH",44.52),Tuple2("LOW",40.19)))
  val cStock:Stock = new Stock(stock(1),Seq(Tuple2("OPEN",42.16),Tuple2("CLOSE",44.25),Tuple2("HIGH",44.52),Tuple2("LOW",40.19)))
  val bacStock:Stock = new Stock(stock(2),Seq(Tuple2("OPEN",42.16),Tuple2("CLOSE",44.25),Tuple2("HIGH",44.52),Tuple2("LOW",40.19)))
  val jpmStock:Stock = new Stock(stock(3),Seq(Tuple2("OPEN",42.16),Tuple2("CLOSE",44.25),Tuple2("HIGH",44.52),Tuple2("LOW",40.19)))
  val wfcStock:Stock = new Stock(stock(4),Seq(Tuple2("OPEN",42.16),Tuple2("CLOSE",44.25),Tuple2("HIGH",44.52),Tuple2("LOW",40.19)))
  val seqStocks:Seq[Stock] = Seq(bxStock,cStock,bacStock,jpmStock,wfcStock)
  val groupBySeq:Map[Char,Seq[Stock]] = seqStocks.groupBy(_.ticker.charAt(0))

  println(
    s"""
       |Initialization Stock
       |${stock}
       |Group Tickers by 1st character place
       |${mapStock}
       |Create Seq of Stock Object
       |${seqStocks}
       |Group By Tickers Name
       |${groupBySeq}
     """.stripMargin)


}
