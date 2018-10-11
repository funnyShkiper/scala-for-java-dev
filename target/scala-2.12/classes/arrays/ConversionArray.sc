import scala.collection.mutable.ArrayBuffer

val a = Array(2, 3, 5, 7, 11, 14, 16)
val result = for (elem <- a) yield 2 * elem

val result_1 = for (elem <- a if elem % 2 == 0) yield 2 * elem

// Альтернативный вариант
val result_2 = a.filter(_ % 2 == 0).map(_ * 2)

// Суммирование элементов массива
val sum = a.sum

// Сортировка по возрастанию
val a_sort_2 = a.sortWith(_ < _)
// Сортировка по убыванию
val a_sort_1 = a.sortWith(_ > _)

// Преобразование массива в строку с разделителями
val string = a.mkString(" and ")
val string_1 = a.mkString("<", ",", ">")
val string_2 = a.toString


// МАТРИЦЫ
// Матрица: 3 строки, 4 столбца
val matrix = Array.ofDim[Double](3, 4)
matrix(0)(0)

val triangle = new Array[Array[Int]](10)
for (i <- 0 until triangle.length) {
  triangle(i) = new Array[Int](i + 1)
}


// УПРАЖНЕНИЯ
// 1.
def generateArray(maxValue: Int): Array[Int] = {
  var array = new Array[Int](maxValue)
  array = (for (elem <- 0 until maxValue) yield elem.toInt)(collection.breakOut)
  array
}
val a_1: Array[Int] = generateArray(5)

// 2. Array(1, 2, 3, 4, 5) to Array(2,1,4,3,5)
def swapArray(array: Array[Int]): Array[Int] = {
  for (i <- 1 until array.length - 1 by 2) {
    val tmp = array(i)
    array(i) = array(i - 1)
    array(i - 1) = tmp
  }
  array
}

val array_2 = Array(1, 2, 3, 4, 5)
val array_2_1 = swapArray(array_2)

// 3.
val array_3 = for (elem <- array_2) yield elem

























