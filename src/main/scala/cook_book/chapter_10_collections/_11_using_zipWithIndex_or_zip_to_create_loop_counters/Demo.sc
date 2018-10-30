val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday")

days.zipWithIndex.foreach {
  case (day, count) => println(s"${count + 1}. $day")
}


for ((day, count) <- days.zipWithIndex) println(s"${count + 1}. $day")


for ((day, count) <- days.zip(Stream from 1)) println(s"$count. $day")


