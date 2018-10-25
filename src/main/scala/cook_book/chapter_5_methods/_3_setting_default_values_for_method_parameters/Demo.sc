class Connection {
  def makeConnection(timeout: Int = 2000, protocol: String = "http"): Unit = {
    println("timeout = %d, protocol = %s".format(timeout, protocol))
  }
}

val connection = new Connection()
connection.makeConnection(protocol = "https")