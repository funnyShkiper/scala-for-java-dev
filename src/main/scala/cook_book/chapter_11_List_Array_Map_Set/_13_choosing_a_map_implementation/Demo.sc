import scala.collection.SortedMap

val grades = SortedMap(
  "Kim" -> 90,
  "Al" -> 85,
  "Melissa" -> 95,
  "Elily" -> 91,
  "Hannah" -> 92
)


import scala.collection.mutable.LinkedHashMap
var states = LinkedHashMap("IL" -> "Illinois")
states += ("KY" -> "Kentucky")
states += ("TX" -> "Texas")


import scala.collection.mutable.ListMap
var statesListMap = ListMap("IL" -> "Illinois")
statesListMap += ("KY" -> "Kentucky")
statesListMap += ("TX" -> "Texas")



