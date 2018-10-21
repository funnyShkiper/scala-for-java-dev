val r = scala.util.Random
// r.setSeed(1000L)

r.nextInt(100)

r.nextFloat

r.nextDouble


var range = 0 to r.nextInt(10)
range = 0 to r.nextInt(100)

for (i <- 0 to r.nextInt(25)) yield i * 2

for (i <- 0 to r.nextInt(25)) yield i * r.nextFloat

for (i <- 0 to r.nextInt(10)) yield r.nextPrintableChar



