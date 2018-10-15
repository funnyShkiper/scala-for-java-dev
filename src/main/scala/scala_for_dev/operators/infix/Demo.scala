package scala_for_dev.operators.infix

object Demo extends App {

  val x_0 = I(1).+(I(2))
  println(x_0)

  val x_1 = I(1) + I(3)
  println(x_1)

  val y_0 = I(1) * I(5)
  println(y_0)

  val y_1 = I(2) + I(3) * I(4)
  println(y_1)

  // ((1 ++ 2) ++ 3 ++ 4)
  val b_0 = B(1) ++ B(2) ++ B(3) ++ B(4)
  println(b_0)

  // 1 +: (2 +: (3 +: 4))
  val b_1 = B(1) +: B(2) +: B(3) +: B(4)
  println(b_1)
}


case class I(k: Int) {
  def +(that: I): I = I(this.k + that.k)

  def *(that: I): I = I(this.k * that.k)

  override def toString: String = s"Result:${this.k}"
}

case class B(k: Int) {
  def ++(that: B): B = B(this.k + that.k)
  def +:(that: B): B = B(this.k + that.k)

  override def toString: String = s"Result B:${this.k}"
}
