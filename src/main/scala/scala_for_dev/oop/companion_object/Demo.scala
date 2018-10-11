package scala_for_dev.oop.companion_object

class Person(val name: String, val age: Int) {
  override def toString: String = s"Person:{name:${name}, age:${age}}"
}

object Person {
  val MAX_AGE = 256
  val MAX_NAME_LENGTH = 1024
  def apply(name: String, age: Int) = new Person(name, age)
}

object Demo {
  def main(args: Array[String]): Unit = {
    val person0 = new Person("Mike", 45)
    println(person0)
    val person1 = Person.apply("Mike", 45)
    println(person1)
    val person2 = Person("Mike", 45)
    println(person2)
  }
}
