package com.AlgoAndDataStructureTest.ArrayStructureTest

import com.local.AlgoWithDataStructure.Data_Structure.HashTableMutableStructure
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class HashTableTest extends AnyFlatSpec with Matchers{

  "HashTableMutableStructure: isInstanceOfHashTable" should "return true" in {
    val htms:HashTableMutableStructure[Int,String] = new HashTableMutableStructure[Int,String](20)
    val isHashTableMutableStructure:Boolean = htms.isInstanceOf[HashTableMutableStructure[Int,String]]
    assert(isHashTableMutableStructure == true)
  }

}
