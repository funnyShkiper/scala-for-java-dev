trait SentientBeing
trait Animal extends SentientBeing
case class Dog(name: String) extends Animal
case class Person(name: String, age: Int) extends SentientBeing

def printInfo(item: SentientBeing) = item match {
  case Dog(name) => println(s"Dog's name is $name")
  case Person(name, age) => println(s"$name age is $age")
}

printInfo(new Person("Max", 24))
printInfo(new Dog("Rax"))