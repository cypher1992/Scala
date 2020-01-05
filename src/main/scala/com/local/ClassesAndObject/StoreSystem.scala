package com.local.ClassesAndObject

class StoreSystem(productList:List[String],storeName:String){

  val list:List[String] = productList
  val name:String = storeName

  def addToProductList(list:List[String],product:String):List[String]={

      val addProductToList = product :: list
      addProductToList
  }



}





