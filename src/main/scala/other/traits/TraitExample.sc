trait Counter {
  var count = 0
  def increment()
}

class IncrementByOne extends Counter {
  override def increment(): Unit = count += 1
}

class ExponentialIncremental(rate: Int) extends Counter {
  override def increment(): Unit = if (count == 0) count = 1 else count *= rate
}

trait ACounter {
  var counter: Int
  def increment()
}

class AIncrementByOne extends ACounter {
  override var counter: Int = _
  override def increment(): Unit = counter += 1
}

