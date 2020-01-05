package com.local.basics

object ScalaTypeInference {

  def main(args: Array[String]): Unit = {


    lazy val userId = 5
    lazy val userId2: Int = 5

    println(s"Type Inference on INT: ${userId} \nType Explictly Declared on INT:${userId2}")

    lazy val userId3:String = userId.toString
    lazy val userId4:Double = userId2.toDouble

    println(s"${userId3} \n${userId4}")


  }
}
