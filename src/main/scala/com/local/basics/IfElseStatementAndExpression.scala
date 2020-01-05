package com.local.basics

object IfElseStatementAndExpression {

  def main(args: Array[String]): Unit = {


    case class User(username:String,password:String,age:Int)
    val user:User = new User("RayYnn","Password1",25)
    val user1:User = new User("NianLu",password="JaQuan",age=16)

    def ageRestrictionToWorkFullTime(userAge:Int):Boolean = if(user.age>18)(true) else (false)

    println(s"${user.username} is capable of working: " + ageRestrictionToWorkFullTime(user.age) + s"\n${user1.username} is not capable of working under Labor Laws: " + ageRestrictionToWorkFullTime(user1.age))

    def printAgeRestrictionToWorkFullTime(user:User):Unit =
      if(user.age > 18)
        (println(s"${user.username} is permitted to work. User's age: ${user.age}"))
      else
        (println(s"${user.username} is not permitted to work. User's age: ${user.age}"))

    printAgeRestrictionToWorkFullTime(user1)








  }
}
