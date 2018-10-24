package cook_book.chapter_4_classes_and_properties._16_creating_inner_classes

object Start extends App {
  val pandorasBox = new PandorasBox()
  pandorasBox.things.foreach(println)
  println

  pandorasBox.addThing("Evil Thing #3")
  pandorasBox.things.foreach(println)
}


class PandorasBox {

  case class Thing(name: String)

  var things = new collection.mutable.ArrayBuffer[Thing]()
  things += Thing("Evil Thing #1")
  things += Thing("Evil Thing #2")

  def addThing(name: String) {things += Thing(name)}

}
