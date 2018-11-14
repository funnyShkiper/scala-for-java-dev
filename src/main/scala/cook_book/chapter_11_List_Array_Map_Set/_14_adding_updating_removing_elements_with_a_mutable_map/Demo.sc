import scala.collection.mutable.{Map => MMap}

var states = MMap[String, String]()
states += ("AK" -> "Alaska")
states += ("AL" -> "Alabama")

states += ("AR" -> "Arkansas", "AZ" -> "Arizona")

states ++= List("CA" -> "California", "CO" -> "Colorado")

states -= "AR"

states -= ("AL", "AZ")

states --= List("AL", "AZ")

states.update("AK", "Alaska, is really big state!")
states




