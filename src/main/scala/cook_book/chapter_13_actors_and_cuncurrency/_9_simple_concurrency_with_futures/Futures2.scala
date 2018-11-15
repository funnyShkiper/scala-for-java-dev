package cook_book.chapter_13_actors_and_cuncurrency._9_simple_concurrency_with_futures

import scala.concurrent.{Await, Future, future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Futures2 extends App {

  implicit val baseTime = System.currentTimeMillis()

  def logRunningComputation(i: Int): Future[Int] = future {
    sleep(100)
    i + 1
  }

  logRunningComputation(11).onComplete {
    case Success(value) => println(s"result = $value")
    case Failure(exception) => exception.printStackTrace()
  }

  sleep(1000)

  def sleep(i: Int): Unit = {
    Thread.sleep(i)
  }
}
