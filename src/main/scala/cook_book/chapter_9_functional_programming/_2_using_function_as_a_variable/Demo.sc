val double = (i: Int) => i * 2

val list = List.range(1, 20)
list.map(double)



// implicit approach
val add = (x: Int, y: Int) => x + y

// explicit approach
val add_0: (Int, Int) => Int = (x, y) => x + y

add(2, 5)
add_0(6, 7)

val addThenDouble: (Int, Int) => Int = (x, y) => {
  val a = x + y
  a * 2
}

addThenDouble(2, 3)



val c = scala.math.cos(_)
c(0)

val pow = scala.math.pow(_, _)
pow(2, 3)
pow(scala.math.E, 2)
