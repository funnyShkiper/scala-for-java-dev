package cook_book.chapter_13_actors_and_cuncurrency

package object _9_simple_concurrency_with_futures {
  def sleep(i: Int): Unit = {
    Thread.sleep(i)
  }
}
