package scala_for_dev.oop.set_get

class PersonBean {

  private[this] var age: Int = _

  def getAge(): Int = this.age

  def setAge(age: Int) = this.age = age

  override def toString: String = s"PersonBean:{age=${age}}"
}
