package com.local.basics

object Range{

  def main(args: Array[String]): Unit = {

    case class stockOwnerShip(ticker:String,exchange:String,outstandingStock:Int)

    val blackstone = new stockOwnerShip("BX","NYSE",15)
    val intialCount:Int = 1

    // store range
    val count = intialCount to blackstone.outstandingStock
    // store up to n-1
    val untilCount = intialCount until blackstone.outstandingStock
    // increment by 3
    val countBy3 = intialCount to blackstone.outstandingStock by 3

    println(s"${count} \n")
    println(s"${untilCount} \n")
    println(s"${countBy3} \n")

    val printCount = for(value <- count){
      println(value)
    }

    // toList function to store list of numbers is list
    val list:List[Int] = (1 to 5).toList
    // toSeq function to store Sequence of numbers is Sequence Collection
    val seq:Seq[Int] = (1 to 10).toSeq
    // toSet function to store Set of numbers is Set Collection
    val set:Set[Char] = ('a' to 'z').toSet
    // toArray function to store Array of numbers is Array Collection
    val arry:Array[Int] = (1 to 4).toArray


    println(s"${list}\n${seq}\n${set}\n${arry}")




  }


}