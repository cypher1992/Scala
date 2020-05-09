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
          try{
          this.queueBox(rear) = data
          }catch{
            case e: ArrayIndexOutOfBoundsException =>
              println(
                """
                  |ArrayIndexOutOfBoundsException
                """.stripMargin)
              if(this.queueBox(0) == null){
                this.rear = -1
                this.insert(data)
              }
              else{
                println(
                  s"""
                    |Error need to call remove()
                  """.stripMargin)
            }
          }
          this.numOfItems +=1
        }
    }

  def remove():Any ={
    if(this.numOfItems>0){
      val data:Any = this.queueBox(front)
      this.queueBox(this.front) = null
      this.front+=1
      this.numOfItems-=1
      if(this.numOfItems ==0){
        this.front=0
      }
      data
    }
  }

}
