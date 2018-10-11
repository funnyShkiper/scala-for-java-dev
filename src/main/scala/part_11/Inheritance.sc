import java.util

class DiscountCustomer(name: String, address: String) extends Customer(name, address) {
  override def total = super.total * .9
}

object DiscountCustomer{
  def main(args: Array[String]): Unit = {
    val joe = new DiscountCustomer("Joe", "128 Bullpen Street")
    joe.add(new Item {
      def price = 2.5
    })
    joe.add(new Item {
      def price = 2.5
    })
    println(s"Total: ${joe.total}")
  }
}

class Customer(val name: String, val address: String) {
  private val basket: ShoppingBasket = new ShoppingBasket

  def add(item: Item): Unit = {
    basket.add(item)
  }

  def total: Double = {
      basket.value
  }
}

class ShoppingBasket() {

  private val list: java.util.ArrayList[Item] = new util.ArrayList[Item]()
  var value: Double = 0.0

  def add(item: Item): Unit = {
    list.add(item)
  }

}

trait Item {

}