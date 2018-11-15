import scala.collection.immutable.ListMap

val grades = Map("Kim" -> 90,
  "Al" -> 85,
  "Melissa" -> 95,
  "Emily" -> 91,
  "Hannah" -> 92
)


ListMap(grades.toSeq.sortBy(_._1):_*)
ListMap(grades.toSeq.sortBy(_._2):_*)

ListMap(grades.toSeq.sortWith(_._1 < _._1):_*)
ListMap(grades.toSeq.sortWith(_._1 > _._1):_*)

ListMap(grades.toSeq.sortBy(_._2):_*)
ListMap(grades.toSeq.sortWith(_._2 < _._2):_*)
ListMap(grades.toSeq.sortWith(_._2 > _._2):_*)




