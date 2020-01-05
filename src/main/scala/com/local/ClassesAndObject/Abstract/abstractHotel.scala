package com.local.ClassesAndObject.Abstract

/*
OBJ: Abstract Implementation: URL: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-extend-class/
*/

abstract class abstractHotel(name:String, location:String, cost:Option[Double]=Some(0.00)) {

  def stats():Unit

}
