val i = 2
i match {
  case 0 => println("0")
  case 1 => println("1")
  case default => println("Your gave me: " + default)
}


i match {
  case 0 => println("0")
  case 1 => println("1")
  case _ => println("Your gave me: " + _)
}


