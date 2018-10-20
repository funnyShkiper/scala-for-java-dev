val numPattern = "[0-9]+".r
val address = "123 Main Street Suite 101"

val match1 = numPattern.findFirstIn(address)
val matchAll = numPattern.findAllIn(address).foreach(println(_))