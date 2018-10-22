class Person(var firstName: String, var lastName: String) {

  private val HOME = System.getProperty("user.home")
  var age = 0

  override def toString: String = s"$firstName $lastName is $age years old"
  def printHome { println(s"HOME = $HOME")}
  def printFullName {println(this)}

  printHome
  printFullName

}