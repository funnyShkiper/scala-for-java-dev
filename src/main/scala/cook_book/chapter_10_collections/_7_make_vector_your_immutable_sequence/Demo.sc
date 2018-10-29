val vector = Vector("a", "b", "c")

vector(0)
vector(1)
vector(2)

val vectorInt = Vector(1, 2, 3)
val newVector = vectorInt ++ Vector(4, 5)

vectorInt.eq(newVector)

val updateVector = newVector.updated(0, 10)
updateVector.take(3)
updateVector.filter(_ >= 4)

var varVector = Vector(1, 2, 3, 4, 5, 6)
varVector = varVector ++ Vector(12, 10, 11)







