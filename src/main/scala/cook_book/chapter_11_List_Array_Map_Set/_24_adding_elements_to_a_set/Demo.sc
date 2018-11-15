var set = scala.collection.mutable.Set[Int]()

set += 1
set += (2, 3)
set += 2

set ++= Vector(4, 5)

set.add(6)
set.add(5)

set.contains(5)
set.contains(6)



