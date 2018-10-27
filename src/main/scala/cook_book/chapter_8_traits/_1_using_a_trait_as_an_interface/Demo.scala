package cook_book.chapter_8_traits._1_using_a_trait_as_an_interface

object Demo extends App {




}


trait BaseSoundPlayer {
  def play
  def close
  def pause
  def start
  def resume
}

trait DogTrait {
  def speak(whatToSay: String)
  def wagTail(enable: Boolean)
}

class MP3SoundPlayer extends BaseSoundPlayer {
  override def play: Unit = ???

  override def close: Unit = ???

  override def pause: Unit = ???

  override def start: Unit = ???

  override def resume: Unit = ???
}

abstract class Animal {
  def speak
}

trait WaggingTail {
  def startTail { println("tail started") }
  def stopTail { println("tail stopped") }
}

trait FourLeggedAnimal {
  def walk
  def run
}

class Dog extends Animal with FourLeggedAnimal with WaggingTail {
  override def speak: Unit = ???

  override def walk: Unit = ???

  override def run: Unit = ???
}


