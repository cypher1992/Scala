package com.review.Basic

object PatternMatch extends App{

  //skeleton

  def action(): Unit = println("Action")
  def actionPK(): Unit = println("Action Pack")
  def error():Unit = println("error")

  val valName:Any = "AnyType"

  valName match {
    case "Any" | "AnyVal" => action()
    case "AnyType" =>   actionPK()
    case _ => error()
  }

}
