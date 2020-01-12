package com.review.Function

object VarArgsFunc extends App{

  def add(vari:Double*):Double ={
    var total:Double = 0.00
    for(index <- 0 until vari.size){
      total=total+vari(index)
    }
    total
  }

  val arrayNum:Array[Double] = Array(7,8,9,10)
  val sumArray:Double = add(arrayNum: _*)
  val sumNums:Double = add(5,6,7,8)

  println(
    s"""
      |${sumNums}
      |${sumArray}
    """.stripMargin)
}
