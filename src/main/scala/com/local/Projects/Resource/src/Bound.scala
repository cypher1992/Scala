package com.local.Projects.Resource.src

import scala.util.Random._

object Bound extends App{

   def nodeCreation(node:String, counter: Int,appended:List[String]= Nil):List[String]={
      counter match {
         case 0 => appended
         case _ => nodeCreation(node,counter-1,appended :+ node)
      }
   }

   def nodeAppend(list:List[String],appended:List[String]=Nil,pair:Tuple2[String,String]=("0","1")):List[String]={
      list match{
         case Nil => appended
         case a if(list.size%2 == 0) => nodeAppend(list.tail,appended :+ list.head + pair._1,pair)
         case _ => nodeAppend(list.tail,appended :+ list.head + pair._2,pair)
      }
   }

   val nodeList:List[String] = nodeCreation("0",2)
   val nodeList2:List[String] = nodeCreation("1",2)
   val append:List[String] = nodeAppend(nodeList)
   val append2:List[String] = nodeAppend(nodeList2)
   val flat:List[String] = List(append,append2).flatten

   println(
     s"""
       |${nodeList}
       |${append}
       |${append2}
       |${flat}
     """.stripMargin)

}
