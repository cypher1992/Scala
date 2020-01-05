package com.local.CollectionFunction

object UnionFunc extends App{

  /*
    DEPRECATED: USE CONCAT IN STEAD
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-union-example/
    OBJ:  we will learn how to use the union function with examples on collection data structures in Scala.
    INFO: The union method takes a Set as parameter and will merge its elements with the elements from the current Set.
    FUNC: def union(that: GenSet[A]): This // Deprecated Use Concat instead
  */

  val dataFrame:Seq[Double] = Seq(1.25,5248.64,15.50,16.00,914.57,1.25,52.00)
  val dataFrame2:Seq[Double] = Seq(16.00,1.25,96.00,15.00,6993.44,51.56,972.95)
  val unionDFonDF2:Seq[Double] = dataFrame concat dataFrame2
  val unionDF2onDF:Seq[Double] = dataFrame2 concat dataFrame

  println(
    s"""
      |Initialize First Dataframe
      |${dataFrame}
      |Initialize Second Dataframe
      |${dataFrame2}
      |Union on DF with DF2
      |${unionDFonDF2}
      |Union on DF2 with DF
      |${unionDF2onDF}
    """.stripMargin)

}
