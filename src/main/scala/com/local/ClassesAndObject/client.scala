package com.local.ClassesAndObject

import com.local.ClassesAndObject.StoreSystem

object client extends App{

  val lst:List[String] = Nil
  val express = new StoreSystem(lst,"Express")
  val productList:List[String] = express.addToProductList(lst,"Sweater")
  println(
    s"""
      |STORE NAME: ${express.name}
      |ITEMS: ${productList}
    """.stripMargin)

}
