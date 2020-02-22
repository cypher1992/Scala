package com.Scala99Test.ListTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.Projects.Resource.src.TreePKG.Tree
import com.local.Projects.Resource.src.TreePKG.Node
import com.local.Projects.Resource.src.TreePKG.End

class TreeTest extends AnyFlatSpec with Matchers{

  "Scala99Tree Challenge: Node(Node...)" should "return an instance of Node" in {
  val tree:Node[Char] = Node('A',Node('B',Node('D'),Node('E')),Node('C',End,Node('F',Node('G'),End)))

    println(
      s"""
        |Tree: ${tree.toString}
      """.stripMargin)
  assert(tree.isInstanceOf[Node[Char]])
  }

}
