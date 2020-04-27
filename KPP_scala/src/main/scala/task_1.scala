import scala.annotation.tailrec
import scala.io.StdIn

object task_1 {
  @tailrec
  def fun(num: Int, str: String) :String = {
    if(num > 90)  str
    else{
      val a:Char = num.toChar
      val b:Char = (num+32).toChar
      val str1 = str.replace(a, b)
      fun(num+1, str1)
    }
  }
  def fun1(num: Int, str: String) :String = {
    if(num < 90) {
      val a: Char = num.toChar
      val b: Char = (num + 32).toChar
      val str1 = str.replace(a, b)
      fun1(num + 1, str1) + ""
    }
    else str
  }
  def main(args: Array[String]): Unit = {
    println("Enter sting")
    val str = StdIn.readLine()
    println("Function without tail recursion: "+fun1(65, str))
    println("Function with tail recursion: "+fun(65, str))
  }
}