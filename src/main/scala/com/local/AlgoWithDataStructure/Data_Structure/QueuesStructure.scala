package com.local.AlgoWithDataStructure.Data_Structure

class QueueStructure(maxSize:Int) {
    //FIFO
    private var queueBox:Array[Any] = new Array[Any](maxSize)

    def getQueueBox():Array[Any] = this.queueBox

}
