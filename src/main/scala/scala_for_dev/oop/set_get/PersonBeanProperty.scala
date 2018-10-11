package scala_for_dev.oop.set_get

import scala.beans.BeanProperty

class PersonBeanProperty {

  @BeanProperty
  var age: Int = _

  override def toString: String = s"PersonBeanProperty:{age=${age}}"

}
