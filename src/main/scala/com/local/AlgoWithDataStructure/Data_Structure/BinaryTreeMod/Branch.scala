package com.local.AlgoWithDataStructure.Data_Structure.BinaryTreeMod

import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.BinaryTree

case class Branch[A](value:A,left:BinaryTree[A],right:BinaryTree[A]) extends BinaryTree[A] {

}
