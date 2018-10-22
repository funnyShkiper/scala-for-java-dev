for (i <- 1 to 2; j <- 1 to 2) println(s"i = $i, j = $j")


for {
  i <- 1 to 2
  j <- 1 to 2
} println(s"i = $i, j = $j")



val array = Array.ofDim[Int](2, 2)
array(0)(0) = 0
array(0)(1) = 1
array(1)(0) = 2
array(1)(1) = 3


