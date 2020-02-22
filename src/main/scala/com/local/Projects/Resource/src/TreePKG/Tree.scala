package com.local.Projects.Resource.src.TreePKG

sealed abstract class Tree[+T]
/*
  INFO:
  create an instance of a node that act as value
  Each node as its value, left node and right node that extends to more values and branches
  Root start at the top of the tree and then goes down to each tree
  Trees are NON linear
  Tree can be defined as a collection of entities(nodes) linked together to simulate a hierarchy

  P54 Omitted; our tree representation will only allow well-formed trees.
  Score one for static typing.
*/



case class Node[+T](value: T, left: Tree[T], right:Tree[T]) extends Tree[T]{
  override  def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}

case object End extends Tree[Nothing]{
  override def toString = "."

}

object Node{
  def apply[T](value:T):Node[T] = Node(value,End,End)
}