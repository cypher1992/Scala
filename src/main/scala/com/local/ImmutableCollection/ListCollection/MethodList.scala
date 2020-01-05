package com.local.ImmutableCollection.ListCollection

trait MethodList[S] {

  def firstAppendList(component:S,list:List[S]):List[S] ={
    component +: list
  }

  def lastAppendList(component:S,list:List[S]):List[S] ={
    list :+ component
  }

  def frontAddList(list:List[S],moreList:List[S]):List[S] ={
    moreList:::list
  }

  def lastAddList(list:List[S],moreList:List[S]):List[S] ={
    list:::moreList
  }

  def queryList(component:S,list:List[S]):Boolean={

    val ifExist = for{index <- list if index == component}
      yield true

    val sizeGreaterThan1forTrue:Boolean = if(ifExist.size >0) true else false

 /*   var index = 0
    var store = false

    for(index <- index to list.length-1){
      if(component == list(index)){
        store = true
      }
    }

    val ifExist = store*/

    //ifExist
    sizeGreaterThan1forTrue
    }





}
