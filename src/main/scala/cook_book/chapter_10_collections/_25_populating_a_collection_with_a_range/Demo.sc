Array.range(1, 5)
List.range(0, 10)
Vector.range(0, 10, 2)


val array = (0 until 10).toArray
val list = (1 to 10 by 2).toList

val letters = ('a' to 'z').toSet
letters.size
letters.foreach(println(_))

val map = (1 to 5).map(_ * 2.0)
(1 to 5).map(e => (e, e))
(1 to 5).map(e => (e, e)).toMap






