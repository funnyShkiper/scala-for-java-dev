
val month = "August"
var quarter = "???"

def matchMonth(month: String): String = month match {
  case "January" => "1st quarter"
  case "February" => "1st quarter"
  case "March" => "1st quarter"
  case "April" => "2st quarter"
  case "May" => "2st quarter"
  case "June" => "2st quarter"
  case "July" => "3rd quarter"
  case "August" => "3rd quarter"
  case "September" => "3rd quarter"
  case "October" => "4th quarter"
  case "November" => "4th quarter"
  case "December" => "4th quarter"
  case _ => "unknown quarter"
}

def matchMonth_v2(month: String): String = month match {
  case "January" | "February" | "March" => "1st quarter"
  case "April" | "May" | "June" => "2st quarter"
  case "July" | "August" | "September" => "3rd quarter"
  case "October" | "November" | "December" => "4th quarter"
  case _ => "unknown quarter"
}

matchMonth("March")
matchMonth_v2("December")
