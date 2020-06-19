package com.ArtOfScala.Basics

class Function{

  // basic function it has name
  // parameter(s)
  // return value(s)
  def add(double:Double,double2:Double):Double = double+double2

  // HOF - high order function
  // can pass a function as a parameter same as mathematics
  def double(double:Double,double2:Double):Double = this.add(double,double2) * 2

  // functions main func is to break the problem into smaller pieces
  // add money to deposit
  // find balance

  case class Account(var balance:Double){
    def getBalance():Double = this.balance
    def setBalance(newBalance:Double) = {
      this.balance = newBalance
    }
    def depositIntoAccount(deposit:Double):Unit =this.setBalance(this.getBalance() + deposit)
  }

  def initAccount(balance:Double):Account = new Account(balance)
}
