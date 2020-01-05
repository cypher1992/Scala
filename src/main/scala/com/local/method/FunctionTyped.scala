package com.local.method

object FunctionTyped extends App{

// Generics

  def discountCode(discountCode:String): Unit ={

    println(s"Discount Code: ${discountCode}")
  }

  def validDiscount(discount:Double):Unit={

    println(s"Discount: ${discount}")
  }


  def genericTypeDiscount[Type](discount: Type): Unit ={

    discount match{
      case d: String => println(s"Discount Code(String): ${discount}")
      case d: Double =>   println(s"Discount(Double): ${discount}")
      case _ => println(s"Discount: ${discount}")
    }
  }

  genericTypeDiscount(20.00)
  genericTypeDiscount[Byte]('C')



  // advance genrics aka Polymorphic Generic Type

  def applyDiscountWithReturnType[Type](discount:Type):Seq[Type]={
    val returnDiscount = discount match{
      case d: String => println(s"Discount Code(String): ${discount}")
        Seq[Type](discount)
      case d: Double => println(s"Discount(Double): ${discount}")
        Seq[Type](discount)
      case _ => println(s"Discount: ${discount}")
        Seq[Type](discount)
    }
    returnDiscount
  }

  applyDiscountWithReturnType[Char]('c')

}
