package scala_for_dev.oop.static_utils

object Demo extends App {
  override def main(args: Array[String]): Unit = {
    println(IntLb.max(3, 2))
    println(IntLb.max(23, 2))
  }
}

object IntLb {
  val MAX_INT = java.lang.Integer.MAX_VALUE
  def max(x: Int, y: Int) = if (x > y) x else y
}
