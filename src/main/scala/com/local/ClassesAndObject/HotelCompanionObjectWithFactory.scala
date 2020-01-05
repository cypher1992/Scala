package com.local.ClassesAndObject

import com.local.ClassesAndObject.Hotel

class HotelCompanionObjectWithFactory(typeOfService:String, averageCostPerNight:Option[Double] = None){

  def info():Unit={

    println(
      s"""
        |Type Of Service: ${typeOfService}
        |AVG COST PER NIGHT: $$ ${averageCostPerNight.getOrElse(0.00)}
        |uuid = ${Hotel.getterUUID()}
      """.stripMargin

    )


  }


}
