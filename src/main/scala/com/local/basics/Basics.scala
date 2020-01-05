package com.local.basics

object Basics {


  def main(args: Array[String]): Unit ={

    val valueVariableOfBoolean: Boolean = true;
    val valueVariableOfByte: Byte = 127;
    val valueVariableOfShort: Short =12314;
    val valueVaribleOfInt: Int =1;
    val valueVariableOfLong: Long= 1231111111;
    val valueVariableOfFloat: Float = 1.4141F;
    val valueVariableOfDouble: Double = 1.000411111111111D;
    val valueVariableOfChar: Char ='C'
    val valueVariableOfString: String = "StringObject" // value by defining type
    val valueVariableOfString2 = "String" // value by type inference
    // common error is mismatch error


    println(valueVariableOfBoolean)
    println(valueVariableOfByte)
    println(valueVariableOfShort)
    println(valueVariableOfLong)
    println(valueVariableOfFloat)
    println(valueVariableOfDouble)
    println(valueVariableOfChar)
    println(valueVariableOfString)
    println(valueVariableOfString2)

    // all values and variables are instances of a class - no exception

    /*
      Unified Type:
      Any is the universal base class in Scala
      AnyVal descends from Any and is the base for all Java Value types
      AnyRef also descends from Any and is the base for all java references types
    */


    val length =10;
    val width = 25;

    val area = {

      val returnArea = {

        width*length
      }
      returnArea // returned value of expression
    }

    println(area)


  //if/else

  val numer : Double = 22
  val denom : Double = 7

  val Quotient = if(denom !=0) {numer/denom} else {None}

  println(Quotient)

   val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

   val day = for(day <- daysOfWeekList) yield{ //
     day match{
       case "Mon" => "Manic Monday"
       case otherDay => otherDay
     }
   }

   println(day)


  val daysofWeek = List("M","T","W","TH","F")
  for(day <-daysofWeek){
    println(day)
  }

  println(" ")
  for(i <- 0 to daysofWeek.size -1){
    println(daysofWeek(i))
  }

  // pattern match
  // conditions inside individual cases can be specified
  // patterned guard or orEd case

  //val today = "sunday" MATCH ERROR THROWN DUE TO NO MATCHING CASE
  //val today = "Saturday"
  val today = "Friday"

  val whatIsToday = today match {
    case "Monday" => "Monday is a Fun day"
    case otherDay   if otherDay == "Saturday" => "Study Saturday" // order of cases matters
    case "Saturday" | "Sunday" => "Study Weekend"
    case _ => { val error = s"Some other day, it's $today" // _ is the default value of the case if match not found
                error // return value of expression
               }

      }

  println(whatIsToday)




  }
}
