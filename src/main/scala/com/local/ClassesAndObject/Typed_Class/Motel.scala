package com.local.ClassesAndObject.Typed_Class

class Motel(name:String,location:String,cost:Option[Double],capacity:Int =50) extends Hotel(name,location,cost){


  def stats():Unit ={

    println(
      f"""
         |NAME: ${this.name}
         |LOCATION: ${this.location}
         |COST: ${this.cost.getOrElse(0.00)}%.2f
         |CAPACITY: ${this.capacity}
       """.stripMargin)


  }
}
