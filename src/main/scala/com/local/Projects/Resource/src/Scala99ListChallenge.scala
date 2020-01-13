package com.local.Projects.Resource.src

class Scala99ListChallenge {

/*
P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
*/
  def lastElement(list:List[Int])=
    list match{
      case list.size > 0  => list(list.size-1)
      case _ => Nil
    }

  

}
