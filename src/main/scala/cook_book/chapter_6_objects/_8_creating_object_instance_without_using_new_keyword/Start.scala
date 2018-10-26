package cook_book.chapter_6_objects._8_creating_object_instance_without_using_new_keyword

object Start extends App {
  val person = Person("Max")
  println(person)

  val person_2 = Person("Max", 24)
  println(person_2)

  val personCaseClass = PersonCaseClass("Max")
  println(personCaseClass)

}


class Person {
  var name: String = _
  var age: Int = 0

  override def toString: String = s"Person($name, $age)"
}

object Person {
  def apply(name: String): Person = {
    val p = new Person
    p.name = name
    p
  }

  def apply(name: String, age: Int): Person = {
    val person = new Person
    person.name = name
    person.age = age
    person
  }
}

case class PersonCaseClass(var name: String, var age: Int)
object PersonCaseClass {
  def apply() = new PersonCaseClass("<no name>", 0)
  def apply(name: String) = new PersonCaseClass(name, 0)
  def apply(age: Int) = new PersonCaseClass("<no name>", age)
  def apply(name: String, age: Int) = new PersonCaseClass(name, age)
}

