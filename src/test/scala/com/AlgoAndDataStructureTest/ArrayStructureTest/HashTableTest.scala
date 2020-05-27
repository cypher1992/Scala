package com.AlgoAndDataStructureTest.ArrayStructureTest

import com.local.AlgoWithDataStructure.Data_Structure.HashTableMutableStructure
import com.local.AlgoWithDataStructure.Data_Structure.traitstructures.HashTable
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class HashTableTest extends AnyFlatSpec with Matchers{

  "HashTableMutableStructure: isInstanceOfMutableHashTable" should "return true" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val isHashTableMutableStructure:Boolean = htms.isInstanceOf[HashTableMutableStructure[Int,String]]
    assert(isHashTableMutableStructure == true)
  }

  "HashTableMutableStructure: isInstanceOfHashTable" should "return true" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val isHashTableMutableStructure:Boolean = htms.isInstanceOf[HashTable[Int,String]]
    assert(isHashTableMutableStructure == true)
  }

  "HashTableMutableStructure: getHashArray()" should "return emptyHashArray as Array[List[Tuple2[Int,String]]]" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val actual:Array[List[Tuple2[Int,String]]] = htms.getHashArray()
    val expected:Array[List[Tuple2[Int,String]]] = Array.fill(20)(List[(Int,String)]())
    assert( actual ===  expected)
  }

  "HashTableMutableStructure: hashCode(1425634)" should "return Int as 14" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val key:Int = 1425634
    val actual:Int = htms.hashCode(key)
    val expected:Int =14
    assert(actual ===  expected)
  }

  "HashTableMutableStructure: hashCode(100)" should "return Int as 0" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val key:Int = 100
    val actual:Int = htms.hashCode(key)
    val expected:Int =0
    assert(actual ===  expected)
  }

  "HashTableMutableStructure: hashCode(1000001)" should "return Int as 1" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val key:Int = 10000001
    val actual:Int = htms.hashCode(key)
    val expected:Int =1
    assert(actual ===  expected)
  }

  "HashTableMutableStructure: insert(1000001,John Wayne)" should "return hashtable" in {
    val htms: HashTableMutableStructure[Int, String] = new HashTableMutableStructure[Int, String](20)
    htms.insert(1000001,"John Wayne")
    val actual:Array[List[Tuple2[Int,String]]] = htms.getHashArray()
    val expected:Array[List[Tuple2[Int,String]]] = Array(List(), List((1000001,"John Wayne")), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List())
    assert(actual === expected)
  }

  "HashTableMutableStructure: insert(1000001,JW) act as update" should "return hashtable" in {
    val htms: HashTableMutableStructure[Int, String] = new HashTableMutableStructure[Int, String](20)
    htms.insert(1000001,"John Wayne")
    htms.insert(1000001,"JW")
    val actual:Array[List[Tuple2[Int,String]]] = htms.getHashArray()
    val expected:Array[List[Tuple2[Int,String]]] = Array(List(), List((1000001,"JW")), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List())
    assert(actual === expected)
  }

  "HashTableMutableStructure: insert(1000001,John Wayne) two times" should "return hashtable" in {
    val htms: HashTableMutableStructure[Int, String] = new HashTableMutableStructure[Int, String](20)
    htms.insert(1000001,"John Wayne")
    htms.insert(1000001,"John Wayne")
    val actual:Array[List[Tuple2[Int,String]]] = htms.getHashArray()
    val expected:Array[List[Tuple2[Int,String]]] = Array(List(), List((1000001,"John Wayne")), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List())
    assert(actual === expected)
  }

  "HashTableMutableStructure: insert(1000002,Robert Di Niro)" should "return hashtable" in {
    val htms: HashTableMutableStructure[Int, String] = new HashTableMutableStructure[Int, String](20)
    htms.insert(1000001,"John Wayne")
    htms.insert(1000002,"Robert Di Niro")
    val actual:Array[List[Tuple2[Int,String]]] = htms.getHashArray()
    val expected:Array[List[Tuple2[Int,String]]] = Array(List(), List((1000001,"John Wayne")), List((1000002,"Robert Di Niro")), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List(), List())
    assert(actual === expected)
  }

  "HashTableMutableStructure: search(1000001)" should "return JohnWayne" in {
    val htms: HashTableMutableStructure[Int, String] = new HashTableMutableStructure[Int, String](20)
    htms.insert(1000001,"John Wayne")
    val actual:Option[String] = htms.search(1000001)
    val expected:Option[String] = Some("John Wayne")
    assert(actual === expected)
  }

  "HashTableMutableStructure: search(1000002)" should "return JohnWayne" in {
    val htms: HashTableMutableStructure[Int, String] = new HashTableMutableStructure[Int, String](20)
    htms.insert(1000001,"John Wayne")
    val actual:Option[String] = htms.search(1000002)
    val expected:Option[String] = None
    assert(actual === expected)
  }

}
