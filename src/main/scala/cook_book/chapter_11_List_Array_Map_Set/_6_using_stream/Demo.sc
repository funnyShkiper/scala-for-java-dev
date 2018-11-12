val stream = 1 #:: 2 #:: 3 #:: Stream.empty

val bigStream = (1 to 1000000000).toStream

bigStream.toList

bigStream.head
bigStream.tail






