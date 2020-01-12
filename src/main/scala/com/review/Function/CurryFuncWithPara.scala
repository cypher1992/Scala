package com.review.Function

object CurryFuncWithPara extends App{

  /*
  URL:  http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-create-function-currying-parameter-groups/
  OBJ:  We will learn how to create functions whose parameters are organized into parameter groups - also known as Function Currying
  INFO: You will be introduced to creating Partially Applied Functions from curried functions.
        Functions defined with parameter groups are also commonly referred to as curried functions.
   USE: Common use to chain functions
   */

  def add(varible1:Int)(varible2:Int):Int={ varible1 + varible2}
  // using full application of curried function
  val sum:Int = add(2)(2)
  // using partial application
  // stored function into sum2
  val sum2 =add(2)_
  // in Sum2 provide second parameter -> Passing the Function
  val sum4:Int = sum2(2)

  println(
    s"""
      |Full Application of Function passing two parameter(2,2): ${sum}
      |Partial Application Storing the Function into Sum2(2): ${sum2}
      |Partial Application of Function passing additional parameter(2): ${sum4}
    """.stripMargin)



}
