package com.com.projects.financial.Connection

import org.patriques.AlphaVantageConnector

class AlphaVanConnector {

  /*
  Documentation:
  Alpha Vantage API Documentation
  GITHUBURL: https://github.com/patriques82/alphavantage4j
  APIURL:    https://www.alphavantage.co/documentation/#fx-intraday

  OBJECTIVE: Create a Trait -> Factory -> Call different functions
  */

  private val keyTimeOut:Tuple2[String,Int]= ("ZPDYF5J450GF1JHD",3000)
  private val alphaConn:AlphaVantageConnector = new AlphaVantageConnector(keyTimeOut._1,keyTimeOut._2)

  def getAlphaVantageConnector: AlphaVantageConnector ={
    this.alphaConn
  }

}
