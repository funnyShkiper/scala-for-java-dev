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

