package com.local.Projects.Resource.src

object NestedList extends App{


  val nestedList:List[Any] = List(List(1,2),3,List(9,8,4,List(11,7),5))

  val flattenList = nestedList.flatMap(_).flatten



  println(flattenList)
/*  for(index <- nestedList){

    print(
      s"""
         |${index.isInstanceOf[List[Any]]}
       """.stripMargin)
    //println(index)
  }*/

}
