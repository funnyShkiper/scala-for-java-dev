val a = Array("apple", "banana", "cherry")

a.mkString
a.mkString(",")
a.mkString("{", ", ", "}")
a.mkString("[", ", ", "]")

val array = Array(Array("a", "b"), Array("c", "d"))
array.flatten.mkString("[", ", ", "]")







