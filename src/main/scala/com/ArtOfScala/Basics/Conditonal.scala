package com.ArtOfScala.Basics

class Conditonal[T]{

  def ifElseEqualsCondtion(value:T,testValue:T):Boolean ={
    if(value == testValue){
      true
    }else{
      false
    }
  }

  def ifElseIfElseEqualsCondtion(value:T,testValue:T,testValue2:T):Boolean ={
    if(value == testValue){
      true
    }
    else if(value == testValue2){
      true
    }
    else{
      false
    }
  }

}
