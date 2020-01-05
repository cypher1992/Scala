package com.local.TraitTraining.ExtMultiTraits

trait SecurityConversion [S]{

  /*
  URL: http://allaboutscala.com/tutorials/chapter-5-traits/scala-extend-multiple-traits/
  GOAL: How to create traits with type parameters and show how to have a class extend
  multiple traits by making use of the with keyword.

  */
  def convertSecurity(security:S,percentageVotingRight:Double,identifier:String):S

}
