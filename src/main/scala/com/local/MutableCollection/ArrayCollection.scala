package com.local.MutableCollection

object ArrayCollection extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-array/
    OBJ:  We will learn how to use Scala's Mutable Array to perform common operations such as initialize an Array, access elements at specific index,
          create 2D or 3D dimensional Arrays, and copy Arrays
    INFO: Array²⁸⁸ data structures are of fixed lengths and, as a result, you would typically use an Array if you know the size of the elements beforehand
  */

  val stockFinanceArray:Array[String] = Array("BX","C","JPM","BAC","SG")
  val blackstoneValue:String = stockFinanceArray(0)
  val stockAutoArray:Array[String] = new Array[String](2)
      stockAutoArray(0) = "Ford"
      stockAutoArray(1) = "Toyota"

  // create array using Tabulate Function
  val counterArray:Array[Int] = Array.tabulate(10)(_+2)
  // create array using Range Function
  val rangeArray:Array[Int] = (1 until 10).toArray[Int]
  // copy Range with the Size of rangeArray
  val copyOfRangeArray: Array[Int] = new Array(rangeArray.size)
      Array.copy(rangeArray,0,copyOfRangeArray,0,rangeArray.size)
  // Clone Array
  val cloneArray:Array[Int] = rangeArray.clone()
      cloneArray(8)=100
  // Iterate Through Array
  println(
    s"""
      |For Loop for array per item
    """.stripMargin)
  for(num <- cloneArray){
    println(
      s"""
        |Number: ${num}
      """.stripMargin)
  }

  val mergeArray:Array[Int] = Array.concat(cloneArray,counterArray)
  // Using sameElements to
  val testIfArrayAreEqual:Boolean = rangeArray sameElements copyOfRangeArray


  println(
    s"""
      |Initialized Stock Array
      |${stockFinanceArray.mkString(", ")}
      |Initialized the Value of Ticker
      |${blackstoneValue}
      |Counter Array using tabulate to initialized
      |${counterArray.mkString(", ")}
      |Range Array using toArray Function to initializer
      |${rangeArray.mkString(", ")}
      |Copy Array
      |${copyOfRangeArray.mkString(", ")}
      |Clone Array
      |${cloneArray.mkString(", ")}
      |Merge Array
      |${mergeArray.mkString(", ")}
      |If Arrays are Equal using sameElement Function
      |${testIfArrayAreEqual}
    """.stripMargin)






}
