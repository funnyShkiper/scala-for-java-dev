package scala_for_dev.operators.typed_constructor

object Demo extends App {

  val x_0: ab[Int, String] = ???
  val x_1: Int ab String = ???

  val y_0: ++[Int, String] = ???
  val y_2: Int ++ String = ???

  val y2: List[Int ++ String] = ???

  // class X extends (Int ++ String)

  val f: Int ++ String => String ++ Int = ???

}

case class ab[A, B](a: A, b: B)
case class ++[A, B](a: A, b: B)
