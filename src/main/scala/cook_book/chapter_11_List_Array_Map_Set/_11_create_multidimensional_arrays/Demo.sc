val rows = 2
val cols = 3

val array = Array.ofDim[String](rows, cols)

array(0)(0) = "a"
array(0)(1) = "b"
array(0)(2) = "c"

array(1)(0) = "d"
array(1)(1) = "e"
array(1)(2) = "f"

for {
  i <- 0 until rows
  j <- 0 until cols
} println(array(i)(j))


val x, y, z = 10
val a = Array.ofDim[Int](x, y, z)


for {
  i <- 0 until x
  j <- 0 until y
  k <- 0 until z
} println(s"($i)($j)($k) - ${a( i)(j)(k)}")

