def dollarTo_1(currency: String, dollar: Double) = {
  if (currency == "GBP") dollar * 0.76
  else if (currency == "EUR") dollar * 0.83
  else dollar
}

def dollarTo(currency: String): Double => Double = {
  if (currency == "GBP") dol => dol * 0.76
  else if (currency == "EUR") dol => dol * 0.83
  else dol => dol
}

def calculateTicketPrice_1(targetCurrency: String): Unit = {
  println(dollarTo_1(targetCurrency, 199.99))
}

def calculateTicketPrice(currencyConversion: Double => Double): Unit = {
  println(currencyConversion(199.99))
}

calculateTicketPrice_1("GBP")
calculateTicketPrice(dollarTo("GBP"))


