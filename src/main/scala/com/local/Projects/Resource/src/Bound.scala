package com.local.Projects.Resource.src

import scala.util.Random._

object Bound extends App{

   val list:List[String] = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
   val list2:List[String] = List("Aldo", "Beat")
   val list3:List[String] = List("Carla", "David", "Evi")

   val diff:List[String] = list diff list2 diff list3

   println(s"${diff}")

   val tup = Tuple2(0,0)

   println(
     s"""
       |${tup._1 >1}
       |${tup._2}
     """.stripMargin)

}
