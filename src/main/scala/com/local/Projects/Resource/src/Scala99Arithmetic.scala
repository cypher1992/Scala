package com.local.Projects.Resource.src

class Scala99Arithmetic {

  def isPrime(num:Int):Boolean = {

    num match {
      case 1 | 2 | 3 => true
      case a if(num < 1) => false
      case b if(((num/2)%2) != 0) => true
      case _ => false
    }
  }

}
