import scala.collection.mutable.ArrayBuffer
import scala.math.BigDecimal.double2bigDecimal

var fruits = ArrayBuffer[String]()
var ints = ArrayBuffer[Int]()


var nums = ArrayBuffer(1, 2, 3, 4, 5)

nums += 4
nums ++= ArrayBuffer(3, 2, 1)

nums = nums.sorted

nums += (5, 6)

nums ++= List(1, 0 , 87)

nums -= 5

nums --= Array(1, 2)


val a = ArrayBuffer(1, 2, 3)
a.append(4)
a.append(5, 6)
a.appendAll(Seq(7, 8))
println(a)
a.clear()

a.appendAll(Seq(1, 2))
println(a)

a.insert(0, 8)
println(a)

a.insert(0, 6, 7)
println(a)

a.insertAll(0, Vector(4, 5))
println(a)


a.prepend(12)
println(a)

a.prepend(1, 2)
println(a)

a.prependAll(Array(0))
println(a)

val b = ArrayBuffer.range('a', 'h')
b.remove(0)
println(b)

b.remove(2, 3)
println(b)

val ab = ArrayBuffer.range('a', 'h')
ab.trimStart(2)
println(ab)

ab.trimEnd(2)
println(ab)




