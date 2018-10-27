package cook_book.chapter_8_traits._2_using_concrete_and_abstract_fields_in_trait

object Demo extends App {

}

trait PizzaTrait {
  var numToppings: Int      // abstract
  var size = 14             // concrete
  val maxNumToppings = 10   // concrete
}


class Pizza extends PizzaTrait {
  override var numToppings: Int = 0
  size = 16
}



