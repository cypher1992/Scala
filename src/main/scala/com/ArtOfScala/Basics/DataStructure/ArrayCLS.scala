package com.ArtOfScala.Basics.DataStructure

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
}
