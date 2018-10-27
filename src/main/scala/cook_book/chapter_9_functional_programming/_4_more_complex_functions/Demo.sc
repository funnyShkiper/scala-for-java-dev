def exec(callback: Int => Unit): Unit = {
  callback(1)
}


val plusOne = (i: Int) => { println(i + 1) }
val plusTen = (i: Int) => { println(i + 10) }

exec(plusOne)
exec(plusTen)


def executeFunction(f: (String) => Int): Unit = {
  println(f("1"))
}

val function = (string: String) => string.toInt

executeFunction(function)


val sayHello = () => println("Hello")
def executeXTimes(callback: () => Unit, numTimes: Int): Unit = {
  for (num <- 1 to numTimes) callback()
}

executeXTimes(sayHello, 10)


// -------------------------------------------

def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int): Unit = {
  val result = f(x, y)
  println(result)
}

val sum = (x: Int, y: Int) => x + y
val multiply = (x: Int, y: Int) => x * y

executeAndPrint(sum, 3, 5)
executeAndPrint(multiply, 3, 5)

// -------------------------------------------






