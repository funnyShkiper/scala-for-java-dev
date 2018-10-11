package scala_for_dev.oop.constructor_primary

class Person(val age: Int, val name: String) {

  override def toString: String = s"Person:{age:${age}, name:${name}}"
}
