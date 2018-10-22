import java.io.{FileNotFoundException, IOException}

val s = "Foo"
try {
  s.toInt
} catch {
  case e: FileNotFoundException => println("Couldn't find that file.")
  case e: IOException => println("Had a IOException trying to read that file.")
  case e: NumberFormatException => println("Can't convert string to number")
  case e: Exception => e.printStackTrace
  case _: Throwable => println("Ignoring exception.")
}


@throws(classOf[NumberFormatException])
def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => throw e
  }
}

toInt("12")
toInt("foo")





