package com.local.ClassesAndObject.Typed_Class

import com.local.ClassesAndObject.StoreSystem
import com.local.ClassesAndObject.Typed_Class.Motel


/*
obj: Create Typed Class
     - Scala provides support for the traditional Object Oriented approach regarding class inheritance by extending classes.
     - How to define a TypeHotel typed class which expects Hotel types
URL: http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-type-class/
*/


object TypedClient extends App{

val thirtySixMotel:Motel = new  Motel("ThirtySixMotel","Crooklyn",Some(50.00),10)
val momAndDadANB:Airbnb = new Airbnb("Mom & Pop","Queens",Some(120.55))
val seqList = Seq(thirtySixMotel,momAndDadANB)


val listHotel:TypeHotels[Hotel] = new TypeHotels[Hotel](seqList)


  listHotel.printHotel


}