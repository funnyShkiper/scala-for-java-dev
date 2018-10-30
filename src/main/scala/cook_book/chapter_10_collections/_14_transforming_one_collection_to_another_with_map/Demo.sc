val helpers = Vector("adam", "kim", "melissa")


helpers.map(_.capitalize)

val names = Array("Max", "Kate", "Julia")
names.map(_.length)

def plusOne(char: Char) = (char.toByte + 1).toChar
"HAL".map((char: Char) => plusOne(char))
"HAL".map(plusOne)




