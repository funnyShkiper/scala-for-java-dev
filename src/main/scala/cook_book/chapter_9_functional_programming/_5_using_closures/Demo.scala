package cook_book.chapter_9_functional_programming._5_using_closures


package otherscore {
  class Foo {
    def exec(f:(String) => Unit, name: String): Unit = {
      f(name)
    }
  }
}



