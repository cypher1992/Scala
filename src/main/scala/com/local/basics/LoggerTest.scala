package com.local.basics

import com.typesafe.scalalogging.LazyLogging


object LoggerTest extends App with LazyLogging {


  logger.warn("Hello Logger")

  val int:Int = 1
  val double: Double =2.0
  val float: Float = 3F
  val byte: Byte = 0x00
  val bool: Boolean = true
  val long: Long = 16
  val short: Short = 0
  val str: String = "String"
  val char:Char = 'c'
  val unit:Unit = ()


  lazy val list:List[Any] = List(int,double,float,byte,bool,long,short,str,char,unit)

  def printList(lst:List[Any])={



  }






}
