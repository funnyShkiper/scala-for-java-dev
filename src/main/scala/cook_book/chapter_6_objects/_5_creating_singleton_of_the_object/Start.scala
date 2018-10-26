package cook_book.chapter_6_objects._5_creating_singleton_of_the_object

import java.text.SimpleDateFormat
import java.util.Calendar

object Start extends App {
  CashRegister.open
  CashRegister.close

  println(DateUtils.getCurrentDate)
  println(DateUtils.getCurrentTime)
}


object CashRegister {
  def open {println("opened")}
  def close{println("closed")}
}


object DateUtils {

  def getCurrentDate: String = getCurrentDateTime("EEEE, d MMMM")

  def getCurrentTime: String = getCurrentDateTime("KK:mm")

  private def getCurrentDateTime(dateTimeFormat: String): String = {
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val calendar = Calendar.getInstance()
    dateFormat.format(calendar.getTime)
  }

}
