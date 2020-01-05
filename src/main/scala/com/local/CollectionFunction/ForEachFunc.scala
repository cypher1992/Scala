package com.local.CollectionFunction

object ForEachFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-foreach-example/
  OBJ:  we will learn how to use the foreach function with examples on collection data structures in Scala.
  INFO: The foreach function is especially convenient while iterating and accessing every single item within a collection
  FUNC: def foreach[U](f: (A) => U): Unit
  */

  val bxStock:Seq[Tuple3[String,String,Double]] = Seq(Tuple3("BX","OPEN",42.16),Tuple3("BX","CLOSE",45.72),Tuple3("BX","LOW",41.09),Tuple3("BX","High",47.01))
  val strStock = bxStock(1)._1
  bxStock.foreach(println(_))
  bxStock.foreach(seq => println(s"${seq}"))

  // value function URL: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-val-function-val-vs-def/
  val lowerCase: (Tuple3[String,String,Double]) => Tuple3[String,String,Double] =(index) =>{
    val lower = index._2.toLowerCase
    println(lower)
    val newTuple:Tuple3[String,String,Double] = Tuple3(index._1,lower,index._3)
    println(newTuple)
    newTuple
  }

  val emptySeq:Seq[Tuple3[String,String,Double]] = Seq.empty[Tuple3[String,String,Double]]
  bxStock.foreach(lowerCase)

}
