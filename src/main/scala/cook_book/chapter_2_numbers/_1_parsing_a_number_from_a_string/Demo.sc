"100".toInt

"100".toDouble

"100".toFloat

"100".toShort

"100".toLong

"100".toByte

try {
  "foo".toInt
} catch {
  case ex: NumberFormatException => println("Нельзя преобразовать в число")
  case _: Throwable => println("Ошибка при преобразовании в строки в число")
}

val bigInt = BigInt("100")
val bigDecimal = BigDecimal("100")


// Преобразование строк в разные системы счисления
Integer.parseInt("1", 2)
Integer.parseInt("10", 2)
Integer.parseInt("100", 2)
Integer.parseInt("1000", 2)
Integer.parseInt("1000", 4)
Integer.parseInt("1000", 8)


implicit class StringToInt(s: String) {
  def toIntImplicit(radix: Int) = Integer.parseInt(s, radix)
}

"100".toIntImplicit(2)

def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
  }
}

toInt("1").getOrElse("0")
toInt("1as").getOrElse("0")


val result = toInt("123") match {
  case Some(x) => x
  case None => 0
}

