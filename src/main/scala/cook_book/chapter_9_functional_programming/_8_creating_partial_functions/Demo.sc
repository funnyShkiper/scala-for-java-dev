val divide = new PartialFunction[Int, Int] {
  def apply(x: Int) = 42 / x
  def isDefinedAt(x: Int): Boolean = x != 0
}

if(divide.isDefinedAt(0)) divide(0)
if(divide.isDefinedAt(2)) divide(2)


val divide_2: PartialFunction[Int, Int] = {
  case d: Int if d != 0 => 42 / d
}

divide_2.isDefinedAt(0)
divide_2.isDefinedAt(1)
divide_2(2)

val convert1to5 = new PartialFunction[Int, String] {
  val nums = Array("one", "two", "three", "four", "five")
  def apply(i: Int) = nums(i - 1)
  def isDefinedAt(i: Int): Boolean = i > 0 && i < 6
}

val convert6To10 = new PartialFunction[Int, String] {
  val nums = Array("six", "seven", "eight", "nine", "ten")
  def apply(i: Int) = nums(i - 6)
  def isDefinedAt(i: Int): Boolean = i > 5 && i < 11
}

convert1to5(1)
convert6To10(6)

val convert1To10 = convert1to5 orElse convert6To10

convert1To10(9)
convert1To10(3)


val divideDouble = new PartialFunction[Double, Double] {
  override def apply(v1: Double): Double = 42 / v1

  override def isDefinedAt(x: Double): Boolean = x != 0
}

List(0.0, 1, 2, 3, 4, 5).collect(divideDouble)

List(43, "cat").collect({case i: Int => i + 1})
