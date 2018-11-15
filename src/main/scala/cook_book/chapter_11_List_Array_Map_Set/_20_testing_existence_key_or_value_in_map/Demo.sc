val states = Map("AL" -> "Alabama", "AK" -> "Alaska", "AZ" -> "Arizona")

if (states.contains("FOO"))
  println("Found foo")
else println("No foo")

states.valuesIterator.exists(_.contains("riz"))
states.valuesIterator.exists(_.contains("labas"))





