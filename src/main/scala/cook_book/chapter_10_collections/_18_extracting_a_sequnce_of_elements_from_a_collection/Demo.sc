val array = (1 to 10).toArray

// Удаление первых трех элементов
array.drop(3)

// Удаление элементов меньших 6
array.dropWhile(_<6)

// Удаление 4 элементов с конца
array.dropRight(4)

// Получение первых трех элементов
array.take(3)

// Получение элемнтов с начала меньших 5
array.takeWhile(_<5)

// Получение последних 3-х элементов
array.takeRight(3)

val peeps = List("John", "Mary", "Jane", "Fred")

// Получение элементов из интервала (1-3)
peeps.slice(1, 3)





