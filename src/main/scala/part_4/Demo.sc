import java.util.concurrent.Callable

val number: Int = 42
val number_1: Int = 42

number == number_1
number.equals(number_1)

val str: String = "Hello"
var str_1:String = "Hello"

str == str_1
str.equals(str_1)

case class Simple(id: Int, name: String){}

val obj = Simple(12, "Max")
val obj_1 = Simple(12, "Max")

obj == obj_1
obj.eq(obj_1)
obj.equals(obj_1)

class DoNothing extends Callable[Unit] {
  override def call(): Unit = ()
}

val string = null

def sum(x: Int*): Int = {
  var s = 0
  for (item <- x) {
    s += item
  }
  s
}

sum(1, 2, 4, 5, 3)
def swap(first: Int, second: Int = 1): Unit = {

}

swap(1)
swap(1, 2)
swap(second = 5, first = 1)
swap(first = 2, second = 3)

