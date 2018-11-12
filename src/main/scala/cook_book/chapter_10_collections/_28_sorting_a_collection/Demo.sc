val a = List(10, 5, 8, 1, 7)
val b = List("banana", "pear", "apple", "orange")

a.sortWith(_ < _)
a.sortWith(_ > _)

b.sortWith(_ < _)
b.sortWith(_ > _)


b.sortWith(_.length < _.length)
b.sortWith(_.length > _.length)

def sortByLength(s1: String, s2: String):Boolean = {
  s1.length < s2.length
}

b.sortWith(sortByLength)



