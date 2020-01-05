package com.local.TraitTraining.TypeParameters

class Trade extends SecurtiesFunctions[Securities]{

  override def buy(security:Securities):Boolean ={
    val position:Boolean =
      if(security.getTypeOfContract() == "BUY")
        {
          println(security.desc())
          true
        }
      else
          false

    position
  }
  override def sell(security:Securities):Boolean ={
    val position:Boolean =
      if(security.getTypeOfContract() == "SELL")
      {
        println(security.desc())
        true
      }
      else
        false

    position
  }

  override def hold(security:Securities):(Boolean) ={
    val position:Boolean =
    if(security.getTypeOfContract() == "HOLD")
       {
         println(security.desc())
         true
        }
    else
        false

    position
  }


}
