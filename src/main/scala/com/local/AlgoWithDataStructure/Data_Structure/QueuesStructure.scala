package com.local.AlgoWithDataStructure.Data_Structure

class QueueStructure(maxSize:Int) {
    //FIFO
    private var queueBox:Array[Any] = new Array[Any](maxSize)
    private var front:Int = 0
    private var rear:Int = -1
    private var numOfItems:Int = 0

    def getQueueBox():Array[Any] = this.queueBox

    //insert to the rear
    // only if number of items is less than maxsize

    def insert(data:Any):Unit ={
        if(this.rear < this.maxSize){
          this.rear += 1
          this.queueBox(rear) = data
          this.numOfItems +=1
        }else(
          println("Out of bounds")
        )
    }

  def remove():Any ={
    if(this.numOfItems>0){
      val data:Any = this.queueBox(front)
      this.front+=1
      this.numOfItems-=1
      if(this.numOfItems ==0){
        this.front=0
      }
      data
    }
  }

}
