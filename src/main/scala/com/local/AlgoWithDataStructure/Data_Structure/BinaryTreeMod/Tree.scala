package com.local.AlgoWithDataStructure.Data_Structure.BinaryTreeMod

import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.BinaryTree
import com.local.AlgoWithDataStructure.Data_Structure.BinaryTreeMod.Branch
import com.local.AlgoWithDataStructure.Data_Structure.BinaryTreeMod.Leaf

class Tree {

  def init_Tree[A](list:List[A]): BinaryTree[A] ={
    list match{
      case Nil => Leaf
      case x :: xs =>{
        val halfLength = xs.length/2
        Branch(x,init_Tree(xs.take(halfLength)),init_Tree(xs.drop(halfLength)))
      }
    }
  }

  def size[T](binTree:BinaryTree[T]):Int = binTree match {
    case leaf => 0
    case Branch(_,leftBranch,rightBranch) => 1+size(leftBranch) + size(rightBranch)
  }


}
