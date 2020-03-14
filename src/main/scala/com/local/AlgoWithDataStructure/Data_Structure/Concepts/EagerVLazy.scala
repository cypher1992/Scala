package com.local.AlgoWithDataStructure.Data_Structure.Concepts

class EagerVLazy {

  /*
  Lazy instantiate a object without using it reduces load of memory
  */

  lazy val lazyList:List[Int] = List.range(0,10,2)
  val eagerList:List[Int] = List.range(0,10,2)

}
