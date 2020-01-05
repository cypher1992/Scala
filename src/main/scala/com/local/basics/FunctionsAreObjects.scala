package com.local.basics

object FunctionsAreObjects {

  // functions are objects
  // methods are not object

  // method
  def main(args: Array[String]): Unit = {
    def getArea(radius: Double): Double = {
      val PI = 3.14
      PI * radius * radius
    }

    // Function Object

    val getAREA = (radius: Double) => {
      val PI = 3.14
      PI * radius * radius
    }: Double


    println(getAREA(10.0));

    def outputString(input:String): Unit ={
      println(input)
    }

    // First type of conversion from method to function - explicitly telling the conversion
    val outputStr: (String) => Unit = outputString  // convert method to Function referring to Input and Output
                  //input Parameter Type and => Return Type
    outputStr("Hello")

    // Second Type of conversion from method to function - automatic from input to return type if they are the same
    val area = getArea _


    println(area(40))

    val length: Float = 10.00F;

    def squareStat(side:Float) ={

      def getSquarePerimeter(side:Float)= side * 4
      def getSquareArea(side:Float)= side*side

      (getSquarePerimeter(side),getSquareArea(side))
    }


    println(squareStat(length))

    // parameter default value -
      // restriction which parameter has default value
      // specify the parameter value by out of order

    def getCircleStats(PI:Double =3.14,radius:Double)={
      def getCircleArea(radius:Double) = PI *radius * radius
      def getCircleCircumference(radius:Double) = PI*radius*2
      (getCircleArea(radius),getCircleCircumference(radius))
    }
    // Scala was able to provide second parameter without the first parameter hence parameter default value
    println(getCircleStats(radius=24))

    // type parameters - generics

    def printPairTypes[K,V](k: K,v: V)={
      val keyType = k.getClass
      val valueType = v.getClass
      println(s"$k, $v are of types $keyType , $valueType")
    }

    val inputOne: Byte = 26;
    val inputTwo: String = "InputTwo";

    printPairTypes(inputOne,inputTwo)

    // partially applied functions - function overloading
    // currying - grouping parameters and specifying the parameters for some of those groups


    val x = List(List(1,1),2,List(3,List(5,8)))


/*
    def recursion(list:List[Any]):List[Any] ={
      if(list.isEmpty)
        list
      else
        val returnedList = list.flatten
    }
*/



  }
}
