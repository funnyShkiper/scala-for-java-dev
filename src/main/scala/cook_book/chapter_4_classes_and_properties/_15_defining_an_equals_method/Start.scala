package cook_book.chapter_4_classes_and_properties._15_defining_an_equals_method

object Start extends App {

  val person_1 = new Person("Max", 24)
  val person_2 = new Person("Max", 24)

  println(person_1 == person_2)

  val person_3 = new Person("Max", 25)
  println(person_1 == person_3)

  val person_4 = new Person("Ann", 24)
  println(person_1 == person_4)
}

class Person(name: String, age: Int) {
  def canEqual(a: Any) = a.isInstanceOf[Person]

  override def equals(obj: Any): Boolean = obj match {
    case obj: Person => obj.canEqual(this) && this.hashCode() == obj.hashCode()
    case _ => false
  }

  override def hashCode(): Int = {
    val prime = 31
    var result = 1
    result = prime * result + age
    result = prime * result + (if (name == null) 0 else name.hashCode)
    result
  }
}
