package com.review.CollectionRev

object ArrayRev extends App{

  val headStr= Array("DATE","OPEN","CLOSE","HIGH","LOW")                           // High AVG
  val price:Array[String]  = Array("DEC-27-19","52.15","55.16","56.71","52.15")
  val price2:Array[String] = Array("DEC-26-19","51.95","52.15","53.95","51.53") // 55.33
  val price3:Array[String] = Array("DEC-25-19","53.94","51.95","55.11","51.47") // 54.53  // 55.25
  val price4:Array[String] = Array("DEC-24-19","53.94","51.95","55.11","51.47") // 55.11  // 54.72
  val price5:Array[String] = Array("DEC-23-19","57.44","53.94","57.95","53.22") // 56.53  // 56.05

  val stockPrice:Array[Array[String]] = Array(headStr,price,price2,price3,price4,price5)

  def readArray(arry:Array[Array[String]]):Unit ={
    for(i <- 0 until arry.length){
      println(
        s"""
           |${arry(i).mkString(", ")}
         """.stripMargin)
    }
  }

  def readDataArray(arry:Array[Array[String]],columnNumber:Tuple2[Int,Int]):Unit ={
    for(i <- 0 until arry.length){
      val tempArry = arry(i)

      println(
        s"""
           |${tempArry(columnNumber._1)} | ${tempArry(columnNumber._2)}
         """.stripMargin)
    }
  }

  def getColumnArry(arry:Array[Array[String]],columnNumber:Int):Array[Double] ={

    var arryStore:Array[Double] = Array.empty[Double]

    for(i <- 1 until arry.length){
      val tempArry:Array[String] = arry(i)
      arryStore = arryStore :+ tempArry(columnNumber).toDouble
    }

    val finalArray:Array[Double] = arryStore
    finalArray
  }


  def smaPerPeriod(arry:Array[Array[String]], columnIndex:Int, period:Int):Unit={

    //return type Map[List[String],Tuple2[List[Double],List[Double]]]

    val arryDouble:Array[Double] = getColumnArry(stockPrice,columnIndex)
    val (headArry,tailArry) = loadUpArrays(arryDouble,2)
    val smaArry:Array[Double] = avgArrays(headArry,tailArry)

  }

  def loadUpArrays(arry:Array[Double], position:Int): (Array[Double],Array[Double]) ={

    var loadArrayHead:Array[Double] = Array.empty[Double]
    var loadArrayTail:Array[Double] = Array.empty[Double]

    for( index <- 0 until position){
      loadArrayHead = loadArrayHead :+ arry(index)
    }

    for( index <- position until arry.size){
      loadArrayTail = loadArrayTail :+ arry(index)
    }

    (loadArrayHead,loadArrayTail)
  }

  def avgArrays(arrayhead:Array[Double],arrayTail:Array[Double]):Array[Double]={

    val totalSize:Int = arrayTail.size+1
    var empAvgArray:Array[Double] = Array.empty[Double]
    var newArrayHead:Array[Double] = arrayhead
    var newArrayTail:Array[Double] = arrayTail
    var total:Double = 0.00

    for(iter <- 0 until totalSize) {

      for (index <- 0 until arrayhead.size) {
        total += newArrayHead(index)
        if (index == 1) {
          empAvgArray = empAvgArray :+ (total / newArrayHead.size)
          total = 0.00
        }
      }
      if(iter < arrayTail.size) {
        newArrayHead = newArrayHead.tail :+ newArrayTail.head
        newArrayTail = newArrayTail.tail
      }
    }

    val averageArray:Array[Double] = empAvgArray
    averageArray
  }


/*   readArray(stockPrice)
   readDataArray(stockPrice,Tuple2(0,3))
   val closePriceArry= getColumnArry(stockPrice,2)
  println(
    s"""
      |${closePriceArry.mkString(", ")}
    """.stripMargin)*/

  smaPerPeriod(stockPrice,3,2)

/*  val testArray:Array[Double] = Array(56.71,53.95,55.11,55.11,53.22) //Array(5,1,9,7,3,6,4)
  val period:Int = 2

  val (arryHead2,arryTail2) = loadUpArrays(testArray,2)
  val averageArray:Array[Double] = avgArrays(arryHead2,arryTail2)
  //val sliceArray:Array[Double] = arryHead2.slice(1,2)

  println(
    s"""
      |${arryHead2.mkString(", ")}
      |${arryTail2.mkString(", ")}
      |${averageArray.mkString(", ")}
    """.stripMargin)*/


}
