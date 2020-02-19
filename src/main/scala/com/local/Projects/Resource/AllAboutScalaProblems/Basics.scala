package com.local.Projects.Resource.AllAboutScalaProblems

class Basics {


  def jsonNotation(mapStr:Map[String,String]):String={

    def stringAppend(ms:Map[String,String]=mapStr,append:String="{\n"):String={

      ms.size match {
        case 0 => append.concat("\n}")
        case 1 => stringAppend(ms.tail,append.concat(s"${ms.head._1}:${ms.head._2}"))
        case _ => stringAppend(ms.tail,append.concat(s"${ms.head._1}:${ms.head._2},\n"))
      }
    }

    stringAppend()
  }

  def findMaxMin(seq:Seq[Int]):Map[String,Int] ={

    def maxMin(s:Seq[Int]=seq,tup:Tuple2[Int,Int]=(0,0)):Tuple2[Int,Int] ={
     s match {
       case Nil => tup
       case a if(s.head > s.tail.head && tup == (0,0)) => maxMin(s.tail.tail,(s.tail.head,s.head))
       case b if(s.head < s.tail.head && tup == (0,0)) => maxMin(s.tail.tail,(s.head,s.tail.head))
       case c if(s.head > tup._2) =>  maxMin(s.tail,(tup._1,s.head))
       case d if(s.head < tup._1) =>   maxMin(seq.tail,(s.head,tup._2))
     }
    }

    seq.size match {
      case 0 => throw new java.util.NoSuchElementException
      case 1 => Map("Min" -> seq.head, "Max" -> seq.head)
      case _ => Map("Min" -> maxMin()._1, "Max" -> maxMin()._2)
    }
  }

}