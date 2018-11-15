var x = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
x.retain((k, v) => k > 1)
x.transform((k, v) => v.toUpperCase)

val map = Map(1 -> "a", 2 -> "b", 3 -> "c")
val filterKeyMap = map.filterKeys(_ > 2)


def only1(i: Int) = if (i == 1) true else false

map.filterKeys(only1)

map.filterKeys(Set(2, 3))

map.filter(t => t._1 > 1)

map.filter(t => t._2 == "c")

map.take(2)
map.takeWhile(t => t._1 < 3)
map.takeRight(2)


