package com.review.Basic

object OptionControl extends App{

  //Skeleton


  def action:Unit = println("Do Something")
  def actionNone:Unit = println("NAN")
  def checkOption(opt:Option[Any]): Unit ={

    opt match{
    case Some("Some sort of Data...") => action
    case _ => actionNone
  }}
  val data:Option[Any]= Some("Some sort of Data...")
  val none:Option[Any] = None
  val arry:Array[Option[Any]] = Array(data,none)
  for(index <- arry){
    checkOption(index)
  }
}
