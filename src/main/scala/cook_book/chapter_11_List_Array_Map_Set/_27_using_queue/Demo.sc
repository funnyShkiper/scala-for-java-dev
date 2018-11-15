import scala.collection.mutable.Queue
val ints = Queue[Int]()
val fruits = Queue[String]()


val queue = Queue(1, 2, 3)


var q = Queue[String]()
q += "apple"
q += ("kiwi", "banana")
q ++= List("cherry", "coconut")

q.enqueue("pineapple")
q

val next = q.dequeue()
q
q.dequeue()
q

q.dequeueFirst(_.startsWith("b"))
q

q.dequeueAll(_.length > 6)
q

