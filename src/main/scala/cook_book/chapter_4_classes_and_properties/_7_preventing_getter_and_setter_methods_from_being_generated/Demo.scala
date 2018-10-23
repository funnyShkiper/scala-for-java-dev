package cook_book.chapter_4_classes_and_properties._7_preventing_getter_and_setter_methods_from_being_generated

object Demo extends App {

  val stock: Stock = new Stock

  stock.dalayedPrice

  // Error
  // stock.currentPrice

  val s1 = new Stock
  s1.setPrice(20)

  val s2 = new Stock
  s2.setPrice(100)

  println(s1.isHigher(s2))
  println(s2.isHigher(s1))

}



class Stock {

  // getter and setter method are generated
  var dalayedPrice: Double = _

  // keep this field hidden from other classes
  private var currentPrice: Double = _


  // Если private[this] будет ошибка компиляции при обращениик that.price
  private var price: Double = _
  def setPrice(p: Double){ price = p }
  def isHigher(that: Stock): Boolean = { this.price > that.price }

}
