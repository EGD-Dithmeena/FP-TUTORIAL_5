object LabSession5_Q6 {
  def main(args: Array[String]): Unit = {
    printFibonacci(10)
    printFibonacci(6)
    printFibonacci(-5)
  }

  def printFibonacci(n: Int): Unit = {
    def fibonacci(num: Int): Int = num match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(num - 1) + fibonacci(num - 2)
    }

    if (n <= 0) {
      println("Invalid input. Please provide a positive integer.")
    } else {
      for (i <- 0 until n) {
        print(fibonacci(i) + " ")
      }
      println()
    }
  }
}
