package cook_book.chapter_13_actors_and_cuncurrency._4_understanding_the_methods_in_the_akka_actor_lifecycle

import akka.actor.{Actor, ActorSystem, Props}

object Start extends App {
  val system = ActorSystem("LifecycleDemo")
  val kenny = system.actorOf(Props[Kenny], name = "Kenny")

  println("sending kenny a simple String message")
  kenny ! "hello"
  Thread.sleep(1000)

  println("make kenny restart")
  kenny ! ForceRestart
  Thread.sleep(1000)

  println("stopping")
  system.stop(kenny)

  println("shutting down system")
  system.terminate
}

class Kenny extends Actor {
  println("Enter the Kenny constructor")

  override def preStart(): Unit = {
    println("kenny: prestart")
  }

  override def postStop(): Unit = {
    println("kenny: poststop")
  }

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    println("kenny: preRestart")
    println(s"Message: ${message.getOrElse("")}")
    println(s"Reason: ${reason.getMessage}")
    super.preRestart(reason, message)
  }

  override def receive: Receive = {
    case ForceRestart => throw new Exception("Boom!")
    case _ => println("Kenny received a message")
  }
}

case object ForceRestart



