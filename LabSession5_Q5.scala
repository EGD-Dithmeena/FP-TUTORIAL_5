object LabSession5_Q5 {
  def main(args: Array[String]): Unit = {
    println(sumEvenNumbers(10))
    println(sumEvenNumbers(15))
  }

  def sumEvenNumbers(n: Int): Int = n match {
    case x if x <= 0 => 0
    case x if x % 2 == 0 => x + sumEvenNumbers(x - 2)
    case _ => sumEvenNumbers(n - 1)
  }
}
