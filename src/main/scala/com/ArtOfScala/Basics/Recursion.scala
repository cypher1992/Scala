package com.ArtOfScala.Basics

class Recursion {

  // recursive function is primarily calling it self until it hits a satisfying condition. Almost like a while loop.

  def multiplyItSelf(num:Int):Int = {

    def recurMulti(number:Int = num, store:Int = 1):Int = {
      number match {
        case 0 | 1  => store
        case  _ => recurMulti(number-1,store*number)
      }
    }
    recurMulti()
  }

}
