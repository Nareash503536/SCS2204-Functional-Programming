package Tutorial_05

object Q_4 {

  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def main(args: Array[String]) = {
    println(isEven(5))
  }
}
