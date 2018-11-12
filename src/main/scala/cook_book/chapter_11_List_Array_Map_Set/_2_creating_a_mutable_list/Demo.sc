import collection.mutable.ListBuffer

var fruits = new ListBuffer[String]()

fruits += "Apple"
fruits += "Orange"
fruits += "Banana"

fruits += ("Strawberry", "Kiwi", "Pineapple")

fruits -= "Apple"

fruits -= ("Banana", "Orange")

fruits --= Seq("Kiwi", "Pineapple")

val fruitList = fruits.toList







