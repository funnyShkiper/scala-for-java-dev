package cook_book.chapter_8_traits._3_using_a_trait_like_an_abstract_classes

object Demo extends App {



}


trait Pet {
  def speak { println("Yo") }
  def comeToMaster
}

class Dog extends Pet {
  override def comeToMaster: Unit = { ("I'm coming!") }
}

class cat extends Pet {
  override def comeToMaster: Unit = { ("Meow") }

  override def speak: Unit = { ("That's not gonna happen.") }
}

abstract class FlyingPet extends Pet {
  def fly { ("I'm flying!") }
}

