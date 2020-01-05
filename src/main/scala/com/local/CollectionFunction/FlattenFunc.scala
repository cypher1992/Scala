package com.local.CollectionFunction

object FlattenFunc extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-flatten-function-example/
OBJ:  we will learn how to use the flatten function on collection data structures in Scala.
INFO: The flatten function is practical whenever you have to collapse, or merge, similar types within a collection.
FUNC: def flatten[B](implicit asIterable: (A) => IterableOnce[B]): Iterable[B]

*/

  val typeBond:Seq[String] = Seq("Bond","Note","T-Bill","Mortgage")
  val typeCorporateBond:Seq[String] = Seq("Corporate Bond","Convertible Bonds")
  val seqBond:Seq[Seq[String]] = Seq(typeBond,typeCorporateBond)
  val flatBond:Seq[String] = seqBond.flatten
  val appendToBond:Seq[String] = flatBond.map(_ + " Instrument")

  println(
    s"""
       |Initialization of Sequence of Bond
       |${}
       |Initialization of Sequence of Corporate Bond
       |${}
       |Initialization of Sequence of Sequence Bonds
       |${seqBond}
       |Flat Function Invoked
       |${flatBond}
       |Append String using Map Function to carry
       |${appendToBond}
     """.stripMargin)


}
