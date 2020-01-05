package com.local.ImmutableCollection.StreamCollection

object StreamCollection extends App{

/*

URL:  http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-stream/
OBJ:  We will learn how to use Scala's Immutable Stream to perform common operations such as initialize an infinite Stream, use the cons operator, take elements from a Stream and create an empty Stream.
INFO: Nonetheless, the scala.collection.immutable.Stream type is deprecated in favor of scala.collection.immutable.LazyList. As its name implies,
      the latter allows for lazy evaluations in addition to keeping the order of elements.
*/

// Stream is deprecated recommend using LazyList
val LazyList = scala.collection.immutable.LazyList
val stockStream:LazyList[String] = "BX"#::"JPM"#::"C"#::"BAC"#::LazyList.empty[String]
val counterStream:LazyList[Int] = LazyList.from(10)
val counterStream2:LazyList[Int] = LazyList.from(0,5)

// Displays 4 stocks from stockStream
stockStream take 4 foreach println
// Display 20 elements from starting position of 10
counterStream take 20 foreach println
// Display 2 elements from starting position of 0 and increment of 5
counterStream2 take 2 foreach println


/*
println(
  s"""
    |Initialized Stream
    |${stockStream}
    |
  """.stripMargin)
*/
}

