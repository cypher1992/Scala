package com.local.basics

object StringInterpolation {


 //String Interpolation

  def main(args: Array[String]): Unit = {

    println("Using String Interpolatin to print a variable \n \n ")
    val str = "Here is string assigned to str"

    println(s"This is my string using Interpolation, Here is What is said ... $str ")

    case class User(username:String, password: String)

    val user: User = User("Ryassin","Password1")

    // use of curly braces to extract specify attributes
    println(s"Here is the user info: \nusername: ${user.username} \npassword: ${user.password}")

    val age:Int = 27

    // val can used in interpolation
    println(s"User Age: ${age}")

    // val can be used as a expression to test condition
    println(s"Is User age greater than 21 to buy liquor: ${age >21}")


    //using string interpolation to Format String
    println(f"White spaces infront of user password: ${user.password}%20s ")


    //using string interpolation to Format Numbers
    val userIncome:Float = 10000.00f
    println(s"Here we lost percision ${userIncome}")
    println(f"\n Here we gain the extra two decimal place: ${userIncome}%.2f")



    //How to Escape Characters and Create Multiline String

    val userJson: String = "{\"username\":\"RayYnn\",\"password\":\"Password1\",\"userId\":1}"

    println(userJson)

    // Alternative method to the \" backslash and \ character to overcome longer Strings

    val userJson2: String = """{"username","RayYnn","password","Password1","userId",1}"""

    println(s"With BacksLash: ${userJson} \nWithout Backslash(triple quote): ${userJson2})")

    val userJson3: String =
      """
        |{
        |"username": "RayYnn"
        |"password": "Password1"
        |"userId": 1
        |}
      """.stripMargin

     println(userJson3)


    // This is known as arbitrary Expression where you can conduct mathematical expression
    val ageDifferenceAfterLegalAdult:String = s"${age-18}"
    println(ageDifferenceAfterLegalAdult)

  }



}
