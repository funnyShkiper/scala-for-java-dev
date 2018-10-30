var iterator = Iterator(1, 2, 3)
iterator.foreach(println)
iterator.foreach(println)

iterator = Iterator(1, 2, 3)
iterator.toStream.foreach(println)




