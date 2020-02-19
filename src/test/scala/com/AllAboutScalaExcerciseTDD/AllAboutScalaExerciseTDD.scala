package com.AllAboutScalaExcerciseTDD
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Projects.Resource.AllAboutScalaProblems.Basics

class AllAboutScalaExerciseTDD extends AnyFlatSpec  with Matchers {

  val basic:Basics = new Basics

  "AASE Challenge: jsonNotation(emptyMap)" should "return {}" in {
    val map:Map[String,String] = Map.empty[String,String]
    val actual:String = basic.jsonNotation(map)
    val expected:String = "{\n\n}"

    assert(actual == expected)
  }

  "AASE Challenge: jsonNotation(str)" should "return {key1:val1}" in {
    val map:Map[String,String] = Map("Str1"-> "Val1")
    val actual:String = basic.jsonNotation(map)
    println(actual)
    val expected:String = "{\nStr1:Val1\n}"

    assert(actual == expected)
  }

  "AASE Challenge: jsonNotation(str)" should "return {key1:val1 ...}" in {
    val map:Map[String,String] = Map("Str1"-> "Val1","Str2"-> "Val2","Str3"-> "Val3")
    val actual:String = basic.jsonNotation(map)
    println(actual)
    val expected:String = "{\nStr1:Val1,\nStr2:Val2,\nStr3:Val3\n}"

    assert(actual == expected)
  }

  "AASE Challenge: minMax(Seq.empty[Int])" should "throw NoSuchElement" in {
    val seq:Seq[Int] = Seq.empty[Int]
    assertThrows[NoSuchElementException]{basic.findMaxMin(seq)}
  }

  "AASE Challenge: minMax(Seq(1253))" should "Map(\"Min\"->1253,\"Max\" ->1253 )" in {
    val seq:Seq[Int] = Seq(1253)
    val actual:Map[String,Int] =basic.findMaxMin(seq)
    val expected:Map[String,Int] = Map("Min"->1253,"Max"->1253)

    assert(actual == expected)
  }



}
