package cook_book.chapter_13_actors_and_cuncurrency._5_starting_an_actor

import akka.actor.{Actor, ActorSystem, PoisonPill, Props}

object Start extends App {

  val system = ActorSystem("ParentChildTest")

  val parent = system.actorOf(Props[Parent], name = "Parent")

  parent ! CreateChild("Jonathan")
  parent ! CreateChild("Jordan")
  Thread.sleep(500)

  println("Sending Jonathan a PoisonPill ...")
  val jonathan = system.actorSelection("/user/Parent/Jonathan")
  jonathan ! PoisonPill
  println("Jonathan was killed!")

  Thread.sleep(500)
  system.terminate
}

case class CreateChild(name: String)
case class Name(name: String)

class Child extends Actor {
  var name = "No name"

  override def postStop(): Unit = {
    println(s"D'oh They killed me ($name): ${self.path}")
  }

  override def receive: Receive = {
    case Name(name) => this.name = name
    case _ => println(s"Child $name got message.")
  }
}

class Parent extends Actor {
  override def receive: Receive = {
    case CreateChild(name) =>
      println(s"Parent about to create Child ($name)")
      val child = context.actorOf(Props[Child], name = s"$name")
      child ! Name(name)
    case _ => println(s"Parent got some other message.")
  }
}




