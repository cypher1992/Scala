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

  //Creating a setter that sets meetSisterVarTheVariable, therefore altering the state of the variable
  def setMeetSisterVarTheVariable(newVarVariable:Int):Unit = this.meetSisterVarTheVariable = newVarVariable

   /*
   These types in Scala; Also know as Wrappers.
    - Integer(
      - Byte -  1 byte - Stores whole numbers from -128 to 127
      - Short - 2 bytes - Stores whole numbers from -32,768 to 32,767
      - Int - 4 bytes - Stores whole numbers from -2,147,483,648 to 2,147,483,647
      - Long - 8 bytes - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    - Floating Points(Rational or Decimal Numbers)
      - Float = 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	 	  - Double = 8 bytes - Stores fractional numbers. Sufficient for storing 15 decimal digits
	  - Boolean(True or False):
	  	- Boolean = 1 bit - Stores true or false values
	  - Char(Single Character of the alphabet)
	 	  - Char = 2 bytes - 	Stores a single character/letter or ASCII values
	  - String(Series of concatenated characters) *** Not a Primitive but a Object:
		  - String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes
   */

  val BYTE:Byte = 126;
  val SHORT:Short = 32700;
  val INT:Int = 1;
  val LONG:Long = 1231143124;
  val FLOAT:Float = 12.01f;
  val DOUBLE:Double = 12.001d;
  val BOOL:Boolean = true;
  val CHAR:Char = 'A';
  val STRING:String = "Hello Scala";

  def getBYTE():Byte = this.BYTE;
  def getSHORT():Short = this.SHORT;
  def getINT():Int = this.INT;
  def getLong():Long = this.LONG;
  def getFLOAT():Float = this.FLOAT;
  def getDOUBLE():Double = this.DOUBLE;
  def getBOOL():Boolean = this.BOOL;
  def getCHAR():Char = this.CHAR;
  def getSTRING():String = this.STRING;
}
