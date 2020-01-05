package com.local.CollectionFunction

object FindFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-find-function/
OBJ:  we will learn how to use the find function on collection data structures in Scala
INFO: The find function takes a predicate function as parameter, and returns the first element in the collection which matches
      the predicate function.
Function: def find(p: (A) ⇒ Boolean): Option[A]
*/

val financialInstrument:Seq[String] = Seq("Equity","Fixed Income","Commodity","Option","Derivatives")
val returnCommodity:Option[String] = financialInstrument.find(instrument => instrument == "Commodity")
val returnBond:Option[String] = financialInstrument.find(instrument => instrument == "Bond")

println(
  s"""
    |Sequence Intialization
    |${financialInstrument}
    |Return Commodity with Find Command
    |${returnCommodity.getOrElse("DNE")}
    |Return Bond with FInd Command without Existent
    |${returnBond.getOrElse("DNE")}
  """.stripMargin)

}
