var scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8, "Max" -> 8)
val mutableScores = scala.collection.mutable.HashMap("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8, "Max" -> 8)

println(scores("Bob"))
if (scores.contains("Bob")) scores("Bob") else 0
if (scores.contains("Bob1")) scores("Bob") else 0
val bobsScore = scores.getOrElse("Bob", 0)

mutableScores += ("Max" -> 24)
mutableScores -= ("Alice")

scores = scores - "Alice"



for ((k, v) <- scores) {
  println(k + " " + v)
}

for (k <- scores.keySet) {
  println("Key - " + k)
}

for (v <- scores.values) {
  println("Value - " + v)
}

for ((k, v) <- scores) yield (v, k)

val sortedMap = scala.collection.immutable.SortedMap("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8, "Ann" -> 8)
for ((k, v) <- sortedMap) {
  println(k + " - " + v)
}


"New York".partition(_.isUpper)
"New York".partition(_.isLetter)


val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)

for ((s, n) <- pairs) println(s * n)

pairs.toMap