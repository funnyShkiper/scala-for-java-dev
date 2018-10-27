
def executeFunction(callback: () => Unit): Unit = {
  callback()
}

val callback: () => Unit = () => { println("CallBack function run") }
val sayHello = () => { println("Hello") }
executeFunction(callback)
executeFunction(sayHello)
