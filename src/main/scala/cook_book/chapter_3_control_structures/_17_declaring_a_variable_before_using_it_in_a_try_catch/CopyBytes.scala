package cook_book.chapter_3_control_structures._17_declaring_a_variable_before_using_it_in_a_try_catch

import java.io.{FileInputStream, FileOutputStream, IOException}

object CopyBytes extends App {

  var in = None: Option[FileInputStream]
  var out = None: Option[FileOutputStream]

  try {
    in = Some(new FileInputStream("C:\\Users\\MIvashenko\\Desktop\\scala\\scala-for-java-dev\\src\\main\\scala\\cook_book\\chapter_3_control_structures\\_17_declaring_a_variable_before_using_it_in_a_try_catch\\CopyBytes.scala"))
    out = Some(new FileOutputStream("C:\\Users\\MIvashenko\\Desktop\\scala\\scala-for-java-dev\\src\\main\\scala\\cook_book\\chapter_3_control_structures\\_17_declaring_a_variable_before_using_it_in_a_try_catch\\CopyBytes.scala.copy"))

    var c = 0
    while({c = in.get.read; c != 1}) {
      out.get.write(c)
    }
  } catch {
    case e: IOException => e.printStackTrace
  } finally {
    println("entered finally")
    if (in.isDefined) in.get.close()
    if (out.isDefined) out.get.close()
  }

}
