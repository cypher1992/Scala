package com.local.Projects.Resource.src
import com.local.Projects.Resource.src.Scala99ListChallenge


object Sl99 extends App{

  val sl99:Scala99ListChallenge = new Scala99ListChallenge

  val list:List[Any] =  List('B','C')
  val somethingList:List[Any] = List('A')


  def add(lst:List[Any],anotherList:List[Any]):List[Any] ={

    println(
      s"""
        |${lst}
      """.stripMargin)
    list match {
      case a if(lst.size>0) => add(lst.empty,anotherList)
      case _ => lst :+ anotherList.head
    }

  }


  println(
    s"""
      |${add(list,somethingList)}
      |
    """.stripMargin)

}
