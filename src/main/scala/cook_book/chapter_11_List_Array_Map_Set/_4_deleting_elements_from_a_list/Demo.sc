val originalList = List(5, 1, 4, 3, 2)
val newList = originalList.filter(_ > 2)

var x = List(5, 1, 4, 3, 2)
x = x.filter(_ > 2)

// ListBuffer
import collection.mutable.ListBuffer
val listBuffer = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
listBuffer -= 5
listBuffer --= Seq(1, 2, 4)

