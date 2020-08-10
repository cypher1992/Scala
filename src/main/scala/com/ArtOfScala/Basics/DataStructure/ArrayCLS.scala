package com.ArtOfScala.Basics.DataStructure

import scala.reflect.ClassTag

class ArrayCLS[T](var arr:Array[T]){

    def getArr():Array[T] = this.arr
    def setArr(newArr:Array[T]):Unit = this.arr = newArr

    def addIndex(obj:T,index:Int):Unit = {
      if(index < this.getArr().size && index > -1 ) {
        this.getArr()(index) = obj
      }
    }

    def size():Int = this.getArr().size

    def head():T = this.getArr().head

    def tail():Array[T]= this.getArr().tail

    def isEmpty():Boolean = this.getArr().isEmpty

    def nonEmptyX():Boolean = this.getArr().nonEmpty

    def lastX():T = this.getArr().last

    def sliceX(start:Int,end:Int):Array[T] = this.getArr().slice(start,end)

    def takeX(num:Int):Array[T] = this.getArr().take(num)

    def takeRightX(num:Int):Array[T] = this.getArr().takeRight(num)

    def splitAtX(position:Int):Tuple2[Array[T],Array[T]] = this.getArr().splitAt(position)

    def initX:Array[T] = this.getArr().init

    def dropX(numberofPostions:Int):Array[T] = this.getArr().drop(numberofPostions)

    def containsX(index:T):Boolean = this.getArr().contains(index)

    def endWithX(partOfArray:Array[T]):Boolean = this.getArr().endsWith(partOfArray)

    def startsWithX(partOfArray:Array[T]):Boolean = this.getArr().startsWith(partOfArray)

    def indexOfX(elem:T):Int = this.getArr().indexOf(elem)

    def lastIndexOfX(elem:T):Int = this.getArr().lastIndexOf(elem)

    def diffX(arry:Array[T]):Array[T] = this.getArr().diff(arry)

    def mkStringX():String = this.getArr().mkString

    def reverseX():Array[T] = this.getArr().reverse

    def toListX():List[T] = this.getArr().toList

    def zipX(array:Array[T]):Array[Tuple2[T,T]] = this.getArr().zip(array)

    def zipWithIndeX():Array[Tuple2[T,Int]] = this.getArr().zipWithIndex

    def countX(value:T):Int = this.getArr().count(_ == value)

    // only dropWhile at the beginning of the array
    def dropWhileX(value:T):Array[T] = this.getArr().dropWhile(_  == value)

    def existX(value:T):Boolean = this.getArr().exists(_ == value)

    def filterX(value:T):Array[T] = this.getArr().filter(_ != value)

    def filterNotX(value:T):Array[T] = this.getArr().filterNot(_ == value)

    def forAllX(value:T):Boolean= this.getArr().forall(_ == value)

    def indexWhereX(value:T):Int = this.getArr().indexWhere(_ == value)

    def lastIndexWhereX(value:T):Int = this.getArr().lastIndexWhere(_ == value)

    def mapX[B](f: T => B)(implicit ct: ClassTag[B]): Array[B] = this.getArr().map(f(_))
}
