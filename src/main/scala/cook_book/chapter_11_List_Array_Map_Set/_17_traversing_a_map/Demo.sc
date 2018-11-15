val ratings = Map(
  "Lady in the Water" -> 3.0,
  "Snakes on the Plane" -> 4.0,
  "You, Me and Dupree" -> 3.5
)

for ((k, v) <- ratings) println(s"key: $k, value: $v")

ratings.foreach {
  case (movie, rating) => println(s"key: $movie, value: $rating")
}

ratings.foreach(x => println(s"key: ${x._1}, value: ${x._2}"))

ratings.keys.foreach(movie => println(s"key: $movie, value: ${ratings(movie)}"))


ratings.keys.foreach(println)
ratings.values.foreach(println)

import scala.collection.mutable.{Map => MMap}
var x = MMap(1 -> "a", 2 -> "b")
x.mapValues(_.toUpperCase)

val map = Map(1 -> 10, 2 -> 20, 3 -> 30)
map.transform((k, v) => k + v)