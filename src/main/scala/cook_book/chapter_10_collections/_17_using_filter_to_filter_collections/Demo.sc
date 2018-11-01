val list = List.range(1, 10)
val evens = list.filter(_ % 2 == 0)

val fruits = Set("orange", "banana", "apple", "peach")
fruits.filter(_.startsWith("a"))
fruits.filter(_.length > 5)


val example = "apple" :: "banana" :: 1 :: 2 :: Nil
example.filter{
  case s: String => true
  case _ => false
}



