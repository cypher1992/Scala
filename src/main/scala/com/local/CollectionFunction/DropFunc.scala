package com.local.CollectionFunction

object DropFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-drop-function/
    OBJ:  We will learn how to use the drop function on collection data structures in Scala.
    INFO: The drop function is typically applicable to an index-based data structure as it takes an integer parameter N to remove
          the first N elements. As of the Scala 2.13.0 version, the drop function is a member of the Iterable³²⁸ trait and is defined as follows:

  */
  val autoBrands:Seq[String] = Seq("Ford","Toyota","Nissan","Honda","Lexus","Infinity")
  val dropInfiniti:Seq[String] = autoBrands.drop(5)

  println(
    s"""
      |Initialized Auto Brands Seq
      |${autoBrands}
      |Drop the first 5 values of Sequence
      |${dropInfiniti}
    """.stripMargin)

}
