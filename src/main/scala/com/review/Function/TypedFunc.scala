package com.review.Function

object TypedFunc extends App{

  abstract class Connection(name:String,isOpened:Boolean)

  case class ConnDB (name:String= "DataBaseName",isOpened:Boolean = true) extends Connection(name,isOpened)
  case class ConnCSV(name:String = "CSVFile",isOpened:Boolean =true) extends Connection(name,isOpened)
  case class ConnHadoop(name:String ="HiveTable",isOpened:Boolean = true )extends Connection(name,isOpened)

  // Not a TypeFunc
  def connectionFactory(conn:String): Option[Connection]={

    conn match {

      case "DB" => Some(new ConnDB())
      case "CSV" => Some(new ConnCSV())
      case "HADOOP" => Some(new ConnHadoop())
      case _ => None
    }

  }


  // Using Generics of Types
  // Need to Adjust to use Options with Get value of boolean
  def isOpenTypeFunc[T](conn:T):Boolean={

    conn match{
      case conn:ConnDB => conn.isOpened
      case conn:ConnCSV => conn.isOpened
      case conn:ConnHadoop => conn.isOpened
      case _ => false
    }
  }

  val conn:Option[Connection]= connectionFactory("NAN")
  val conn2:Option[Connection]= connectionFactory("DB")
  val conn3:ConnHadoop = new ConnHadoop()

  val isOpen:Boolean = isOpenTypeFunc(conn3)

  println(
    s"""
       |${conn.getOrElse("Connection Doesn't Exist")}
       |${conn2.get}
       |Is DB Connection Opened: ${isOpen}
     """.stripMargin)



}
