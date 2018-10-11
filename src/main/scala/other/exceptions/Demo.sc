import java.io.{BufferedReader, IOException, InputStreamReader}
import java.net.{MalformedURLException, URL}


try {
  val url = new URL("http://baddotrobot.com/")
  val reader = new BufferedReader(new InputStreamReader(url.openStream()))
  try {
    var line = reader.readLine()
    while (line != null) {
      line = reader.readLine()
      println(line)
    }
  } finally {
    reader.close()
  }
} catch {
  case e: MalformedURLException => println("Bad URL")
  case e: IOException => println(e.getMessage)
}