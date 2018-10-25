package cook_book.chapter_5_methods._4_using_parameter_names_when_calling_a_method

object Start extends App {

  val pizza = new Pizza
  pizza.update(crustSize = 20, crustType = "Thin")
  println(pizza)

  pizza.update(crustType = "Thin", crustSize = 25)
  println(pizza)
}


class Pizza {
  var crustSize = 17
  var crustType = "Thin"
  def update(crustSize: Int, crustType: String) {
    this.crustSize = crustSize
    this.crustType = crustType
  }

  override def toString: String = s"Pizza($crustSize, $crustType)"
}
