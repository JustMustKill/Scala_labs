import org.scalatest.funsuite.AnyFunSuite
class test_lab_2 extends AnyFunSuite {
  test("task1") {
    val array: List[Int] = List(10, 2, -5, -8, 3, -7, 1, 5, 7, -12, 5, -12, 5, 6, 7, -9)
    assert(lab_2.task1(array) === List(15, 11, 9, 5, 3, 2))
  }
  test("task2") { 
    val array: List[Int] = List(10, 2, -5, -8, 3, -7, 1, 5, 7, -12, 5, -12, 5, 6, 7, -9, 10)
    assert(lab_2.task2(array) === 8)
  }
  test("task3") {
    val array: Map[Int, Int] = Map(1 -> 10, 2 -> 5, 3 -> 5, 4 -> 5, 5 -> 9, 6 -> 8, 7 -> 10, 8 -> 11, 9 -> 5, 10 -> 2)
    assert(lab_2.task3(array) === Map(5 -> 9, 10 -> 2, 1-> 10,6 -> 8, 9 -> 5, 2->5, 8 -> 11))
  }
}
