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
    val isInstanceOfTree:Boolean = bt.isInstanceOf[BinaryTree[Int]]
    assert(isInstanceOfTree === true)
  }

  "Tree: test instanceOf OneValueBinaryTree" should "return True" in {
    val tree:Tree = new Tree()
    val list:List[Int] = List(1)
    val bt:BinaryTree[Int] = tree.init_Tree(list)
    println(bt)
    val isInstanceOfTree:Boolean = bt.isInstanceOf[BinaryTree[Int]]
    assert(isInstanceOfTree === true)
  }

  "Tree: test size(list(1,2,5,6,7,10))" should "return 6" in {
    val tree:Tree = new Tree()
    val list:List[Int] = List(1,2,5,6,7,10)
    val bt:BinaryTree[Int] = tree.init_Tree(list)
    val actual:Int = tree.size(bt)
    val expected:Int = 6
    assert(expected === actual)
  }

  "Tree: test size(list(1))" should "return 1" in {
    val tree:Tree = new Tree()
    val list:List[Int] = List(1)
    val bt:BinaryTree[Int] = tree.init_Tree(list)
    val actual:Int = tree.size(bt)
    val expected:Int = 1
    assert(expected === actual)
  }

  "Tree: test size(list())" should "return 0" in {
    val tree:Tree = new Tree()
    val list:List[Int] = List.empty[Int]
    val bt:BinaryTree[Int] = tree.init_Tree(list)
    val actual:Int = tree.size(bt)
    val expected:Int = 0
    assert(expected === actual)
  }
  
  "Tree: test depth(list())" should "return 0" in {
    val tree:Tree = new Tree()
    val list:List[Int] = List.empty[Int]
    val bt:BinaryTree[Int] = tree.init_Tree(list)
    val actual:Int = tree.depth(bt)
    val expected:Int = 0
    assert(expected === actual)
  }

}
