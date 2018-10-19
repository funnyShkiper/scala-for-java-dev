// Запись multiline строки в переменную осуществляется при помощи трех двойных кавычек
val foo =
  """This is
    |a multiline
    |String
  """.stripMargin

println(foo)