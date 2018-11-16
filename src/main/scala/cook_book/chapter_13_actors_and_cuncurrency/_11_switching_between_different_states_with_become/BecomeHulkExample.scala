package cook_book.chapter_13_actors_and_cuncurrency._11_switching_between_different_states_with_become

import akka.actor.{Actor, ActorSystem, Props}

object BecomeHulkExample extends App {

  val actorSystem = ActorSystem("BecomeHulkExample")
  val davidBanner = actorSystem.actorOf(Props[DavidBanner], name = "DavidBanner")

  davidBanner ! ActNormalMessage
  davidBanner ! TryToFindSolution
  davidBanner ! BadGuysMakeMeAngry

  // Message not received
  davidBanner ! TryToFindSolution
  
  Thread.sleep(1000)

  davidBanner ! ActNormalMessage


  actorSystem.terminate
}

case object ActNormalMessage
case object TryToFindSolution
case object BadGuysMakeMeAngry

class DavidBanner extends Actor {
  import context._

  def angryState: Receive = {
    case ActNormalMessage =>
      println("Phew, I'm back to being David!")
      become(normalState)
  }

  def normalState: Receive = {
    case TryToFindSolution =>
      println("Looking for solution to my problem")
    case BadGuysMakeMeAngry =>
      println("I'm getting angry ...")
      become(angryState)
  }

  override def receive: Receive = {
    case BadGuysMakeMeAngry => become(angryState)
    case ActNormalMessage => become(normalState)
  }
}






