import java.util.Locale

val pi = Math.PI
println(f"$pi%.5f")

"%06.2f".format(pi)


val formatter = java.text.NumberFormat.getIntegerInstance
formatter.format(10000)
formatter.format(1000000)

val locale = new Locale("de", "DE")

val formatter_de = java.text.NumberFormat.getIntegerInstance(locale)
formatter_de.format(10000)
formatter_de.format(1000000)














