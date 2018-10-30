val fruits = Traversable("apple", "banana", "orange")


for (f <- fruits) println(f)
for (f <- fruits) println(f.toUpperCase)

for (f <- fruits) {
  val s = f.toUpperCase
  println(s)
}

var arraysFruit = fruits.toArray
for (index <- 0 until arraysFruit.size) println(s"$index - ${arraysFruit(index)}")

for ((item, index) <- arraysFruit.zipWithIndex) println(s"$index - ${item}")

arraysFruit.zipWithIndex


for ((elem, count) <- arraysFruit.zip(Stream from 1)) {
  println(s"element $count is $elem")
}

println("-----------------------------")

val arrayFruitsLowerCase = Array("apple", "banana", "orange")
val arrayFruitsUpperCase: Array[String] = (for (f <- fruits) yield f.toUpperCase)(collection.breakOut)




