package cook_book.chapter_4_classes_and_properties._13_defining_properties_in_the_abstract_base_class

object Start extends App {

  val dog = new Dog("Fido")
  val cat = new Cat("Morris")

  dog.sayHello()
  cat.sayHello()

  println(dog)
  println(cat)

  cat.age = 10
  println(cat)

}

abstract class Pet(name: String) {
  val greeting: String
  var age: Int
  def sayHello() {println(greeting)}

  override def toString: String = s"I say $greeting, and I'm $age"
}

class Dog(name: String) extends Pet(name) {
  override val greeting: String = "Woof"
  override var age: Int = 2
}

class Cat(name: String) extends Pet(name) {
  override val greeting: String = "Meow"
  override var age: Int = 5
}


