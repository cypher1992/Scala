package com.ArtOfScala.Basics

class Function{

  // basic function it has name
  // parameter(s)
  // return value(s)
  def add(double:Double,double2:Double):Double = double+double2

  // HOF - high order function
  // can pass a function as a parameter same as mathematics
  def double(double:Double,double2:Double):Double = this.add(double,double2) * 2
  
}
