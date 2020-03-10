package com.local.CollectionFunction

import com.local.AlgoWithDataStructure.Data_Structure.VectorStructure

object MapFuncExperimentation extends App {


  val vecClass:VectorStructure = new VectorStructure


  val result:Vector[Int] = vecClass.updateVectorLambda(5,4,Vector(5,4,3,4,7,5,9,6,4))
  def ifEquals[T](x:T,y:T,r:T):T ={
    if(x==y){
      r
    }
    else{
      x
    }
  }

  val empty:Vector[Int] = Vector.empty[Int]
  val vec:Vector[Int] = Vector(5,4,3,4,7,5,9,6,4)
  val rmap:Vector[Int] = vec.map(ifEquals(_,5,66))

  println(
    s"""
      |${result}
      |${rmap}
      |${vecClass.updateVectorLambda(99,4,vec)}
    """.stripMargin)

}
