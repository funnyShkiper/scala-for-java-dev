val listDouble = List(0, 1.0, 33D, 35L)
val listNumber = List[Number](1, 2.0, 33D, 35L)
val listAnyVal = List[AnyVal](1, 2.0, 33D, 35L)

trait Animal
trait FurryAnimal extends Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal

val array = Array(Dog("Rax"), Cat("Tom"))
val arrayAnimal = Array[Animal](Dog("Rax"), Cat("Tom"))

class AnimalKingdom {
  def animals = Array[Animal](Dog("Rax"), Cat("Tom"))
}

val animalKingdom = new AnimalKingdom()
animalKingdom.animals
