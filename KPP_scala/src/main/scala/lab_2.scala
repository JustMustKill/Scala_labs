//9.Найти в коллекции индексы всех отрицательных элементов.
object lab_2 {
  def task1(array:List[Int], i:Int = 0, result:List[Int] = List()):List[Int] ={
    if(i<array.length) {
      if (array(i) < 0){
        task1(array, i+1,result).:+(i)
      }
      else
        task1(array, i+1,result)
    }
    else
      result
  }
  //6.Реализовать функцию, которая подсчитывает сумму всех элементов в List[Int].
  def task2(array:List[Int]):Int = {
    array.fold(0)(_ + _)
  }
  //6.Убрать из Map некоторые ключи таким образом, чтобы результирующий Map содержал только уникальные значения.
  def task3(array:Map[Int, Int], i:Int = 0):Map[Int,Int] ={
    var result:Map[Int,Int]=array
    for(i<-0 until (result.size)){
      for(j<-i+1 until (result.size)){
        if(result.get(i)==result.get(j)){
          result-=j
          j-1
        }
      }
    }
    result
  }
}