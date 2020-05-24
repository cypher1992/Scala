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

}
