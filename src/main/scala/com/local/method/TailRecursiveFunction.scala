package com.local.Method

import annotation.tailrec

object TailRecursiveFunction extends App{

  val stockArray:Array[String] = Array("BX","C","BAC","JPM","WFC")

  @annotation.tailrec
  def search():Unit = {
    search()
  }

}
