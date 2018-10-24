package cook_book.chapter_4_classes_and_properties._10_handling_constructor_parameters_when_extending_a_class

object Start extends App {

  val person = new Person("Max", Some(Address("Moscow", "Red Square")))
  val person_1 = new Person("Max", None)
  println(person)
  println(person_1)

  val employee = new Employee("Max", Some(Address("Moscow", "Red Square")), 24)
  println(employee)
}

class Person(name: String, address: Option[Address]) {
  override def toString: String = if (address.isEmpty) s"Persons:{name:$name}" else s"Person:{name:$name, address:$address}"
}

class Employee(name: String, address: Option[Address], var age: Int) extends Person(name, address) {
  override def toString: String = s"Employee:{name:$name, address: $address, age: $age}"
}

case class Address(city: String, state: String) {
  override def toString: String = s"Address:{city:$city, state:$state}"
}
