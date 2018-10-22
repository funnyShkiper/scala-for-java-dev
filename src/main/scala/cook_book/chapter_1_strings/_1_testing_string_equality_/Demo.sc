val s1 = "Hello"
val s2 = "Hello"
val s3 = "H" + "ello"
val s4 = null

println("Testing")
s1 == s2
s1 == s3

s1 == s4
s1 == s4

s1.toUpperCase == s2.toUpperCase

// not compile
//s1.toUpperCase == s4.toUpperCase

// Equals with ignoring case
s1.equalsIgnoreCase(s2.toUpperCase)




