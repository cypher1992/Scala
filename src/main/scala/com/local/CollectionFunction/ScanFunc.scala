package com.local.CollectionFunction

object ScanFunc extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-scan-example/
  OBJ:  we will learn how to use the scan function with examples on collection data structures in Scala.
  INFO: The scan method takes an associative binary operator function as parameter and will use it to collapse elements
        from the collection to create a running total from each element. scan allows you to also specify an initial value.
  FUNC: def scan[B >: A, That](z: B)(op: (B, B) ⇒ B)(implicit cbf: CanBuildFrom[Repr, B, That]): That
  */

  val priceStock:Seq[Int] = Seq(0,9,164,1,579,85)
  val totalOfPreviousPair:Seq[Int] = priceStock.scan(0)((a,b) => a + b )
  val totalOfPreviousPairWithVars:Seq[Any] = priceStock.scan(0)((a,b) => a + b)

  println(
    s"""
       |Initialize Sequence Stock
       |${priceStock}
       |Total sum of each pair stocks
       |${totalOfPreviousPair}
       |Total sum of each pair stocks with vars
       |${totalOfPreviousPairWithVars}
     """.stripMargin)
}
