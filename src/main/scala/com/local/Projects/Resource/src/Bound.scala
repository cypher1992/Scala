package com.local.Projects.Resource.src

import scala.util.Random._

object Bound extends App{

   val list:List[String] = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
   val list2:List[String] = List("Aldo", "Beat")
   val list3:List[String] = List("Carla", "David", "Evi")

   val diff:List[String] = list diff list2 diff list3

   println(s"${diff}")

   val tup:List[Char] = List('0','1')
   val combo:List[List[Char]] = tup.combinations(2).toList
   println(s"${combo}")

}
