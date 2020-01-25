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



  val listNest:List[List[Char]] = List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))

  val head:List[Char] = listNest.head
  val index:Char = head.head
  val appendList:List[Tuple2[Int,Char]] = List.empty[Tuple2[Int,Char]] :+ Tuple2(2,'C') :+ Tuple2(2,'C')


  println(
    s"""
      |${head}
      |${index}
      |${appendList}
    """.stripMargin)

}
