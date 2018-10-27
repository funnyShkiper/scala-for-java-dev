package cook_book.chapter_9_functional_programming._5_using_closures.otherscore

object Demo extends App {

  var hello = "Hello"
  def sayHello(name: String) = { println(s"$hello, $name") }

  val foo = new Foo
  foo.exec(sayHello, "Al")

  hello = "Hola"
  foo.exec(sayHello, "Lorenzo")
}
