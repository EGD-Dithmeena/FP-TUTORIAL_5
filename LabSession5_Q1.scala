object LabSession5_Q1 {
  def prime(n: Int, d: Int = 2): Boolean = n match {
    case x if x <= 1 => false
    case x if x == d => true
    case x if x % d == 0 => false
    case x => prime(x, d + 1)
  }

  def main(args: Array[String]): Unit = {
    println(prime(5))
    println(prime(8))
  }
}
