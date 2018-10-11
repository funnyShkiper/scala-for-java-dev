// Creating val / var variable
println("Creating val / var variable")
val language: String = "Scala"
var lang = "Java"
lang = "Scala"

val age = 35
var maxHeartRate = 210 - age * .5

// -------------------------------------------- //

// Defining functions
println("Defining functions")
def min(x: Int, y: Int) = {
  if (x < y) x
  else y
}

def m(x: Int, y: Int): Int = if(x < y) x else y

// def nothing(x: Int, y: Int): Unit = {
//   if (x < y) x
//   else y
// }

m(15, 35)
min(45, 35)
// nothing(35, 23)

// -------------------------------------------- //
// Operator overloading and infix notation
println("Operator overloading and infix notation")

val number: Int = 10
// number*.5

// number toString

35 + 10

"aBCDEF" replace("a", "A")

// -------------------------------------------- //
// Collections
println("Collections")

val list = List("a", "b", "c").foreach(item => print(item))

val map = Map(1 -> "a", 2 -> "b", 3 -> "c")
  .keys
  .foreach(key => {
    println("Key: " + key)
  })

// -------------------------------------------- //
// Tuples
println("Tuples")

val example = ("load", 21)
val tuple = ("save", 50, true)

val event = tuple._1
val millis = tuple._2
val success = tuple._3

val (e, m, s) = tuple

val S: (String, Int, Boolean) = ("save", 50, true)
def audit(event: (String, Int, Boolean)) = {

}

// -------------------------------------------- //
// Java Interoperability
val jList = new java.util.ArrayList[String]
jList.add("New String")
jList.add("Scala Language")
jList add "Java Language"
jList.forEach(str => println(str))

// -------------------------------------------- //