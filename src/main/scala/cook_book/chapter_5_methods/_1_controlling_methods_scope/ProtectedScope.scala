package cook_book.chapter_5_methods._1_controlling_methods_scope

object ProtectedScope extends App {

}


class AnimalProtectedScope {
  protected def breath {}
}

class DogProtectedScope extends AnimalProtectedScope {
  // Нет ошибки компиляции, т.к. Protected Scope
  breath
}


package world {
  class AnimalPackage {
    protected def breathe {}
  }

  class JunglePackage {
    val a = new AnimalPackage()

    // Error compile
    // a.breathe
  }
}