val names = Array("chris", "ed", "maurice")

val capNames = for (name <- names) yield name.capitalize


var fruits = scala.collection.mutable.ArrayBuffer[String]()
fruits += "apple"
fruits += "orange"
fruits += "banana"

val capFruits = for (fruit <- fruits) yield fruit.capitalize


val fruitList = "orange" :: "banana" :: "apple" :: Nil
val capFruitList = for (fruit <- fruitList) yield fruit.capitalize

fruitList.map(_.capitalize)

