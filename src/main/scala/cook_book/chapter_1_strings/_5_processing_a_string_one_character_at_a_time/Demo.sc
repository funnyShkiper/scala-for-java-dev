val upper = "hello, world".map(_.toUpper)

val filtering = "hello, world".filter(_ != 'l').map(_.toUpper)

for (c <- "hello") println(c)

for (c <- "hello") yield c.toUpper

val result = for {
  c <- "hello"
  if (c != 'l')
} yield c.toUpper


"hello".foreach(println(_))

"HELLO".map(c => (c.toByte + 32).toChar)
"HELLO".map(c => {
  (c.toByte+32).toChar
})


def toLower(c: Char): Char = {
  (c.toByte + 32).toChar
}

"HELLO".map(toLower(_))

for (c <- "HELLO") yield toLower(c)




