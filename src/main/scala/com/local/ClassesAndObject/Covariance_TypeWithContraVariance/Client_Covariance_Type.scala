package com.local.ClassesAndObject.Covariance_TypeWithContraVariance

object Client_Covariance_Type extends App {


/*
src: https://docs.scala-lang.org/tour/variances.html
class Foo[+A] // A covariant class
class Bar[-A] // A contravariant class
class Baz[A]  // An invariant class



*/
val bond = new Fixed_Income(Some(1000.00),"10YNOTE",Some(1),Some(0.03),Some(0.05),Some(10),Some(2))
val bond2 = new Fixed_Income(Some(1000.00),"2YNOTE",Some(1),Some(0.03),Some(0.05),Some(2),Some(2))
val equity = new Equity(Some(50.00),"Equity",Some(100),"BX")

val seqFinancialInstruments:Seq[Financial_Instrument] = Seq(bond,bond2,equity)
val finType:FinancialnstrumentType[Financial_Instrument] = new FinancialnstrumentType[Financial_Instrument](seqFinancialInstruments)
val equityType:FinancialInstrumentTypeContraVariance[Equity] = new FinancialInstrumentTypeContraVariance(Seq(equity))

equityType.printStats
finType.printStats


}
