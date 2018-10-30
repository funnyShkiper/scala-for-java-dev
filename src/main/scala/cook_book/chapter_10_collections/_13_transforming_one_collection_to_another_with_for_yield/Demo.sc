val a = Array(1, 2, 3, 4, 5, 6, 7)

// create copy of the collection
val copyA = for (item <- a) yield item

val twiceA = for (item <- a) yield item * 2

val modulusA = for (item <- a) yield item % 2


val fruits = Array("apple", "banana", "lime", "orange")

val fruitsCapitalize: Array[String] = for (fruit <- fruits) yield fruit.capitalize

// convert to sequence Tuple2
val fruitsTuple2 = fruits.zipWithIndex


case class Person(name: String)
val names = Vector("Mark", "Regina", "Matt")

val friend = for (name <- names) yield Person(name)


// using guards
val fruitsTmp = for (fruit <- fruits if fruit.length < 6) yield fruit.toUpperCase

