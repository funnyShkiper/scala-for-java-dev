package cook_book.chapter_13_actors_and_cuncurrency._2_creating_actor_with_constructor

import akka.actor.{Actor, ActorSystem, Props}

object Start extends App {
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props(new HelloActor("Fred")), name = "helloactor")
  helloActor ! "hello"
  helloActor ! "beunos dias"

  system.terminate
}

class HelloActor(myName: String) extends Actor {
  override def receive: Receive = {
    case "hello" => println(s"Hello from $myName")
    case _ => println(s"'huh?', said $myName")
  }
}