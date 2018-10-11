val f: Function2[String, String, Int] = (a, b) => a.compareTo(b)
val F: (String, String) => Int = (a, b) => a.compareTo(b)

f("hello", "Hello")
F("hello", "hello")
"Hello".hashCode
"hello".hashCode

