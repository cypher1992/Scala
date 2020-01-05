package com.local.CollectionFunction

object HeadWithLastFunc extends App{

  /*
    HEAD FUNC
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-head-example/
    OBJ:  We will learn how to use the head function with examples on collection data structures in Scala.
    INFO: The head function is well-suited to data structures that organize items in a consecutive manner, such as, a List,
          or a Queue, as it returns the first element in the collection.
    FUNC: def head: A

    LAST FUNC
    URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-last-example/
    OBJ:  We will learn how to use the last function on collection data structures in Scala
    INFO: Similar to the head function, the last function is well-suited to data structures that organize items in a consecutive
          manner, such as, a List, or a Queue, as it returns the last element in the collection.
    FUNC: def last: A

   */

  val hotel:Seq[String] = Seq("Z-Hotel","Paper Factory Hotel","Feather Factory Hotel","Pod 39","Hilton")
  val headHotel:String = hotel.headOption.getOrElse("DNE")
  val alternativeHead:String = hotel(0)
  val lastIndex:String = hotel.lastOption.getOrElse("DNE")
  val alternativeIndex:String = hotel(hotel.size-1)


  println(
    s"""
       |Initialization Sequence
       |${hotel}
       |First Index using Head Func
       |${headHotel}
       |Alternative First Index
       |${alternativeHead}
       |Last Index using Head Func
       |${lastIndex}
       |Alternative Last Index
       |${alternativeIndex}
     """.stripMargin)

}
