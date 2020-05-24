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

  "HashTableMutableStructure: hashCode(100)" should "return Int as 1" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val key:Int = 100
    val actual:Int = htms.hashCode(key)
    val expected:Int =0
    assert(actual ===  expected)
  }

  "HashTableMutableStructure: hashCode(1000000)" should "return Int as 1" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val key:Int = 10000001
    val actual:Int = htms.hashCode(key)
    val expected:Int =1
    assert(actual ===  expected)
  }



}
