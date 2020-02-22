package com.local.Method

import com.local.Method.FunctionsWithImplictAKADependencyInjection.items

object FunctionsWithImplictAKADependencyInjection extends App{

  case class Items(list:Map[String,Double])

  val list:Map[String,Double] = Map("5 Apples" -> 3.00,"Milk" ->2.50,"Eggs"->1.50).withDefaultValue(0.00)
  val items = Items(list)
  implicit val shippingCost:Double = 0.10

  println(items.list.getOrElse("5 Apples","N/A"))



  // calculate taxes with total
   def groceryTotal(items:Items)(implicit tax:Double = 0.08):Double={
    var sum:Double = 0.00
      for(item <- items.list){
        sum += item._2
      }
    sum *(1-tax)
  }


  val totalGroceryWithTaxes:Double = groceryTotal(items)
  val totalGroceryWithTaxesat20:Double = groceryTotal(items)(0.20)

  println(f"Regular taxes at 8%% $$${totalGroceryWithTaxes}%.2f \nTaxes at 20%% $$${totalGroceryWithTaxesat20}%.2f")



// creating a wrapper class: Converting primitives to objects

  class Total(total:Double){


    def isTotalGreaterThan10():Boolean = total > 10.00


  }




}
