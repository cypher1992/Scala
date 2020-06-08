package com.AlgoAndDataStructureTest.ArrayStructureTest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.local.AlgoWithDataStructure.Data_Structure.GraphStructure

class GraphTest extends AnyFlatSpec with Matchers{

  "Graph: test instanceOfGraph" should "Return true" in {
    val list:List[Tuple2[String,String]] = List.empty[Tuple2[String,String]]
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val isInstanceOfGraph:Boolean = graph.isInstanceOf[GraphStructure[String]]
    assert(isInstanceOfGraph)
  }

  "Graph: test getList()" should "Return emptyList" in {
    val list:List[Tuple2[String,String]] = List.empty[Tuple2[String,String]]
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[Tuple2[String,String]] = graph.getList()
    val expected: List[Tuple2[String,String]] = List.empty[Tuple2[String,String]]
    assert(expected === actual)
  }

  "Graph: test getList()" should "return list" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[Tuple2[String,String]] = graph.getList()
    val expected: List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"))
    assert(expected === actual)
  }

  "Graph: test calcSuccessorSet" should "Return Nil" in {
    val list:List[Tuple2[String,String]] = List.empty[Tuple2[String,String]]
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.calcSuccessorSet("New York")
    val expected:List[String] = Nil
    assert(expected === actual)
  }

  "Graph: test calcSuccessorSet(New York)" should "Return Orlando" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.calcSuccessorSet("New York")
    val expected:List[String] = List("Orlando")
    assert(expected === actual)
  }

  "Graph: test calcSuccessorSet(NY) " should "Return Nil" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.calcSuccessorSet("NY")
    val expected:List[String] = List.empty[String]
    assert(expected === actual)
  }

}
