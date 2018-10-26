package cook_book.chapter_6_objects._9_implementing_the_factory_method_in_scala_with_apply

object Start extends App {

  val cat = Animal("meow")
  val dog = Animal("woof")

  println(cat.getClass.getSimpleName + " class")
  println(dog.getClass.getSimpleName + " class")

}


trait Animal {
  def speak
}

object Animal {

  private class Dog extends Animal {
    override def speak: Unit = {
      println("woof")
    }
  }

  private class Cat extends Animal {
    override def speak: Unit = {
      println("meow")
    }
  }

  def apply(string: String): Animal = string match {
    case "woof" => new Dog
    case "meow" => new Cat
  }

}


