package com.com.projects.financial

import java.util
import java.util.Map

import com.com.projects.financial.Connection.AlphaVanConnector
import org.patriques.output.AlphaVantageException
import org.patriques.output.timeseries.IntraDay
import org.patriques.input.timeseries._
import org.patriques.output.timeseries.data.StockData
import org.patriques.{AlphaVantageConnector, TimeSeries}

object AlphaVantageClient extends App{

  val avc:AlphaVanConnector = new AlphaVanConnector
  val timeSeries:TimeSeries = new TimeSeries(avc.getAlphaVantageConnector)

  try{
    val response:IntraDay = timeSeries.intraDay("SPY", Interval.FIFTEEN_MIN,OutputSize.FULL)
    val metaData = response.getMetaData()
    val uberData = response.getStockData()

    println(
      s"""
         |INFO"     ${metaData.get("1. Information")}
         |TICKER:   ${metaData.get("2. Symbol")}
         |DATASIZE: ${uberData.size}
         |INTERVAL: 15 MINS
       """.stripMargin)

    uberData.forEach(data => println(
      s"""
         |DATE: ${data.getDateTime}
         |OPEN: ${data.getOpen}
         |HIGH: ${data.getHigh}
         |LOW:  ${data.getLow}
         |CLOSE ${data.getClose}
         |VOL:
       """.stripMargin))

  }catch
   {   case e:AlphaVantageException => {
      println("Error")
    }
  }


}
