package com.local.AlgoWithDataStructure.Data_Structure



class ListStructure {

  def append[T](index:T,list:List[T]):List[T] = list :+ index
  def remove[T](index:T,list: List[T]):List[T] = {
   def removeAppend(i:T=index,lst:List[T]=list,append:List[T] =Nil): List[T] ={
     lst match {
       case Nil => append
       case a if(i == lst.head)  => removeAppend(i,lst.tail,append)
       case _ => removeAppend(i,lst.tail,append :+ lst.head)
     }
   }
    removeAppend()
  }

}
