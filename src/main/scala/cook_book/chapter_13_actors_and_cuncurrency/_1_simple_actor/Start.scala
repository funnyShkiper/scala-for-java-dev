package cook_book.chapter_13_actors_and_cuncurrency._1_simple_actor

import akka.actor.{Actor, ActorSystem, Props}

object Start extends App {

  // an actor needs an ActorSystem
  val system = ActorSystem("HelloSystem")

  // create and start the actor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  // send the actor two messages
  helloActor ! "hello"
  helloActor ! "buenos dias"

  system.terminate
}


class HelloActor extends Actor {
  override def receive: Receive = {
    case "hello" => println("Hello back to You!")
    case _ => println("huh?")
  }
}
