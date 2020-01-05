package com.local.TraitTraining.HotelFactory

/*
URL: http://allaboutscala.com/tutorials/chapter-5-traits/scala-traits-companion-object-factory-pattern/
GOAL:  we will learn how to use traits and companion objects to implement a Factory Pattern.

*/

object Hotels {

  trait Hotel{

    def name:String

  }

  class PaperFactoryHotel() extends Hotel{

    def name():String ={
      """
        |Paper Factory Hotel
      """.stripMargin
    }

  }

  class FeatherFactoryHotel() extends Hotel {

    def name():String = {
      """
        |Feather Factory Hotel
      """.stripMargin
    }
  }

  class OtherHotels() extends Hotel{

    def name():String ={
      """
        |Other Hotel
      """.stripMargin
    }

  }



}
