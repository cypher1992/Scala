package com.refactortest.basicstest.fourpillar.abstractiontest
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import com.refresher.basics.fourpillar.abstraction._

class StockABSTest extends AnyFlatSpec with Matchers{

  "Refresher: appl is Instance of Stock" should "return true" in {
    val appl:Stock = new Stock("APPL","NYSE")
    assert(appl.isInstanceOf[Stock])
  }

  "Refresher: appl is Instance of SecurityAbstraction" should "return true" in {
    //upcast when inheritence of stock takes a form of Security
    val appl:SecurityAbstraction = new Stock("APPL","NYSE")
    assert(appl.isInstanceOf[SecurityAbstraction])
  }

  "Refresher: stock.Info equals Expected" should "return Exchange NYSE AND Ticker APPL" in {
    //upcast when inheritence of stock takes a form of Security
    // when in upcast, you can only use function of the super class
    // cant access inStockClass function
    val appl:SecurityAbstraction = new Stock("APPL","NYSE")
    val actual:String = appl.info()
    val expected:String = """
                            |Exchange: NYSE
                            |Ticker: APPL
                            |""".stripMargin
    assert(actual == expected)
  }

  "Refresher: stock.Info equals Expected" should "return STOCKCLS" in {
    //Now inStockCLS is visible
    val appl:Stock = new Stock("APPL","NYSE")
    val actual:String = appl.inStockCLS()
    val expected:String = "STOCKCLS"
    assert(actual == expected)
  }

}
