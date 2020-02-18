package com.review.CollectionFunction

object FlatMapReview extends App{

  val seq:Seq[Int] = Seq.range(1,5)
  val seq2:Seq[Int] = Seq.range(5,10,2)
  val seqInSeq:Seq[Seq[Int]] = Seq(seq,seq2)
  // def flatMap[B](f: (A) ⇒ GenTraversableOnce[B]): TraversableOnce[B]
  val flatMapSeq:Seq[Int] = seqInSeq.flatMap(s => s)

  // takes two list -> transfers each item into list as one unique item
  println(
    s"""
       |${flatMapSeq}
     """.stripMargin)
}
