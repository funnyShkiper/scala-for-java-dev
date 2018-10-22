trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case object Woodpecker extends Animal

def determineType(x: Animal): String = x match {
  case Dog(moniker) => s"Got a Dog, name is $moniker"
  case _: Cat => "Got a Cat (ignoring a name)"
  case Woodpecker => "That was woodpecker"
  case _ => "That was something else"
}

println(determineType(new Dog("Rocky")))
println(determineType(new Cat("Rusty the cat")))
println(determineType(Woodpecker))