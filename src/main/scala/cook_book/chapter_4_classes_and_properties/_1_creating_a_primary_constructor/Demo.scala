package cook_book.chapter_4_classes_and_properties._1_creating_a_primary_constructor

object Demo extends App {
  val person: Person = new Person("Max", "Moon")

  person.printFullName
  person.printHome

  println(person.firstName)
  println(person.lastName)
  println(person.age)

  person.age = 24

  println(person.age)

}

class Person(var firstName: String, var lastName: String) {

  private val HOME = System.getProperty("user.home")
  var age = 0

  override def toString: String = s"$firstName $lastName is $age years old"
  def printHome { println(s"HOME = $HOME")}
  def printFullName {println(this)}

  printHome
  printFullName

}
