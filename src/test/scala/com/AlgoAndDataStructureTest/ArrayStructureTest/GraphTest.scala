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

  "Graph: test calcSuccessorSet(New York) with additional values" should "Return List(Orlando AND Newark)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"),Tuple2("Orlando","Pocanos"),Tuple2("New York","Newark"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.calcSuccessorSet("New York")
    val expected:List[String] = List("Orlando","Newark")
    assert(expected === actual)
  }

  "Graph: test calcSuccessorSet(Orlando) with additional values" should "Return List(Pocanos)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"),Tuple2("Orlando","Pocanos"),Tuple2("New York","Newark"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.calcSuccessorSet("Orlando")
    val expected:List[String] = List("Pocanos")
    assert(expected === actual)
  }

  "Graph: test calcSuccessorSet(Orlando) with additional values" should "Return List(Pocanos,New York)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"),Tuple2("Orlando","Pocanos"),Tuple2("New York","Newark"),Tuple2("Orlando","New York"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.calcSuccessorSet("Orlando")
    val expected:List[String] = List("Pocanos","New York")
    assert(expected === actual)
  }

  "Graph: test traverseDepthFirst(Orlando,List.empty[Tuple2[String,String]])" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List.empty[Tuple2[String,String]]
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseDepthFirst("Orlando",list)
    val expected:List[String] = List("Orlando")
    assert(expected === actual)
  }

  "Graph: test traverseDepthFirst(Orlando,List(Tuple2(New York,Orlando)])" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseDepthFirst("Orlando",list)
    val expected:List[String] = List("Orlando")
    assert(expected === actual)
  }

  "Graph: test traverseDepthFirst(Orlando,List(Tuple2(New York,Orlando), Tuple2(Newark,San Francisco)])" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"), Tuple2("Newark","San Francisco"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseDepthFirst("Orlando",list)
    val expected:List[String] = List("Orlando")
    assert(expected === actual)
  }

  "Graph: test traverseDepthFirst(Orlando,List(Tuple2(New York,Orlando), Tuple2(Newark,San Francisco),Tuple2(New York,New York))" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"), Tuple2("Newark","San Francisco"),Tuple2("New York","New York"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseDepthFirst("New York",list)
    val expected:List[String] = List("New York","Orlando")
    assert(expected === actual)
  }

  "Graph: test traverseDepthFirst(Orlando,List(Tuple2(New York,Orlando), Tuple2(Newark,San Francisco),Tuple2(New York,New York), Tuple2(Orlando,New York))" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"), Tuple2("Newark","San Francisco"),Tuple2("New York","New York"),Tuple2("Orlando","New York"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseDepthFirst("New York",list)
    val expected:List[String] = List("New York","Orlando")
    assert(expected === actual)
  }

  "Graph: test traverseBreadthFirst(Orlando,List.empty[Tuple2[String,String]])" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List.empty[Tuple2[String,String]]
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseBreadthFirst("Orlando",list)
    val expected:List[String] = List("Orlando")
    assert(expected === actual)
  }

  "Graph: test traverseBreadthFirst(Orlando,List(Tuple2(New York,Orlando)])" should "Return List(Orlando)" in {
    val list:List[Tuple2[String,String]] = List(Tuple2("New York","Orlando"))
    val graph:GraphStructure[String] = new GraphStructure[String](list)
    val actual:List[String] = graph.traverseDepthFirst("Orlando",list)
    val expected:List[String] = List("Orlando")
    assert(expected === actual)
  }

}
