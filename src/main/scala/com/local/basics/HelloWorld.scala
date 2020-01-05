/*
package com.local.basics

object HelloWorld {

  def main(args: Array[String]): Unit = {

    val str1:String= "HelloWorld"
    val str2:String = "HelloWorld"

    println(str1 == str2)
    println(str1.equals(str2))


    val str4:String = "Ray "
    val str3:String = s"greeting $str4"

    println(str3)

    val PI:Double = 3.14159
    val strFormat:String = f" PI intialized to $PI%.2f"

    println(strFormat)

    def printAny(x:Any)= println(x)
    def printAnyVal(y:AnyVal)= println(y)
    def printAnyRef(z:AnyRef)= println(z)

    val anyVal:Int = 4
    val anyRef:Object = "Ray"

    printAny(anyVal)
    printAnyVal(anyVal)
    printAnyRef(anyRef)

    val emptylist:List[Nothing] = List()
    println(emptylist)

    val someList:List[Int] = List(1,2,3,4)
    var iterList = someList

    while(iterList != Nil){
      println(iterList.head)
      iterList = iterList.tail
    }

    def fraction(numer:Int, denom:Int): Option[Int]={
      if(denom == 0) None
      else Option(numer/denom)
    }


    val result = fraction(4,0)
    val result2 = fraction(7,2 )
    println(result2)


    def printSomething(x:Any):Unit = println(x)

    printSomething(result)

    println(123.isInstanceOf[Int])

    println(12.45.getClass)




    val x = {

      val y = 2*3%5
      val z = y*2
      //z/3.5
      z//return 2 as x
    }

    println("my value is " + x)


    val evenBool = {

      val num = 5
      val even = if(num%2 == 0) {
        var even = true
        even
      }else {
        val notEven = false
        notEven
      }

      even

    }

    println(evenBool)


    val block = {

      val nestBlock = {
        val x = 10
        x
      }

      nestBlock

    }

    println(block)


    val dayOfWeek = "Friday"

    val typeOfDay  = dayOfWeek match{
        	case "Monday" => "Manic Monday"
        	case "Sunday"|"Saturday" => "Sleepy Weekend"
        	case "Tuesday" |"Wednesday" | "Thursday" | "Friday" => "Case of the Mondays"
         }

    println(typeOfDay)

    val dayOfWeek2 = "Saturday"

    val typeOfDay2  = dayOfWeek2 match{
      case "Monday" => "Manic Monday"
      case "Tuesday" |"Wednesday" | "Thursday" | "Friday" => "Case of the Mondays"
      case someOtherDay if  someOtherDay == "Sunday" => "Sleepy Sunday"
      case someOtherDay if  someOtherDay == "Saturday" => "Sizzling Saturday"
    }

    println(typeOfDay2)


    val dayOfWeek3 = " "

    val typeOfDay3  = dayOfWeek3 match{
      case "Monday" => "Manic Monday"
      case "Tuesday" |"Wednesday" | "Thursday" | "Friday" => "Case of the Mondays"
      case someOtherDay if  someOtherDay == "Sunday" => "Sleepy Sunday"
      case someOtherDay if  someOtherDay == "Saturday" => "Sizzling Saturday"
      case someOtherDay => {s"Some other day - neither days, $someOtherDay"}
    }
    println(typeOfDay3) // catch for if there is no values using pattern guard


    val typeOfDay4  = dayOfWeek3 match{
      case "Monday" => "Manic Monday"
      case "Tuesday" |"Wednesday" | "Thursday" | "Friday" => "Case of the Mondays"
      case someOtherDay if  someOtherDay == "Sunday" => "Sleepy Sunday"
      case someOtherDay if  someOtherDay == "Saturday" => "Sizzling Saturday"
      case _ => {s"Some other day - neither days, $dayOfWeek3"}
    }

    println(typeOfDay4)



    val daysOfWeekList:List[String] = List("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    println(daysOfWeekList)


    for(day <- daysOfWeekList)
    {
      day match{
        case "Monday" => println("Manic Monday")
        case otherDay => println(otherDay)
      }


    }

    val whatIsToday = for(day <- daysOfWeekList) yield
      {
        day match{
          case "Monday" => "Manic Monday"
          case otherDay => otherDay
        }
      }

    println(whatIsToday)


    val whatIsYesterdaysTomorrow = for(day <- daysOfWeekList if day == "Monday")yield day


    println(whatIsYesterdaysTomorrow)

    var z = 0
    while(z < daysOfWeekList.size-1){

      val day = daysOfWeekList(z)
      println(day)
      z+=1


    }






  }
}
*/
