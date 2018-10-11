package scala_for_dev.oop.set_get

class Person {

  private[this] var privateAge: Int = _

  // accessor
  def age: Int = {
    println("From accessor")
    privateAge
  }

  // mutator
  def age_$eq(value: Int): Unit = {
    println("From mutator")
    privateAge = value
  }

  override def toString: String = s"Person:{age=${privateAge}}"
}
