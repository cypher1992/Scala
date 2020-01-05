package com.review.Function

object BasicFunction extends App{


  def funcNoParamReturnType():Unit = {println("No Parameter or Return Type")}
  def funcParaReturn(str:String):String = {str.toUpperCase}
  def funcOptionsPara(opt: Option[String]):Unit ={
    println(checkOpt(opt).get)
  }
  def checkOpt(opt:Option[String]): Option[String] ={
    opt match {
      case Some(_) => Some(opt.get.toUpperCase)
      case _ => Some("Empty String")
    }
  }

  val str:String = "Some String"
  val strOpt:Option[String] = Some(str)
  val strOptNone:Option[String] = None

  funcNoParamReturnType
  funcOptionsPara(strOpt)
  funcOptionsPara(strOptNone)

/*  println(
    s"""
      |${funcOptionsPara(strOpt)}
      |${funcOptionsPara(strOptNone)}
    """.stripMargin)*/


}
