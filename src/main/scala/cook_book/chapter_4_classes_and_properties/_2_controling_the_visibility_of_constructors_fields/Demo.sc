class Person(var name: String, var age: Int)

val p: Person = new Person("Max", 24)
p.age
p.name

class Human(val name: String)
val h = new Human(name = "Max")
h.name
// Error
// h.name = "Name"

class Person_1(name: String)
val p_1 = new Person_1("Max")

// Error
// p_1.name

class Person_2(private var name: String) {
  def getName: String =  name
}

val person_2: Person_2 = new Person_2("Max")
person_2.getName
// Error
// person_2.name




