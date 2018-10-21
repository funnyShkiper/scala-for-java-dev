println("Break example")

import scala.util.control.Breaks._
breakable {
  for (i <- 1 to 10) {
    println(i)
    if (i > 4) break
  }
}

println("Continue Example")
val searchMe = "peter piper picked a peck of pickled peppers"
var numPs = 0
for (i <- 0 until searchMe.length) {
  breakable {
    if (searchMe.charAt(i) != 'p') {
      break
    } else {
      numPs += 1
    }
  }
}
println(s"Found ${numPs} p's in the string." )

val count = searchMe.count(_ == 'p')



