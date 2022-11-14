object Main extends App {
  val a = 1
  val b = 3

  val result = addThenDouble(a, b)

  println(result) // 8

}

def addThenDouble(a: Int, b: Int):Int = {
  val sum = a + b
  val doubled = sum * 2
  doubled
}
