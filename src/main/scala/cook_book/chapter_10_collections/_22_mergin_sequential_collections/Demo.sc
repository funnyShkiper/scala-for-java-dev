val arrayBuffer = collection.mutable.ArrayBuffer(1, 2, 3)

arrayBuffer ++= Seq(1, 2, 3)


val a = Array(1, 2, 3, 4, 5)
val b = Array(4, 5, 6, 7, 8)
val c = a ++ b

a.intersect(b)
a.union(b)
a.union(b).distinct

a diff b
b diff a

Array.concat(a, b)

val aList = List(1, 2, 3, 4, 5)
val bList = List(4, 5, 6, 7, 8)
(aList ::: bList).distinct









