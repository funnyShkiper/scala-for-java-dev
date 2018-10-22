import java.lang.StringIndexOutOfBoundsException

"hello".charAt(0)
try {
 "hello".charAt(7)
} catch {
  case ex: StringIndexOutOfBoundsException => println("Выход за пределы строки")
  case _: Throwable => println("Ошибка при извлечении символа строки")
}


"hello"(1)
"hello".apply(2)
"hello"(7)