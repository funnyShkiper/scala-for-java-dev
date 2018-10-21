
def getMonthByNumber(number: Int) = number match {
  case 1 => "January"
  case 2 => "February"
  case 3 => "March"
  case 4 => "April"
  case 5 => "May"
  case 6 => "June"
  case 7 => "July"
  case 8 => "August"
  case 9 => "September"
  case 10 => "October"
  case 11 => "November"
  case 12 => "December"
  case _ => "Not a month's number"
}


println(getMonthByNumber(3))

def getClassAsString(x: Any) = x match {
  case s: String => "String"
  case x: Int => "Int"
  case f: Float => "Float"
  case d: Double => "Double"
  case l: Long => "Long"
  case l: List[_] => "List"
  case _ => "Unknown"
}

getClassAsString("1")
getClassAsString(1)
getClassAsString(1.0)
getClassAsString(1L)
getClassAsString(1f)




