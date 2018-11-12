package cook_book.chapter_10_collections._21_extracting_unique_elements_from_sequence

object Start extends App {

  val person_1 = Person("Max", "Moon")
  val person_2 = Person("Ann", "Moon")
  val person_3 = Person("Max", "Moon")

  val persons = Array(person_1, person_2, person_3)
  persons.foreach(println(_))

  val set = persons.toSet
  println(s"Set: $set")

  val distinct = persons.distinct.foreach(println(_))
  println(s"Distinct: $distinct")

}


class Person(firstName: String, lastName: String) {
  override def toString: String = s"($firstName, $lastName)"

  def canEqual(a: Any) = a.isInstanceOf[Person]

  override def equals(obj: Any): Boolean = obj match {
    case obj: Person => obj.canEqual(this) && this.hashCode() == obj.hashCode()
    case _ => false
  }

  override def hashCode(): Int = {
    val prime = 31
    var result = 1
    result = prime * result + (if (lastName == null) 0 else lastName.hashCode)
    result = prime * result + (if (firstName == null) 0 else firstName.hashCode)
    result
  }

}

object Person {
  def apply(firstName: String, lastName: String): Person = new Person(firstName, lastName)
}
