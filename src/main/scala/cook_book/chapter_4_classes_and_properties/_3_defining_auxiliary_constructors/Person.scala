package cook_book.chapter_4_classes_and_properties._3_defining_auxiliary_constructors

case class Person(name: String, age: Int) {
  override def toString: String = s"Person:{$name, $age}"
}

object Person {
  def apply() = new Person("<no name>", 0)
  def apply(name: String) = new Person(name, 0)
}

object Start extends App {

  val person: Person = Person("Max", 24)
  val person_1: Person = Person()
  val person_2: Person = Person("Max")

  println(person)
  println(person_1)
  println(person_2)
}
