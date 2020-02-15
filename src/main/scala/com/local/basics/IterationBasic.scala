package com.local.basics

object IterationBasic extends App{

  for( i <- 0 to 10 by 2)
  {
    println(
      s"""
         |${i*2}
           """.stripMargin)
  }

  var zero:Int = 0

  while(zero <11){
    println(
      s"""
         |${zero*2}
        """.stripMargin)
    zero += 2
  }

  // using function to toss iteration to interation over a function and take each value and then manipulate it
  (0 to 10 by 2).foreach( (a:Int) => println(s"${a*2}"))

}
