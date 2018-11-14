val states = Map("AL" -> "Alabama", "AK" -> "Alaska")

import scala.collection.mutable.{Map => MMap}
var mutableStatesMap = MMap("AL" -> "Alabama")
mutableStatesMap += ("Ak" -> "Alaska")

mutableStatesMap.unzip




