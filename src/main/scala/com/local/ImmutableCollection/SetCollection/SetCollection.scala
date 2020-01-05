package com.local.ImmutableCollection.SetCollection

object SetCollection extends App{

  /*
  URL: http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-set/
  OBJ: we will learn how to use Scala's Immutable Set and perform common operations such as initialization, adding elements, adding Sets, Set differences and intersection, and creating empty Set.
  INFO: As a reminder, a Set is a data
        structure that does not allow repeated elements. In Scala, a Set is represented as a trait to provide
        general set-like behaviors, and there are specialized classes, such as, a HashSet, or a TreeSet, that
        provide further optimizations.
  */

  def diff(set:Set[String],set2:Set[String]):Set[String] ={
    set &~ set2
  }

  val coffeeSet:Set[String] = Set("Vanilla Latte","Espresso","Cappuccino","Americano","Coffee-Liqueur")
  val ifAmericanoExist:Boolean = coffeeSet("Americano")
  val mochaccino:String = "Mochaccino"
  val mochaccino2:String ="Mochaccino"
  val addingCoffee:Set[String] = coffeeSet + mochaccino + mochaccino2
  val flatWhite:String = "Flat White"
  val coffeeSet2:Set[String] = Set(mochaccino,flatWhite)
  val addingCoffeeSets:Set[String] = coffeeSet ++ coffeeSet2
  val removingEspresso:Set[String] = addingCoffeeSets - "Espresso"
  val intersectionSet:Set[String] = addingCoffeeSets.intersect(coffeeSet2)
  val differenceBetweenSet:Set[String] = this.diff(coffeeSet,coffeeSet2)
  val emptySet:Set[String] = Set.empty[String]

  println(
    s"""
      |Set Initialization
      |${coffeeSet}
      |If Value Exist in Set
      |${ifAmericanoExist}
      |Value Initializtion
      |${mochaccino}
      |Value Initializtion
      |${mochaccino2}
      |Add Value to Set with Duplicates
      |${addingCoffee}
      |Value Initializtion
      |${flatWhite}
      |Set Initialization
      |${coffeeSet2}
      |Add Set to Set2
      |${addingCoffeeSets}
      |Removing Value from Set
      |${removingEspresso}
      |Interesting Values of Sets
      |${intersectionSet}
      |Difference Between Set
      |${differenceBetweenSet}
      |Empty Set
      |${emptySet}
    """.stripMargin)

}
