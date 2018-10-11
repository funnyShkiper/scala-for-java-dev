package other.start

object Start {
  def main(args: Array[String]): Unit = {
    val greeting: Greeting = Greeting("Hello world")
    greeting.greeting()
  }
}

case class Greeting(string: String) {
  def greeting(): Unit = {
    print(string)
  }
}
