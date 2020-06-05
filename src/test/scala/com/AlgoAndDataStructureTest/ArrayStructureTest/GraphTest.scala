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

}
