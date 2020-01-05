package com.local.method

object FunctionalVarArgs extends App{

  // Taking in variable number of arguments


  // note the little asterisk after the string to take enable various strings to be appended
  def printReport(name:String*):Unit={
    println(s"""List of Investment Banks: ${name.mkString(" - ")}""")
  }

  val baml:String = "Bank Of America"
  val jpm:String = "JP Morgan"
  val ms:String = "Morgan Stanley"
  val gs: String = "Goldman Sachs"

  printReport(baml,jpm,ms,gs)

  val list:List[String]  =List(baml,jpm,ms,gs)
  val seq:Seq[String] = List("Black Stone","Apax Partners","KKR")
  val arry:Array[String] = Array("Polygon","Black Rock", "Tetragon","Bridge Water")
  printReport(list: _*) // to use list
  printReport(seq: _*) // to use on sequence
  printReport(arry: _*) //to use on arrays

}
