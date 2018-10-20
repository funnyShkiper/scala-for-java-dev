val name = "Fred"
val age = 33
val weight = 200.00

println(s"$name is $age years old, and weighs $weight pounds.")

println(s"Age next year: ${age + 1}")

println(s"You are 33 years old: ${age == 33}")


case class Student(name: String, score: Int)

val hannah = Student("Hannah", 95)

println(s"${hannah.name} has a score of ${hannah.score}")

// Важно!!! вместо s использовать f
printf(f"$name is $age years old, and weighs $weight%.0f pounds.")

/**
  * %c - character
  * %d - decimal number
  * %e - exponential floating point number
  * %f - floating point number
  * %i - integer
  * %o - octal number
  * %s - string of characters
  * %u - unsigned decimal
  * %x - hexadecimal number
  * %% - print a "percent" character
  * \% - print a "percent" character
  * */




