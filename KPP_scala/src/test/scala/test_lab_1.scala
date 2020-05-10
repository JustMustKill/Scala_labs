import org.scalatest.funsuite.AnyFunSuite
class test_lab_1 extends AnyFunSuite {
  test("Tail recursion str") {
    val str: String = "HELLO WORLD"
    val result:String = "hello world"
    assert(task_1.fun(65,str)===result)
  } 
  test("Recursion str") {
    val str: String = "HELLO WORLD"
    val result:String = "hello world"
    assert(task_1.fun1(65,str)===result)
  }
  test("All str") {
    val str: String = "HELLO WORLD"
    val result:String = "hello world"
    assert(task_1.fun1(65,str)===task_1.fun(65,str))
  }
  test("Tail recursion list"){
    val len:Int=10
    val list:List[Int]=List(5,1,3,4,6,7,6,9,5,1)
    assert(task_2.fun1(list, len-1, len)===List(3,1))
  }
  test("Recursion list"){
    val len:Int=10
    val list:List[Int]=List(5,1,3,4,6,7,6,9,5,1)
    assert(task_2.fun(list, len-1, len)===List(3,1))
  }
}
