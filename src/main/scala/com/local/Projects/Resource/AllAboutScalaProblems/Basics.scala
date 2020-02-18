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

}
