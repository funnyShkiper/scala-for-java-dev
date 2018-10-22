val array = Array("apple", "banana", "orange")

for (item <- array) println(item)

for (item <- array) {
  val s = item.toUpperCase
  println(s)
}

val newArray = for (item <- array) yield item.toUpperCase

// Использование индексов
for (index <- 0 until array.length) {
  println(s"$index - ${array(index)}")
}

for ((item, index) <- array.zipWithIndex) {
  println(s"$index - $item")
}

// Generators and guards
for (i <- 0 to 5) println(i)

for (i <- 0 to 10 if i % 2 == 0) println(i)




// Looping over a map
val namesMap = Map("fname" -> "Robert", "lname" -> "Goren")
for ((k, v) <- namesMap) println(k + " - " + v)

for (k <- namesMap.keys) println(s"$k - ${namesMap(k)}")

for (v <- namesMap.values) println(s"$v")




