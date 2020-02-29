package com.local.AlgoWithDataStructure.Data_Structure

object Experiement extends App {


  val list:List[Int] = List(2,4,56,7,23,14)
  val listSorted:List[Int] = list.sortWith(_<_)

  println(
    s"""
       |List: ${list}
       |List Sorted: ${listSorted}
     """.stripMargin)

}
