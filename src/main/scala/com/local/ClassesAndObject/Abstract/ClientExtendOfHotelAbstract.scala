package com.local.ClassesAndObject.Abstract

object ClientExtendOfHotelAbstract extends App{

  val hotel:HotelExtendsAbstract = new HotelExtendsAbstract("Paper Hotel Factory","Brooklyn",Some(50.00))
  val hotel2:CaseHotelExtendedWithAbstact = new CaseHotelExtendedWithAbstact("Feather Hotel Factory","Crooklyn",Some(125.00))

  hotel.stats()
  hotel2.stats()

}
