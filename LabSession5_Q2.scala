object LabSession5_Q2 {
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

  def primeSeq(n: Int, curNum: Int = 2): Unit = {
    if (curNum < n) {
      if (prime(curNum)) {
        println(curNum)
      }
      primeSeq(n, curNum + 1)
    }
  }

  def prime(n: Int, d: Int = 2): Boolean = n match {
    case x if x <= 1 => false
    case x if x == d => true
    case x if x % d == 0 => false
    case x => prime(x, d + 1)
  }
}
