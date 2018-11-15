package cook_book.chapter_13_actors_and_cuncurrency._9_simple_concurrency_with_futures

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Futures1 extends App {

  // used by 'time' method
  implicit val baseTime = System.currentTimeMillis()

  // create a Future
  val f = Future {
    Thread.sleep(500)
    1 + 1
  }

  val result = Await.result(f, 1 second)
  println(result)

  Thread.sleep(1000)

}




