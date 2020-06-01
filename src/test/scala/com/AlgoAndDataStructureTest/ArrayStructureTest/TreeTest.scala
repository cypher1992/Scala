package com.AlgoAndDataStructureTest.ArrayStructureTest

import com.local.AlgoWithDataStructure.Data_Structure.BinaryTreeMod.Tree
import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.BinaryTree
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class TreeTest extends AnyFlatSpec with Matchers{

  "Tree: test instanceOf Tree" should "return True" in {
    val tree:Tree = new Tree()
    val isInstanceOfTree:Boolean = tree.isInstanceOf[Tree]
    assert(isInstanceOfTree === true)
  }

  "Tree: test instanceOf BinaryTree" should "return True" in {
    val tree:Tree = new Tree()
    val list:List[Int] = List(1,2,5,6,7,10)
    val bt:BinaryTree[Int] = tree.init_Tree(list)
    val isInstanceOfTree:Boolean = bt.isInstanceOf[BinaryTree[Int]]
    assert(isInstanceOfTree === true)
  }

  "Tree: test instanceOf EmptyBinaryTree" should "return True" in {
    val tree:Tree = new Tree()
    val emptyList:List[Int] = List.empty[Int]
    val bt:BinaryTree[Int] = tree.init_Tree(emptyList)
    println(bt)
    val isInstanceOfTree:Boolean = bt.isInstanceOf[BinaryTree[Int]]
    assert(isInstanceOfTree === true)
  }

}
