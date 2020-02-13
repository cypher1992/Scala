package com.local.Projects.Resource.src

class Scala99Logica1 {

  def and(a:Boolean,b:Boolean):Boolean = {
    (a,b) match {
      case (true,true) => true
      case _ => false
    }
  }

  def or (a:Boolean,b:Boolean):Boolean ={
    (a,b) match {
      case (true,true) | (true,false) | (false,true) => true
      case  _ => false
    }
  }

  def nand (a:Boolean,b:Boolean):Boolean = {

    (a,b) match {
      case (false,false) | (false,true) | (true,false) => true
      case _ => false
    }
  }

}
