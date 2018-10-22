implicit class StringImprovements(s: String) {
  def increment = s.map(c => (c + 1).toChar)
  def decrement = s.map(c => (c - 1).toChar)
  def hideAll = s.replaceAll(".", "*")
  def plusOne = s.toInt + 1
  def asBoolean = s match {
    case "0" | "zero" | "" | " " | "false" => false
    case _ => true
  }
}

val resultIncrement = "HAL".increment
val resultDecrement = "HAL".decrement
val resultHideAll = "HAL".hideAll
val resultPlusOne = "5".plusOne
val resultAsBoolean_1 = "false".asBoolean
val resultAsBoolean_2 = "true".asBoolean
val resultAsBoolean_3 = "zero".asBoolean
val resultAsBoolean_4 = "".asBoolean


