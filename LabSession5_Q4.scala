object LabSession5_Q4 {
  def main(args: Array[String]): Unit = {
    println(isEvenIsOdd(5))
    println(isEvenIsOdd(8))
    println(isEvenIsOdd(-3))
  }

  def isEvenIsOdd(n: Int): String = n match {
    case 0 => "Even"
    case 1 => "Odd"
    case _ if n < 0 => isEvenIsOdd(-n)
    case _ => isEvenIsOdd(n - 2)
  }
}
