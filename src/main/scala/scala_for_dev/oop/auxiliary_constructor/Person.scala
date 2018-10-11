package scala_for_dev.oop.auxiliary_constructor

class Person(var name: String, var age: Int) {

  def this(age: Int) {
    this(Person.DEFAULT_NAME, age)
  }

  def this(name: String) {
    this(name, Person.DEFAULT_AGE)
  }

  def this() {
    this(Person.DEFAULT_NAME, Person.DEFAULT_AGE)
  }
}

object Person {
  val DEFAULT_NAME: String = "Mike"
  val DEFAULT_AGE: Int = 45
}
