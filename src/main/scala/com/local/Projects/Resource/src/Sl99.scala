package com.local.Projects.Resource.src
import com.local.Projects.Resource.src.Scala99ListChallenge


object Sl99 extends App{

  val sl99:Scala99ListChallenge = new Scala99ListChallenge

  val list:List[Char] =  List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
  val actual:List[Char] = sl99.compress(list)

  println(
    s"""
      |${actual}
    """.stripMargin)


}
