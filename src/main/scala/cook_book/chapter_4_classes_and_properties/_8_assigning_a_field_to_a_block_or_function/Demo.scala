package cook_book.chapter_4_classes_and_properties._8_assigning_a_field_to_a_block_or_function

object Demo extends App {
  val foo = new Foo

  val lazyFoo = new LazyFoo
  lazyFoo.text
}

// Чтение файла осуществляется в конструкторе класса
class Foo {
  val text = {
    var lines = ""
    try {
      lines = io.Source.fromFile("C:\\Users\\MIvashenko\\Desktop\\scala\\scala-for-java-dev\\src\\main\\scala\\cook_book\\chapter_4_classes_and_properties\\_8_assigning_a_field_to_a_block_or_function\\file.txt")
          .getLines().mkString
    } catch {
      case e: Exception => lines = "Error happened"
    }
    lines
  }

  println(text)
}

// Чтение файла осуществляется при обращении к переменной text
class LazyFoo {
  lazy val text = io.Source.fromFile("C:\\Users\\MIvashenko\\Desktop\\scala\\scala-for-java-dev\\src\\main\\scala\\cook_book\\chapter_4_classes_and_properties\\_8_assigning_a_field_to_a_block_or_function\\file.txt")
    .getLines().foreach(println)
}