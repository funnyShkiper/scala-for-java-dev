package cook_book.chapter_6_objects.model

object Start extends App {

  echo("Hello world")
  echo(MAGIC_NUMBER)
  echo(Margin.LEFT)

  // use your mutable map type
  val mm = MutableMap("name" -> "Al")
  mm += ("password" -> "123")
  for ((k, v) <- mm) println(s"key: $k, value: $v")
}
