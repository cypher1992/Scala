package com.local.basics

object ForComprehension{


  def main(args: Array[String]): Unit = {


     /* val five:Int =5
      val storeLoopIncludingFive:Unit = for(i <- 1 to five){

        println(i)
      }


      println(s"\n")

      val storeLoopExcludingFive:Unit = for(i <- 1 until five){
        println(i)
      }
      */


    case class User(username:String,password:String, age:Int)

    val user = new User("Rayyn","Password", 27)
    val user1 = new User("Ryanyn","Password1",22)
    val user2 = new User("ImranYn","Password2",14)
    val user3 = new User("NizzyHnf","Password3",28)
    val user4 = new User("NianLu","Password4",33)
    val user5 = new User("SamanthaYsn","Disney2002",16)

    val listUsers:List[User] =  List(user,user1,user2,user3,user4,user5)
    // looping through list
    val prtAllUser = for(user <- listUsers){
      println(user)
    }

    // looping through list with filter
    val printAgeGreaterThan24 = for(user <- listUsers if user.age >24){
      println(s"${user.username} is greater than 25 and is quarter century old.\n${user.username} is ${user.age}")
    }

    // store value into val using yield keyword
    val youngerThan21:List[User] = for{user<- listUsers if(user.age<21)}yield user
    println(youngerThan21)



  }
}