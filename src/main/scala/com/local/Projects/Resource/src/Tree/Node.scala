package com.local.Projects.Resource.src.Tree

import com.local.Projects.Resource.src.Tree.Tree

case class Node[+T](value: T, left: Tree[T], right:Tree[T]) extends Tree[T]{
  override  def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}
