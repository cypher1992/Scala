package com.local.ClassesAndObject.Abstract

class HotelExtendsAbstract(name:String,location:String,cost:Option[Double]) extends abstractHotel(name,location,cost){

  override def stats():Unit ={
    println(
      f"""
         |NAME:${this.name}
         |LOCATION:${this.location}
         |PRICE:${this.cost.getOrElse(0.00)}%.2f
       """.stripMargin
    )

  }

}
