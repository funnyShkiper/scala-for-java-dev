package cook_book.chapter_5_methods._1_controlling_methods_scope

object ObjectPrivateScope extends App {

}


class Foo {
  private[this] def isFoo = true

  def doFoo(other: Foo): Unit = {
    /*if (other.isFoo) { // line don't compile
    }*/
  }
}
