val evenNumbersArray = for (number <- 1 to 100 if number % 2 == 0) yield number
println(s"EvenNumbersArray size = ${evenNumbersArray.length}")

var size = (1 to 100)
  .filter(number => number % 2 == 0)
  .map(number => number)
  .length




