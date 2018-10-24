package cook_book.chapter_4_classes_and_properties._14_generating_boilerplate_code_with_case_classes

object Start extends App {

  val person = Person("Max", "Relation")
  println(person)

}


case class Person(name: String, relation: String)



