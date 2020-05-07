package com.local.AlgoWithDataStructure.Data_Structure

class QueueStructure(maxSize:Int) {
    //FIFO
    private var queueBox:Array[Any] = new Array[Any](maxSize)
    private var front:Int = 0
    private var rear:Int = -1
    private var numOfItems:Int = 0

    def getQueueBox():Array[Any] = this.queueBox

    def insert(data:Any):Unit ={
        if(rear == maxSize-1){
            this.rear = -1
        }
        this.rear += 1
        this.queueBox(rear) = data
        this.numOfItems +=1
    }

}
