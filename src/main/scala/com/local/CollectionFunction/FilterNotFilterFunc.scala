package com.local.CollectionFunction

object FilterNotFilterFunc extends App{

/*
URL:   http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-filter-filternot-function/
OBJ:   We will learn how to use the filter and filterNot functions on collection data structures in Scala.
INFO:  Both functions take a predicate function as parameter, with the filter function allowing you to keep certain items that match
        the predicate function. And, whereas the filterNot function discards items as specified by the predicate function.
*/
  //def filter(pred: (A) => Boolean): Iterable[A]
  // def filterNot(pred: (A) => Boolean): Iterable[A]

  val stocks:Seq[String] = Seq("BX","C","JPM","BAC","GS")
  val filterCiti:Seq[String] = stocks.filter{stock => stock.equals("C")}
  val notFilterCiti:Seq[String] = stocks.filterNot{stock => stock.equals("C")}


  println(
    s"""
      |Initialization of Sequence
      |${stocks}
      |Filter for Citi
      |${filterCiti}
      |${notFilterCiti}
    """.stripMargin)

}
