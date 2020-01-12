package com.review.Function

object PolymorphicFunc extends App{

  def genericFuncAdd[T](val1:T):Seq[T] ={
    val1 match {
      case r: Int  =>
          println("Int")
          Seq(val1)
      case r:  Double =>
        println("Double")
        Seq(val1)
      case r:String =>
        println("String")
        Seq(val1)
      case  _  =>
        println("Some other type")
        Seq(val1)
    }
  }


  val longtype:Long = 1000

  val returnGeneric = genericFuncAdd(longtype)

  println(
    s"""
       |${returnGeneric}
      """.stripMargin)








}
