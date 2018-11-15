val a = Map("AL" -> "Alabama")
val b = a + ("AK" -> "Alaska")
val c = b + ("AR" -> "Arkansas", "AZ" -> "Arizona")

val d = c + ("AR" -> "banana")

val e = d - "AR"
val f = d - "AZ" - "AL"







