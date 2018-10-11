package scala_for_dev.oop.set_get

import scala.beans.BeanProperty

class PersonBeanPropertyWithConstructor(@BeanProperty var age: Int) {
  override def toString: String = s"PersonBeanPropertyWithConstructor:{age=${age}}"
}
