package scala_for_dev.oop.singletone

trait T
class C
object O

object Demo extends App {

  val x: T = null
  val y: C = null
  val z: O = null
  val z: O.type = null

  def f(x: T): T = ???
  def g(x: C): C = ???
  def h(h: O): O = ???
  def h(h: O.type ): O.type = ???

  def r(arg: Any): String = arg match {
    case _: T => "T"
    case _: C => "C"
    case _: O => "O"
    case _: O.type => "O"
  }

  override def main(args: Array[String]): Unit = {

  }

}
