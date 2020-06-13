package com.ArtOfScala.Basics

class Types {

  // everything points to any as in object in java
  def initAny(any:Any):Any= any

  //Below here are part of AnyVal
  def initAnyVal(anyval:AnyVal):AnyVal = anyval
  def initDouble(double:Double):Double = double
  def initFloat(float:Float):Float = float
  def initInteger(int:Integer):Integer = int
  def initLong(long:Long):Long= long
  def initShort(short:Short):Short = short
  def initByte(byte:Byte):Byte = byte
  def initUnit():Unit = println("Unit is similar to void. Does nothing")
  def initBool(bool:Boolean):Boolean = bool
  def initChar(char:Char):Char = char

  // below here are part of AnyRef
  def initAnyRef(anyref:AnyRef):AnyRef = anyref
  def initString(string:String):String = string



}
