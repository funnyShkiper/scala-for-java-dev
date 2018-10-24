package cook_book.chapter_4_classes_and_properties._9_setting_uninitialized_var_fields_types

object Start extends App {

  val person = new Person("Max", "123")
  person.age = 24
  person.firstName = "Maxim"
  person.lastName = "Moon"
  person.address = Some(Address("Moscow", "Red Square", "125565"))

  println(person)
}


class Person(var userName: String, var password: String) {

  var age = 0
  var firstName = ""
  var lastName = ""
  var address = None: Option[Address]

  override def toString: String = s"Person:{firstName:$firstName, lastName: $lastName, age: $age, address: $address}"
}

case class Address(city: String, state: String, zip: String) {
  override def toString: String = s"Address:{city: $city, state: $state, zip: $zip}"
}
