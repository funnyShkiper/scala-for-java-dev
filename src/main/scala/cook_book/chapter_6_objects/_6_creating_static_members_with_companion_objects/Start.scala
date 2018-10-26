package cook_book.chapter_6_objects._6_creating_static_members_with_companion_objects

object Start extends App {

  val foo = new Foo
  println(foo)
  println(Foo.double(foo))

}


class Foo {
  private val secret = 2
}

object Foo {
  def double(foo: Foo) = foo.secret * 2
}

