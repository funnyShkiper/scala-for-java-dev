val x: List[String] = List("Hello", "World")
val y = 1 :: 2 :: 3 :: 4 :: Nil

def listToString(list: List[String]): String = list match {
  case s :: rest => s + " " + listToString(rest)
  case Nil => ""
}

listToString(x)

def sum(list: List[Int]): Int = list match {
  case Nil => 0
  case n :: rest => n + sum(rest)
}

def multiply(list: List[Int]): Int = list match {
  case Nil => 1
  case n :: rest => n * multiply(rest)
}

sum(y)
multiply(y)
