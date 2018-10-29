val vector = Vector(1, 2, 3)
vector.foreach((i: Int) => println(i))
vector.foreach(i => println(i))
vector.foreach(println(_))
vector.foreach(println)


def printIt(c: Char) { println(c) }

"HAL".foreach(printIt)
"HAL".foreach(printIt(_))


val map = Map("fname" -> "Tyler", "lname" -> "LeDude")
map.foreach(x => println(s"${x._1} - ${x._2}"))

map.foreach {
  case (key, value) => println(s"$key - $value")
}





