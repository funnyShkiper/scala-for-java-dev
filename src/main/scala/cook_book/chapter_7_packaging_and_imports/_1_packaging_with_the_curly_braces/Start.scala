package cook_book.chapter_7_packaging_and_imports._1_packaging_with_the_curly_braces



object Start extends App {
  val fooOrderEntry = new orderentry.Foo
  println(fooOrderEntry)

  val fooCustomers = new customers.Foo
  println(fooCustomers)

  val fooCustomersDatabase = new customers.database.Foo
  println(fooCustomersDatabase)

}

package orderentry {
  class Foo {
    override def toString: String = "I am orderEntry."
  }
}

package customers {

  class Foo {
    override def toString: String = "I am customers.Foo."
  }

  package database {

    class Foo {
      override def toString: String = "I am customers.database.Foo."
    }

  }
}
