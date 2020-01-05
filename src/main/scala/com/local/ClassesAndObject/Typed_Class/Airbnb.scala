package com.local.ClassesAndObject.Typed_Class

case class Airbnb(name:String,location:String,cost:Option[Double]= Some(0.00)) extends Hotel(name,location,cost) {


  override def stats():Unit ={

    println(
      s"""
         |NAME: ${this.name}
         |LOCATION: ${this.location}
         |COST: ${this.cost.getOrElse(0.00)}
       """.stripMargin)

  }
}
