package com.refresher.basics

class VariablesAndTypes {

  /*
  Variables is the bread and butter of a programming. Immutability is first class citizen in scala programming.
    - Define variables using key word val
    eg.
    - val variableName:DataType = assignedValue
   */

  val meetValTheVariable:Int = 5
  // you can not reassign variable that are defined using val


  def getMeetValTheVariable():Int = this.meetValTheVariable
  /*
   def setMeetValTheVariable(newVariable:Int):Unit = this.meetValTheVariable = newVariable
   - will get can a syntax error if you uncomment line 17, if you want to reassign MeetValTheVariable
   - To get around this you can assign the variable to Var.
  */
  var meetSisterVarTheVariable:Int = 10




}
