val bag = List("1", "2", "three", "4", "one hundred seventy five")

def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: Exception => None
  }
}

bag.flatMap(toInt)
bag.flatMap(toInt).sum


bag.map(toInt)
bag.map(toInt).flatten
bag.map(toInt).flatten.sum




