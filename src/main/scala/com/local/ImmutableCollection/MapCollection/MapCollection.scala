package com.local.ImmutableCollection.MapCollection

object MapCollection extends App{

/*
URL:  http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-map/
AIM:  We will learn how to use Scala's Immutable Map and perform common operations such as initialization,
      adding or removing elements and find elements by key within the Map
*/

val stocks:Map[String,String] = Map(("BX","Blackstone"),("JPM","JPMorganStanley"),("C","Citi"),("BAC","BAML"))
// Adding Value to Map
val socStock:Tuple2[String,String] = ("SOC","Societe Generale")
val stockAdd:Map[String,String] = stocks + socStock
// goldmansacs wrong ticker // override stocks SOC and replace value with goldman sacs instead of societe generale
val goldmanStock:Tuple2[String,String] = ("SOC","Goldman Sacs")
val stockWrongAdd:Map[String,String] = stockAdd + goldmanStock

val goldmanStockGS:Tuple2[String,String] = ("GS","Goldman Sacs")
val updateStocks:Map[String,String] = Map(socStock,goldmanStockGS)
val mapPlusMap:Map[String,String] =   stocks++updateStocks
// removed directly with one tuple
val socRemovedMap:Map[String,String] = mapPlusMap -  ("SOC")
val emptyStock:Map[String,String] = Map.empty[String,String]

println(
  s"""
    |${stocks}
    |${stocks("BX")}
    |${stockAdd}
    |${stockWrongAdd}
    |${stockWrongAdd("SOC")}
    |${mapPlusMap}
    |${socRemovedMap}
    |${emptyStock}
  """.stripMargin)

}
