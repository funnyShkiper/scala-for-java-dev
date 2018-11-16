package cook_book.chapter_13_actors_and_cuncurrency._10_sending_message_to_actor_and_waiting_for_a_reply

import akka.actor.{Actor, ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object AskTest extends App {

  val actorSystem = ActorSystem("AskTestSystem")
  val myActor = actorSystem.actorOf(Props[TestActor], name = "myActor")

  // 1 способ "ask" другой актор
  implicit val timeout = Timeout(5 seconds)
  val future = myActor ? AskNameMessage
  val result = Await.result(future, timeout.duration).asInstanceOf[String]
  println("1 " + result)

  // 2 способ
  val future_2: Future[String] = ask(myActor, AskNameMessage).mapTo[String]
  val result_2 = Await.result(future_2, 1 second)
  println("2 " + result_2)

  actorSystem.terminate
}

case object AskNameMessage
case object GetName

class TestActor extends Actor {
  override def receive: Receive = {
    case AskNameMessage => sender ! "Fred"
    case _ => println("That was unexpected")
  }
}


