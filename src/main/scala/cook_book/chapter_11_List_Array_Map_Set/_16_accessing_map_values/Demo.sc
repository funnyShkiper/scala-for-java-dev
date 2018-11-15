val states = Map("AL" -> "Alabama", "AK" -> "Alaska", "AZ" -> "Arizona")

val az = states("AZ")

val s = states.getOrElse("FOO", "No such state")

states.get("AZ")
states.get("FOO")

