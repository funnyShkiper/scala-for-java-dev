val numbers = List(15, 10, 5, 8, 20, 12)

numbers.groupBy(_ > 10)

numbers.partition(_ > 10)

numbers.partition(_ < 10)

numbers.span(_ < 20)

numbers.splitAt(2)



val (a, b) = numbers.partition(_ < 10)
(a, b)._1
(a, b)._2


numbers.sliding(2).toList
numbers.sliding(2, 2).toList
numbers.sliding(2, 3).toList

val listOfTuple2s = List((1,2), ('a', 'b'))
listOfTuple2s.unzip


val woman = List("Kim", "Julia")
val man = List("Al", "Terry")

val couple = woman zip man
couple(0)._1
couple(0)._2

couple(1)._1
couple(1)._2


