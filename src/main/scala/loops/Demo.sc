for (i <- 1 to 9) {
  println(i)
}

(0 to 10).foreach(println(_))

for (i <- 0 to 5) yield i

import scala.util.control.Breaks._
breakable {
  for (i <- 1 to 100) {
    println(i)
    if (i == 10) {
      break()
    }
  }
}


