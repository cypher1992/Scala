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


}
