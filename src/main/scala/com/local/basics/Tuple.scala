/*
// Need to revisit and relearn!!!!
package com.local.basics

object Tuple extends App{

  // Tuple 1 represent 1 value
  val stock = Tuple1(12.00)
  // Tuple 2 represent 2 vales
  val stock1 = Tuple2(1.00,"USD")


  //accessing tuples
  println(s"Prints the second value of stock 2: ${stock1._2} and the first value ${stock1._1}")

  // creating tuple with 3 attributes
  val instrumentEquity = Tuple3("STOCK","OPTIONS/FUTURES","N/A")
  val instrumentLongTermDebt = Tuple3("BOND","BOND_FUTURES/","LOAN")
  val instrumentForex = Tuple3("CURRENCY","CURRENCY_FUTURES","SPOT_FOREX")

  val listInstruments:List[Any] = List(instrumentEquity,instrumentLongTermDebt,instrumentForex)

  println(listInstruments)



  val typeOfInstrumentList:String = listInstruments.foreach{ tuple => {
      tuple match {
        case d if d._1 == "STOCK" => d._3
        case _ => None
      }
    }

  }



}
*/
