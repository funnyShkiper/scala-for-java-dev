val grades = Map("Al" -> 80, "Kim" -> 95, "Teri" -> 85, "Julia" -> 90)

grades.max

grades.keysIterator.max

grades.keysIterator.reduceLeft((x, y) => if (x.length > y.length) x else y)

grades.valuesIterator.reduceLeft(_ max _)



