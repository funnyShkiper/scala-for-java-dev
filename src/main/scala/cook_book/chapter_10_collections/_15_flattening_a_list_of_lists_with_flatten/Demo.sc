val listOfTheLists = List(List(1, 2), List(3, 4))
val result = listOfTheLists.flatten


val myFriends = List("Adam", "David", "Frank")
val adamsFriends = List("Nick K", "Bill M")
val davidsFriends = List("Becca G", "Kenny D", "Bill M")

val friendOfFriends = List(adamsFriends, davidsFriends)
friendOfFriends.flatten.distinct.map(_.capitalize)






