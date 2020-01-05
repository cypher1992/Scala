package com.local.TraitTraining.ExtMultiTraits

class Equity (identifier: String, price:Double, isActive:Boolean,percentageVoteRights:Double)extends Security (identifier,price,isActive){

  def stats():String ={
    f"""
      |IDENTIFIER: ${this.identifier}
      |PRICE: $$ ${this.price}%.2f
      |STATE: ${this.isActive}
      |PERCENTAGE OF VOTING RIGHTS: ${this.percentageVoteRights*100}%.2f %%
    """.stripMargin
  }

}
