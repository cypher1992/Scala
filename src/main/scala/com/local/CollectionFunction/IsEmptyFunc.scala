package com.local.CollectionFunction

object IsEmptyFunc extends App{

/*
  URL:  http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-isempty-example/
  OBJ:  we will learn how to use the isEmpty function with examples on collection data structures in Scala.
  INFO: The isEmpty function, as its name implies, will return true if a given collection does not contain any items, in
        contrast to returning false for a collection with at least one element
  FUNC: abstract def isEmpty: Boolean
*/

  val movies:Seq[String] = Seq.empty[String]
  val moviesList:List[String] = List("Hurt Locker","Grand Budapest Hotel","World War Z","Contingion")
  val sizeOfMovies:Int = movies.size
  val isEmptyMovies:Boolean = movies.isEmpty

  println(
    s"""
      |Initialize Empty Sequence
      |${movies}
      |Initialize List with Three Values
      |${moviesList}
      |Size of Movies  == EMPTY SEQUENCE
      |${sizeOfMovies}
      |Is Movies Empty
      |${isEmptyMovies}
    """.stripMargin)



}
