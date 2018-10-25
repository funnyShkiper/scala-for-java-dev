
trait Human {
  def hello = "The Human Trait"
}

trait Mother extends Human {
  override def hello = "Mother Trait"
}

trait Father extends Human {
  override def hello = "Father Trait"
}

class Child extends Human with Mother with Father {
  def printSuper = super.hello
  def printMother = super[Mother].hello
  def printFather = super[Father].hello
  def printHuman = super[Human].hello
}

val child = new Child
child.printSuper
child.printMother
child.printFather
child.printHuman


