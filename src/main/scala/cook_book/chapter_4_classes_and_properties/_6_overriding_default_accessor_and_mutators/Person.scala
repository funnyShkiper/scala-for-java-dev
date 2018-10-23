package cook_book.chapter_4_classes_and_properties._6_overriding_default_accessor_and_mutators

class Person(private var _name: String) {

  def name = _name
  def name_=(aName: String): Unit = {
    _name = aName
  }

}

object Start extends App {

  val person = new Person("Max")
  println(person.name)

  person.name = "Ann"
  println(person.name)

}
