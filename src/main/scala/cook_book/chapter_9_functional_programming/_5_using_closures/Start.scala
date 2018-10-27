package cook_book.chapter_9_functional_programming._5_using_closures

import scala.collection.mutable.ArrayBuffer

object Start extends App {

  var votingAge = 18

  val isOfVotingAge = (age: Int) => age >= votingAge

  def printResult(f: Int => Boolean, age: Int): Unit = {
    println(f(age))
  }


  printResult(isOfVotingAge, 20)
  printResult(isOfVotingAge, 17)
  printResult(isOfVotingAge, 21)

  println("---------------")

  votingAge = 21
  printResult(isOfVotingAge, 20)
  printResult(isOfVotingAge, 17)
  printResult(isOfVotingAge, 21)


  val fruits = ArrayBuffer("apple")

  val addToBasket = (s: String) => {
    fruits += s
    println(fruits.mkString(", "))
  }

  def buyStuff(f: String => Unit, s: String): Unit = {
    f(s)
  }

  buyStuff(addToBasket, "bananas")
  buyStuff(addToBasket, "grapes")

}



