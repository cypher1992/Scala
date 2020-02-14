package com.local.Projects.Resource.src

import scala.util.Random._

object Bound extends App{


   for( i <- 0 to 10 by 2)
      {
         println(
           s"""
             |${i}
           """.stripMargin)
      }

   var zero:Int = 0

   while(zero <11){
      println(
        s"""
          |${zero}
        """.stripMargin)
      zero += 2
   }

}
