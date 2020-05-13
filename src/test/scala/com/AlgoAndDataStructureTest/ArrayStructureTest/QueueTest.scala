package com.AlgoAndDataStructureTest.ArrayStructureTest

import com.local.AlgoWithDataStructure.Data_Structure.QueueStructure
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class QueueTest extends AnyFlatSpec with Matchers{

  "AlgoAndDataStructure Queue: is instance of QueueStructure" should "return true" in{
    val queue:QueueStructure = new QueueStructure(3)
    val isQueue:Boolean = queue.isInstanceOf[QueueStructure]
    assert(isQueue === true)
  }

  "AlgoAndDataStructure Queue: getQueueBox()" should "return queueBox()" in {
    val queue:QueueStructure = new QueueStructure(3)
    val actual:Array[Any] = queue.getQueueBox()
    val expected:Array[Any] = new Array[Any](3)
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: insert()" should "returns queue of 9" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 9
    val expected:Array[Any] = array
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: insert()" should "returns queue of [9,8,9]" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(9)
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 9
    array(1) = 8
    array(2) = 9
    val expected:Array[Any] = array
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: insert() more than maxsize" should "returns queue of [9,8,9]" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(9)
    try{
      queue.insert(10)
    }catch{
      case e: ArrayIndexOutOfBoundsException =>
      val actual:Array[Any] = queue.getQueueBox()
      var array:Array[Any] = new Array[Any](3)
      array(0) = 9
      array(1) = 8
      array(2) = 9
      val expected:Array[Any] = array
      assert(expected === actual)
    }
  }

  "AlgoAndDataStructure Queue: insert() more than maxsize" should "returns queue of [10,null,null]" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(9)
    for(i <- 0 until 3){
      queue.remove()
    }
      queue.insert(10)
        val actual:Array[Any] = queue.getQueueBox()
        var array:Array[Any] = new Array[Any](3)
        array(0) = 10
        array(1) = null
        array(2) = null
        val expected:Array[Any] = array
        assert(actual === expected)
  }

  "AlgoAndDataStructure Queue: insert() more than maxsize" should "not alter queue of [9,8,9]" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(9)
    queue.insert(10)
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 9
    array(1) = 8
    array(2) = 9
    val expected:Array[Any] = array
    assert(actual === expected)
  }


  "AlgoAndDataStructure Queue: insert() more than maxsize and null index(0)" should "return queue of [10,8,9]" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(9)
    queue.remove()
    queue.insert(10)
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 10
    array(1) = 8
    array(2) = 9
    val expected:Array[Any] = array
    assert(actual === expected)
  }

  "AlgoAndDataStructure Queue: insert() more than maxsize and null index(0)" should "return queue of [10,null,null]" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(9)
    for(i <-0 until 5){
      queue.remove()
    }
    queue.insert(10)
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 10
    array(1) = null
    array(2) = null
    val expected:Array[Any] = array
    assert(actual === expected)
  }


  "AlgoAndDataStructure Queue: remove()" should "returns remove of empty queue" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.remove()
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = null
    val expected:Array[Any] = array
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: remove()" should "returns remove of queue(9)" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.remove()
    val actual:Array[Any] = queue.getQueueBox()
    var array:Array[Any] = new Array[Any](3)
    array(0) = null
    array(1) = 8
    val expected:Array[Any] = array
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: peekFront()" should "returns null" in {
    val queue: QueueStructure = new QueueStructure(3)
    val actual:Any = queue.peekFront()
    var array:Array[Any] = new Array[Any](3)
    array(0) = null
    val expected:Any = array(0)
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: peekFront()" should "returns 9" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    val actual:Any = queue.peekFront()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 9
    val expected:Any = array(0)
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: peekFront() with queue of 2" should "returns 9" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    val actual:Any = queue.peekFront()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 9
    array(1) = 8
    val expected:Any = array(0)
    assert(expected === actual)
  }

  "AlgoAndDataStructure Queue: peekFront() with queue of 3" should "returns 9" in {
    val queue: QueueStructure = new QueueStructure(3)
    queue.insert(9)
    queue.insert(8)
    queue.insert(7)
    val actual:Any = queue.peekFront()
    var array:Array[Any] = new Array[Any](3)
    array(0) = 9
    array(1) = 8
    array(2) = 7
    val expected:Any = array(0)
    assert(expected === actual)
  }



}
