package cook_book.chapter_10_collections._26_creating_and_using_enumerations

object Start extends App {

  import Margin._;

  var currentMargin = TOP
  if (currentMargin == TOP) println("working on Top")

  Margin.values foreach println

}

object Margin extends Enumeration {
  type Margin = Value
  val TOP, BOTTOM, LEFT, RIGHT = Value
}


