package com.local.TraitTraining.ExtMultiTraits

class Bond(identifier:String, price:Double, inActive:Boolean,maturity:String) extends Security(identifier,price,inActive){

  def stats():String ={

    f"""
       |INDENTIFIER: ${this.identifier}
       |PRICE: ${this.price}%.2f
       |STATE: ${this.isActive}
       |MATURITY: ${this.maturity}
     """.stripMargin

  }

}
