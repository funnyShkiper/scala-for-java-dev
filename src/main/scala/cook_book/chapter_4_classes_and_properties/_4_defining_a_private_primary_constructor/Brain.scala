package cook_book.chapter_4_classes_and_properties._4_defining_a_private_primary_constructor

// Создание singleton объекта
class Brain private {
  override def toString: String = "This is the brain."
}

object Brain {
  val brain = new Brain
  def getInstance = brain
}

object Start extends App {
  val brain = Brain.getInstance
  println(brain)
}


