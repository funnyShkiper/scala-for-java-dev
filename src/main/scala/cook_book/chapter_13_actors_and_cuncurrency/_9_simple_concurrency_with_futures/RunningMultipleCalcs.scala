package cook_book.chapter_13_actors_and_cuncurrency._9_simple_concurrency_with_futures

import scala.concurrent.{Future, future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random


object RunningMultipleCalcs extends App {
  println("Starting futures")
  val result_1 = Cloud.runAlgorithm(10)
  val result_2 = Cloud.runAlgorithm(20)
  val result_3 = Cloud.runAlgorithm(30)

  println("Before for-comprehension")
  val result = for {
    r1 <- result_1
    r2 <- result_2
    r3 <- result_3
  } yield {
    println(s"R1: $r1")
    println(s"R2: $r2")
    println(s"R3: $r3")
    (r1 + r2 + r3)
  }

  println("Before OnSuccess")
  result onSuccess {
    case result => println(s"Total = $result")
  }

  println("Before sleep at the end")
  sleep(2000)
}

object Cloud {
  def runAlgorithm(i: Int): Future[Int] = future {
    sleep(Random.nextInt(500))
    val result = i + 10
    println(s"Returning result from cloud: $result")
    result
  }



}

