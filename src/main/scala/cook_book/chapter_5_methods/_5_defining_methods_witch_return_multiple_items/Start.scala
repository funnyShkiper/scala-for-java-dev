package cook_book.chapter_5_methods._5_defining_methods_witch_return_multiple_items

object Start extends App {
  val demoMethodClass = new DemoMethodClass
  println(demoMethodClass.getStockInfo)

  val (symbol, currentPrice, bigPrice) = demoMethodClass.getStockInfo

  val result = demoMethodClass.getStockInfo
  println(result._1)
  println(result._2)
  println(result._3)

}

class DemoMethodClass {
  def getStockInfo = {
    ("NEXT", 100.00, 101.00)
  }
}



