package cook_book.chapter_8_traits._4_using_traits_as_simple_mixins

object Demo extends App {

  val zeus = new Dog("Zeus")
  zeus.ownerIsHome
  zeus.jumpForJoy

}

trait Tail {
  def wagTail { println("tail is wagging") }
  def stopTail { println("tail is stopped") }
}

abstract class Pet(var name: String) {
  def speak
  def ownerIsHome { println("excited") }
  def jumpForJoy { println("jumping for Joy") }
}

class Dog(name: String) extends Pet(name) with Tail {
  override def speak: Unit = { println("woof") }

  override def ownerIsHome: Unit = {
    wagTail
    speak
  }
}


