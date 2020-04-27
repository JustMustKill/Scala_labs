import scala.annotation.tailrec
import scala.io.StdIn

object task_2 {
  def fun(array:List[Int], i:Int, len:Int, result:List[Int]=Nil):List[Int] ={
    if(i>=2) {
      if (array(i) < (array(i - 2) - array(i - 1))){
        fun(array, i-1,len,result).:+(array(i))
      }
      else
      fun(array, i-1,len,result)
    }
    else
   result
  }
  @tailrec
  def fun1(array:List[Int], i:Int, len:Int, result:List[Int]=Nil):List[Int] ={
    if(i>=2) {
      if (array(i) < (array(i - 2) - array(i - 1))){
        fun1(array, i-1,len,array(i)::result)
      }
      else
        fun1(array, i-1,len,result)
    }
    else result
  }
  def main(args: Array[String]): Unit = {
    println("Enter size of list")
    //val len:Int = StdIn.readInt()
    println("Enter numbers ")
    //val array:List[Int]= List.tabulate(len)(n=>StdIn.readInt())
    val len:Int=10
    val array:List[Int]=List(5,1,3,4,6,7,6,9,5,1)
    println()
    println(fun(array, len-1 ,len))
    println(fun1(array, len-1 ,len))
  }
}