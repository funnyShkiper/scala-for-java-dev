package cook_book.chapter_13_actors_and_cuncurrency._9_simple_concurrency_with_futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random

object Example1 extends App {

  println("Starting calculation ...")
  val f = Future {
    Thread.sleep(Random.nextInt(500))
    42
  }

  println("Before OnComplete")
  f.onComplete {
    case scala.util.Success(value) => println(s"Got the callback, meaning = $value")
    case scala.util.Failure(exception) => exception.printStackTrace()
  }

  // do the rest of
  println("A ...")
  println("B ...")
  println("C ...")
  println("D ...")
  println("E ...")
  println("F ...")

  sleep(100)
  sleep(100)
  sleep(100)
  sleep(100)
  sleep(100)
  sleep(100)
  sleep(2000)

  def sleep(i: Int): Unit = {
    Thread.sleep(i)
  }



}


object OnSuccessAndFailure extends App {

  val f = Future {
    sleep(Random.nextInt(500))
    if (Random.nextInt(500) > 250) throw new Exception("Yikes!") else 42
  }

  f onSuccess {
    case result => println(s"Success: $result")
  }

  f onFailure {
    case t => println(s"Exception: ${t.getMessage}")
  }

  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)

  sleep(2000)

  def sleep(i: Int): Unit = {
    Thread.sleep(i)
  }
}
