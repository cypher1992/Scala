package com.review.Function

object PolymorphicFunc extends App{

  def genericFuncAdd[T](val1:T):Unit ={
    val1 match {
      case r: Int  => println("Int")
      case r:  Double => println("Double")
      case r:String => println("String")
      case _ => println("Some other type")
    }
  }

  genericFuncAdd(25.00)
  genericFuncAdd(1)
  genericFuncAdd("STR")


}
