package cook_book.chapter_4_classes_and_properties._13_defining_properties_in_the_abstract_base_class


object StartWithTrait extends App {

  val dog = new DogTrait
  println(dog)

}


trait Animal {
  val greeting: Option[String]
  var age: Option[Int] = None

  override def toString: String = s"I'm say $greeting, and I'm $age years old."
}

class DogTrait extends Animal {
  override val greeting: Option[String] = Some("Woof")
  age = Some(2)
}

class CatTrait extends Animal {
  override val greeting: Option[String] = Some("Moew")
  age = Some(5)
}
