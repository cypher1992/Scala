package com.local.Projects.Resource.src
import com.local.Projects.Resource.src.Scala99ListChallenge


object Sl99 extends App{

  val sl99:Scala99ListChallenge = new Scala99ListChallenge

  val list:List[Any] =  List('B','C','C','C','A','A','B')

   val encodeList:List[Any]= sl99.encodeModified(list)

  val listTuple:List[Tuple2[Int,Char]] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))

  val headtuple1:Int = listTuple.head._1

  println(
    s"""
      |${encodeList}
       """.stripMargin)

}
