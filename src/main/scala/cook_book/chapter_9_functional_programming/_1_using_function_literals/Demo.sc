val x = List.range(1, 20)
val evens = x.filter((i: Int) => i % 2 == 0)

val evens_1 = x.filter(_ % 2 == 0)