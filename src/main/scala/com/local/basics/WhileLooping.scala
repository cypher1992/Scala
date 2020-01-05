package com.local.basics

object WhileLooping{


  def main(args: Array[String]): Unit = {

    /*case class User(name:String,accountID:Int)
    case class Room(rmID:Int,avaliable:Boolean)
    case class BookingDate(dates:List[Int],room:Room,user:User) // need to map collection to associate the availablity with date
    val bookedRoom:Map[User,Room] = Map()
    val :Map[Int,bookedRoom]*/


    val date:List[Int] = (1 to 31).toList
    var intializer:Int = 1


    while(intializer<date.length){
      println(date(intializer))
      intializer+=1
    }

    intializer =1

    do{
     println(date(intializer))
     intializer+=1
    }while(intializer<date.length)



  }



}



