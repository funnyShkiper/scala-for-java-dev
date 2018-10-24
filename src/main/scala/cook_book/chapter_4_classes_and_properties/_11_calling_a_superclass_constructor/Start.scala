package cook_book.chapter_4_classes_and_properties._11_calling_a_superclass_constructor

object Start extends App {

}

case class Address(city: String, state: String)
case class Role(role: String)

class Person(var name: String, var address: Address) {
  def this(name: String) {
    this(name, null)
    address = null
  }

  override def toString: String = if (address == null) name else s"$name @ $address"
}

class Employee(name: String, role: Role, address: Address) extends Person(name, address) {
  def this(name: String) {
    this(name, null, null)
  }

  def this(name: String, role: Role) {
    this(name, role, null)
  }

  def this(name: String, address: Address) {
    this(name, null, address)
  }
}

class Animal(var name: String, var age: Int) {
  def this(name: String) {
    this(name, 0)
  }

  override def toString: String = s"$name is $age years old"
}

/*class Dog(name: String) extends Animal(name) {

}*/

class Dog(name: String) extends Animal(name, 0) {

}

