val array = Array(12, 6, 15, 20, 9)
array.reduce(_ + _)
array.reduceRight(_ + _)
array.reduceLeft(_ + _)

array.reduceLeft((x, y) => x + y)

array.reduceLeft(_ * _)

array.reduceLeft(_ min _)
array.reduceLeft(_ max _)

var findMax = (x: Int, y: Int) => {
  Thread.sleep(10)
  val winner = x max y
  //println(s"compared $x to $y, $winner was larger")
  winner
}

array.reduceLeft(findMax)
array.reduceRight(findMax)
array.reduce(findMax)

val peeps = Vector("al", "hannah", "emily", "christina", "aleka")
peeps.reduceLeft((x, y) => if (x.length > y.length) x else y)
peeps.reduceLeft((x, y) => if (x.length < y.length) x else y)


val numbers = Array(1, 2, 3)
numbers.reduceLeft(_ + _)
numbers.fold(20)(_ + _)
numbers.fold(100)(_ + _)


val divide = (x: Double, y: Double) => {
  val result = x / y
  println(s"dividing $x by $y to yield $result")
  result
}

val doubleNumbers = Array(1.0, 2.0, 3.0)
doubleNumbers.reduce(divide)
doubleNumbers.reduceLeft(divide)
doubleNumbers.reduceRight(divide)

val a = Array.range(0, 50)
a.par.reduce(findMax)
