import scala.collection.mutable.ArrayBuffer

// Массив фиксированной длины
val numbers = new Array[Int](10)
val strings = new Array[String](10)
val array = Array("Hello", "world")
array(0) = "Goodbye"
array

// Массив переменной длины
val b = new ArrayBuffer[Int]()
b += 1
printArray(b)
b += (1, 2, 3, 4, 5, 6)
printArray(b)
b.trimEnd(5)
printArray(b)
def printArray(arrayBuffer: ArrayBuffer[Int]): Unit = {
  for (item <- arrayBuffer) println(item)
}

val testArray = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// Обход массима
for (i <- 0 until testArray.length) {
  println(testArray(i))
}

// Обход массива с шагом 2
for (i <- 0 until (testArray.length, 2)) {
  println(testArray(i))
}

// Обход массива в обратном порядке
for (i <- (0 until testArray.length).reverse) {
  println(testArray(i))
}




