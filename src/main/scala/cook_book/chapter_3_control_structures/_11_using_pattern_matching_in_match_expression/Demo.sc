case class Person(firstName: String, lastName: String)

case class Dog(name: String)


def echoWhatYouGaveMe(x: Any): String = x match {
  // constant pattern
  case 0 => "zero"
  case true => "true"
  case "hello" => "you said 'hello'"
  case Nil => "an empty List"

  // sequence pattern
  case List(0, _, _) => "a three elements list with 0 as first element"
  case List(1, _*) => "a list beginning with 1, having any number of elements"
  case Vector(1, _*) => "a vector starting with 1, having any number of elements"


  // tuples
  case (a, b) => s"got $a and $b"
  case (a, b, c) => s"got $a, $b and $c"


  // constructor patterns
  case Person(firstName, lastName) => s"$firstName $lastName"
  case Dog(name) => s"Dog name is $name"

  // typed pattern
  case s: String => s"you gave me this string: $s"
  case i: Int => s"thanks for the int: $i"
  case f: Float => s"thanks for the float: $f"
  case array: Array[Int] => s"an array of the int: $array"
  case stringArray: Array[String] => s"an array of strings: ${stringArray.mkString(",")}"
  case d: Dog => s"dog: ${d.name}"
  case list: List[_] => s"thanks for the list: $list"
  case map: Map[_, _] => map.toString

  // default wilcard pattern
  case _ => "Unknown"

}


def matchType(x: Any): String = x match {
  // case x: List(1, _*) => s"$x"
  case x@List(1, _*) => s"$x"

  case x@Some(_) => s"$x"

  case p@Person(first, "Doe") => s"$p"

}


def toInt(s: String) = {
  try {
    Some(Integer.parseInt(s))
  } catch {
    case e: Exception => None
  }
}



