package cook_book.chapter_5_methods._7_creating_methods_that_take_variable_argument_fields

object Start extends App {
  val obj = new FooVarArgs
  var listNumber = List(1, 2, 3, 4, 5, 6, 7)

  obj.printAll("Some string", "Next string", "Strings")
  obj.printSequence(listNumber: _*)


}


class FooVarArgs {
  def printAll(strings: String*): Unit = {
    strings.foreach(println)
  }

  def printSequence(numbers: Int*): Unit = {
    for (number <- numbers) println(number)
  }
}
