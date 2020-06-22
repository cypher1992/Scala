package com.ArtOfScala.Basics

class Recursion {

  // recursive function is primarily calling it self until it hits a satisfying condition. Almost like a while loop.

  // using matching
  def multiplyItSelf(num:Int):Int = {

    def recurMulti(number:Int = num, store:Int = 1):Int = {
      number match {
        case 0 => 0
        case 1 => store
        case _ => recurMulti(number-1,store*number)
      }
    }
    recurMulti()
  }

  //using if and else conditions
  def multiplyItSelfCon(num:Int):Int = {

    def recurMulti(number:Int=num, store:Int = 1):Int ={
      if(number == 0){
        0
      }else if(number == 1){
        store
      }else{
        recurMulti(number-1,store*number)
      }
    }

    recurMulti()
  }

}
