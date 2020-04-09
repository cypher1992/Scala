package com.local.AlgoWithDataStructure.Data_Structure



class ListStructure {

  def append[T](index:T,list:List[T]):List[T] = list :+ index

  def removeLambda[T](index:T,list:List[T]):List[T] = list.filterNot(x => x == index)

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

  def insertAt[T](position:Int,list:List[T],insert:T):List[T]={

    def insertAtAppend(p:Int=position,lst:List[T]=list,i:T=insert,append:List[T]=Nil):List[T]={

      p match {
        case 0 => append ::: (i +: lst)
        case _ => insertAtAppend(p-1,lst.tail,i,append :+ lst.head)
      }

    }

    position match {
      case a if(position > -1 && position < list.size+1) => insertAtAppend()
      case b if(list.isEmpty) => list :+ insert
      case _ => throw new java.lang.StringIndexOutOfBoundsException
    }
  }

  // built in function
  def sortLamdbda(list:List[Int]):List[Int] = list.sorted

  def sort(list:List[Int],ascend:Boolean=true):List[Int] ={
    ascend match {
      case true =>  list.sortWith(_ < _)
      case _  => list.sortWith(_>_)
    }
  }

  def slidingWindow[T](list:List[T],size:Int,step:Int):List[List[T]] = list.sliding(size,step).toList

}
