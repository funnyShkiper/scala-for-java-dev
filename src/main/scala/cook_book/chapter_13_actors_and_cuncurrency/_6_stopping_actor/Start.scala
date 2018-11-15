package cook_book.chapter_13_actors_and_cuncurrency._6_stopping_actor

import scala.concurrent.{Await, ExecutionContext, Future}
import akka.pattern.gracefulStop
import scala.concurrent.duration._
import akka.actor._

object Start extends App {

  val system = ActorSystem("GracefulStopTest")
  val testActor = system.actorOf(Props[TestActor], name = "TestActor")

  try {
    val stopped: Future[Boolean] = gracefulStop(testActor, 2 seconds)(system)
    Await.result(stopped, 3 seconds)
    println("testActor was stopped")
  } catch {
    case e: Exception => e.printStackTrace
  } finally {
    system.terminate
  }

}

class TestActor extends Actor {
  override def receive: Receive = {
    case _ => println("TestActor got message")
  }

  override def postStop(): Unit = { println("TestActor: postStop") }
}

