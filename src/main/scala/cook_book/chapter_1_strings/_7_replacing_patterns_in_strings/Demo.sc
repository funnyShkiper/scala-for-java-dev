val address = "123 Main Street 354".replaceAll("[0-9]", "x")

val regex = "[0-9]".r
val newAddress = regex.replaceAllIn(address, "x")

val result = regex.replaceFirstIn(address, "x")

