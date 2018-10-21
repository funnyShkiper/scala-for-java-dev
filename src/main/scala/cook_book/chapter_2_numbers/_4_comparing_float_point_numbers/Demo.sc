def ~=(x: Double, y: Double, precision: Double)  = {
  if ((x - y).abs < precision) true else false
}

val a = 0.3
val b = 0.1 + 0.2

println(~=(a, b, 0.0000000000000000001))
println(~=(a, b, 0.0000000000001))