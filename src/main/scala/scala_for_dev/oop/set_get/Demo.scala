package scala_for_dev.oop.set_get

object Demo extends App {

  val person: Person = new Person
  val age = person.age

  person.age = 45
  println(person)
  print(person.age)

  person.age_$eq(35)
  println(person)

  person.age_=(33)
  println(person)


  val personBean = new PersonBean
  println(personBean)

  personBean.setAge(24)
  println(personBean.getAge())


  val personBeanProperty = new PersonBeanProperty
  personBeanProperty.setAge(25)
  println(personBeanProperty)


  val personBeanPropertyWithConstructor = new PersonBeanPropertyWithConstructor(26)
  println(personBeanPropertyWithConstructor)
}
