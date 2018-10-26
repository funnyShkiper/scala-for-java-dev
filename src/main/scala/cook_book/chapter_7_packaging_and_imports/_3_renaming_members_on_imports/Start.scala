package cook_book.chapter_7_packaging_and_imports._3_renaming_members_on_imports

import java.util.{ArrayList => JavaList}
import java.util.{Date => JDate, HashMap => JHashMap}


object Start extends App {

  val javaList = new JavaList[String]()
  javaList.add("String")
  javaList.add("String")
  javaList.add("String")
  javaList.forEach(println)

  val map = new JHashMap[String, String]()
  map.put("1", "Message_1")
  map.put("2", "Message_2")
  map.put("3", "Message_3")
  map.forEach((k, v) => {
    println(s"($k, $v)")
  })
}
