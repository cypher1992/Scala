package com.local.CollectionFunction

object IntersectFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-intersect-example/
OBJ:  We will learn how to use the intersect function on collection data structures in Scala
INFO: The intersect function is typically applicable to Set data structures, in finding the common elements between two Sets
FUNC: def intersect(that: Set[A]): Set[A]
*/

val americanStock:Seq[String] = Seq("BX","C","BAC","JPM","WFC")
val foreignStock:Seq[String] = Seq("BAC","MUFG","JPM","BNP","SG")
val commonStock:Seq[String] = americanStock.intersect(foreignStock)

println(
  s"""
    |Initialization American Stock Seq
    |${americanStock}
    |Initialization Foreign Stock Seq
    |${foreignStock}
    |Intersect of both american and foreign stocks
    |${commonStock}
  """.stripMargin)


}
