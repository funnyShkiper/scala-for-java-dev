import scala.collection.{SortedSet, mutable}

val sortedNumberSet = SortedSet(10, 4, 8, 2)
val sortedStringSet = SortedSet("cherry", "kiwi", "apple")

val linkedHashSet = mutable.LinkedHashSet(10, 4, 8, 2)

class Person(var name: String) extends Ordered[Person] {
  override def toString = name
  override def compare(that: Person) = {
    if (this.name == that.name) {
      0
    } else if (this.name > that.name) {
      1
    } else {
      -1
    }
  }
}
object Person {
  def apply(name: String): Person = new Person(name)
}

val aleka = Person("Aleka")
val christina = Person("Christina")
val molly = Person("Molly")
val tyler = Person("Tyler")

val s = SortedSet(aleka, christina, molly, tyler)









