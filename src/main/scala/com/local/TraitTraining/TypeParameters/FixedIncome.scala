package com.local.TraitTraining.TypeParameters
import org.joda.time.Days
import org.joda.time.{DateTime, JodaTimePermission}

class FixedIncome(typeOfContract:String,lengthOfContract:Int,identifier:String,currentPrice:List[Double]) extends Securities(typeOfContract,lengthOfContract) {

  lazy val time = DateTime.now()

  override def desc():String = {
    s"""
       | FIXED INCOME
       |    IDENTIFIER: ${this.identifier }
       |    DATE:   ${this.time}
       |    PRICE OPEN:  $$ ${this.currentPrice(0)}
       |          CLOSE: $$ ${this.currentPrice(1)}
       |          HIGH:  $$ ${this.currentPrice(2)}
       |          LOW:   $$ ${this.currentPrice(3)}
       | CONTRACT
       |    TYPE:   ${this.typeOfContract}
       |    LENGTH: ${this.lengthOfContract} MONTHS
    """.stripMargin

  }

}
