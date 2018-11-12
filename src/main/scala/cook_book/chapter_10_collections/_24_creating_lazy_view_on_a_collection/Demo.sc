1 to 100

val view = (1 to 100).view
val x = view.force

(1 to 25).foreach(println)
(1 to 25).view.foreach(println)

(1 to 25).map(_ * 2)
(1 to 25).view.map(_ * 2)

val result = (1 to 1000).view.map { e =>
  Thread.sleep(10)
  e * 2
}

result.force








