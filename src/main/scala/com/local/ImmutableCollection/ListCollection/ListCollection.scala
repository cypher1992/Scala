package com.local.ImmutableCollection.ListCollection

object ListCollection extends App with MethodList[String]{
/*
  URL:http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-list/
  GOAL:  We will learn how to use Scala's Immutable
*/

  // intiialization of list
  val stockList:List[String] = List("BX","JPM","C","BAC")
  // store val
  val BOFA:String = stockList(3)
  // appending to list first and last
  val goldmanSach:String = "GS"
  //val stockListUpdate:List[String] = stockList :+ goldmanSach
  val stockListUpdate:List[String] = this.firstAppendList(goldmanSach:String,stockList:List[String])
  val stockListUpdateLast:List[String] = this.lastAppendList(goldmanSach:String,stockList:List[String])
  // appending two list or more
  val consultingStockList:List[String] = List("KPMG","PWC","DTTL","EY")
  val stockListFirst:List[String] = this.frontAddList(consultingStockList:List[String],stockList:List[String])
  val stocklistLast:List[String] = this.lastAddList(consultingStockList:List[String],stockList:List[String])
  // querying for existing component
  val ifCitiExist:Boolean= this.queryList("C",stocklistLast)
  // empty List
  val emptyStock:List[String] = List.empty[String]

  println(
    s"""
      |Stock List:
      |${stockList}
      |Component Val
      |${BOFA}
      |Update Stock
      |${stockListUpdate}
      |Update Stock with Last input
      |${stockListUpdateLast}
      |Update list as first option
      |${stockListFirst}
      |Update list as last option
      |${stocklistLast}
      |Query for existing stock
      |${ifCitiExist}
      |empty list
      |${emptyStock}
    """.stripMargin)




}
