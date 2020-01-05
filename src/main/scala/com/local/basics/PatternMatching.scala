package com.local.basics

import scala.collection.mutable.ListBuffer


object PatternMatching extends App{

  case class Company(location: Location, name:String,typeOfBusiness:String)
  case class Location(address:String,street:String,city:String,zipCode:Int)


  val location = Location("345 Park Ave 37th Floor Unit 3701","51st Street", "New York", 10037)
  val location1 = Location("245 Park Ave 5th Floor Unit 522","42nd Street", "New York", 10037)
  val location2 = Location("501 Lexington Ave 53nd Floor Unit 5201","52nd Street", "New York", 10037)
  val location3 = Location("530 5Th Ave 11th Floor Unit 1101","44th Street", "New York", 10036)
  val location4 = Location("26 Broadway Suite 933","Broadway", "New York", 10004)
  val location5 = Location("515 Madison Avenue 34th Flr","Madison Av", "New York", 10022)
  val location6 = Location("399 Park Avenue, 22nd Floor","52nd Street","New York", 10022)
  val location7 = Location("55 Fifth Avenue, 15th Floor","12th Street","New York", 10003)
  val location8 = Location("3 Park Ave 37th Floor", "34th Street", "New York", 10016)

  val blackstone = Company(location,"Blackstone","Private Equity")
  val societeGeneral = Company(location1,"Societe General","Investment Banking")
  val apaxPartner = Company( location2,"Apax Partner", "Private Equity")
  val lenoxAdvisors = Company(location3,"Lenox Advisors", "Insurance/Wealth Management")
  val chelseaTech= Company(location4,"Chelsea Technology","Managerial Service Provider")
  val paragonOutcome = Company(location5, "Paragon Outcome","Hedge Fund")
  val polygon = Company(location6, "Polygon Global Partners LP","Hedge Fund")
  val timeEquities = Company(location7,"Time Equities Inc.", "Real Estate Development")
  val blueFinTrading = Company(location8,"Bluefin Trading LLC", "Proprietary Trading")

  val companyList:List[Company] = List(blackstone,societeGeneral,apaxPartner,lenoxAdvisors,chelseaTech,paragonOutcome
    ,polygon,timeEquities,blueFinTrading)

  def printCompanyDetails(company:Company):Unit = {
   println(s"Company Name: ${company.name}\nBusiness Type: ${company.typeOfBusiness}\nLocation: ${company.location}\n\n\n" )
  }

  for(company <- companyList ){
    printCompanyDetails(company)
  }

  for(company <- companyList if company.typeOfBusiness == "Private Equity"){
    printCompanyDetails(company)
  }

  def filterBusinessType(companyList:List[Company],businessType:String): List[Company] ={

    var list = new ListBuffer[Company]()

    for{company <- companyList}{
      company.typeOfBusiness match{
        case "Private Equity" | "Hedge Fund" => list += company
        case  _ =>
      }
    }
    val filterList =list.toList
    filterList

  }


  val hedgeFundFilter = filterBusinessType(companyList,"Hedge Fund")

  println(hedgeFundFilter)

}
