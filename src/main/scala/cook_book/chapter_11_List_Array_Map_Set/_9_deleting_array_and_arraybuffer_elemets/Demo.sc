import collection.mutable.ArrayBuffer

val arrayBuffer = ArrayBuffer('a', 'b', 'c', 'd', 'e', 'f')

arrayBuffer -= 'a'
arrayBuffer -= ('c', 'd')

arrayBuffer.remove(0)
arrayBuffer

arrayBuffer.remove(0, 1)
arrayBuffer


arrayBuffer.clear()
arrayBuffer

var array = Array("Apple", "Banana", "Cherry")

array.filter(!_.contains("Apple"))

array = Array("apple", "banana", "cherry")
array.take(2)




