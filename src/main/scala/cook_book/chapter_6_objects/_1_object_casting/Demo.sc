val a = 10
val b = a.asInstanceOf[Long]
val c = b.asInstanceOf[Float]
val d = c.asInstanceOf[Byte]


val array = Array("a", 1)
val arrayOfObjects = array.asInstanceOf[Array[Object]]
arrayOfObjects.foreach(println)


