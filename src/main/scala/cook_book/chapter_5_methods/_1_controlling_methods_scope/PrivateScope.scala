package cook_book.chapter_5_methods._1_controlling_methods_scope

object PrivateScope extends App {

}

class FooPrivateScope {

  private def isFoo = true

  def doFoo(other: FooPrivateScope): Unit = {
    if (other.isFoo) {
        // Компилируется, но метод isFoo не будет доступен у потомков данного класса
    }
  }

}

class Animal {
  private def heartBeat {}
}

class Dog extends Animal {
  // ошибка компиляции
  // heartBeat
}
