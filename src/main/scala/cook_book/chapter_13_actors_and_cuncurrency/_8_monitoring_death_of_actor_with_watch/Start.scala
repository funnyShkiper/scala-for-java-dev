package cook_book.chapter_13_actors_and_cuncurrency._8_monitoring_death_of_actor_with_watch

import akka.actor.{Actor, ActorSystem, PoisonPill, Props, Terminated}

object Start extends App {

  val actorSystem = ActorSystem("DeathWatchTest")
  val parent = actorSystem.actorOf(Props[Parent], name = "Parent")

  val kenny = actorSystem.actorSelection("/user/Parent/Kenny")
  kenny ! PoisonPill

  Thread.sleep(5000)
  println("Calling actorSystem terminate")
  actorSystem.terminate
}


class Kenny extends Actor {
  override def receive: Receive = {
    case _ => println("Kenny receive a message")
  }
}

class Parent extends Actor {

  val kenny = context.actorOf(Props[Kenny], name = "Kenny")
  context.watch(kenny)

  override def receive: Receive = {
    // Слушает сообщение об остановки актора
    case Terminated(kenny) => println("OMG, they killer Kenny")
    case _ => println("Parent receive a message")
  }
}
