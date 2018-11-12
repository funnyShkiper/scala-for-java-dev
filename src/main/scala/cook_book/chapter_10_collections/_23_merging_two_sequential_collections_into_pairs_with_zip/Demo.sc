val women = List("Wilma", "Betty")
val men = List("Fred", "Barney")

val couples = women zip men
couples.foreach(println(_))

val map = couples.toMap
for ((k, v) <- map) println(s"$k -> $v")


val (a, b) = couples.unzip
