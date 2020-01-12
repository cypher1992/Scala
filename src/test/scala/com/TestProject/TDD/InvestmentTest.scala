package com.TestProject.TDD

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.Assertions._
import com.local.Interest.Investments.Investment

class InvestmentTest extends AnyFlatSpec with Matchers {

/*
  URL:  http://allaboutscala.com/scala-cheatsheet/
  OBJ:  Create a test class using FlatSpec and Matchers
  INFO: Testing Equality as expected with assert
*/

  behavior of "Investment Class"

  "Investment Test: Principal Equals 100k" should "Match 100k" in {

    val investment:Investment = new Investment(100000.00,5,12,0.12)

    val principal:Double = investment.getPrincipal()
    investment.getPrincipal() === 100000.00

    assert(principal === 100000.00)
  }

  "Investment Test: List Of Investment" should "Match Three" in {

    val investment:Investment = new Investment(100000.00,5,12,0.12)
    val investment1:Investment = new Investment(100000.00,5,12,0.12)
    val investment2:Investment = new Investment(100000.00,5,12,0.12)

    val portfolio:Seq[Investment] = Seq(investment,investment1,investment2)
    val actualSize:Int = portfolio.size
    val expectSize:Int = 3

    assert(actualSize === expectSize)
  }


  "Investment Test: Investment Principal is Greater than $10,000.00" should "Match True" in {

    val investment:Investment = new Investment(100000.00,5,12,0.12)

    val actualCondition:Boolean = investment.getPrincipal() > 10000.00
    val expectCondition:Boolean = true

    assert(actualCondition === expectCondition)
  }

  "Portfolio Test: Investment Collection Seq" should "Terms are 5" in {

    val investment:Investment = new Investment(100000.00,5,12,0.12)
    val investment1:Investment = new Investment(100000.00,5,12,0.12)
    val investment2:Investment = new Investment(100000.00,5,12,0.12)

    val portfolio:Seq[Investment] = Seq(investment,investment1,investment2)

    for(investmentIndex <- portfolio){
      assert(investmentIndex.getTerm() === 5)
    }
  }

  "Investment Type" should "Investment" in {
    val investment:Investment = new Investment(10000.00,5,4,0.12)

    val isTypeOf:Boolean = investment.isInstanceOf[Investment]

    assert(isTypeOf)
  }


}
