package com.review.Function

object ImplicitParameterFunc extends App{

  /*
    URL:  http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-function-implicit-parameter/
    OBJ:  The use of implicit parameters is just one example of how dependency injection can be achieved in Scala.
  */

  // define implicit func
  def annualROI(principal:Double)(implicit rate:Double =0.12,isFixedVariable:Boolean): Double ={
    val roi:Double = (principal*rate)+principal
    roi
  }

  def varibleTermROI(principal:Double,years:Int):Double={

    if(years>1)
      varibleTermROI(annualROI(principal),years-1)
    else
      annualROI(principal)

  }


  // define val as implicit
  implicit val rate:Double = 0.0194
  implicit val isFixedVal:Boolean = false
  val principal:Double = annualROI(100000)
  val principalFive:Double = varibleTermROI(100000.00,100)

  println(
    f"""
      |${principal}%.2f
      |${principalFive}%.2f
    """.stripMargin)

}
