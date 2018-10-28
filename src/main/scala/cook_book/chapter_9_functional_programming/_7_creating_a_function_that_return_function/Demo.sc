def saySomething(prefix: String) = (s: String) => {
  prefix + " " + s
}

val sayHello = saySomething("Hello")
sayHello("Max")

def greeting(language: String) = (name: String) => {
  language match {
    case "english" => "Hello, " + name
    case "spanish" => "Buenos dias, " + name
  }
}

val greetEnglish = greeting("english")
val greetSpanish = greeting("spanish")
greetEnglish("Max")
greetSpanish("Max")