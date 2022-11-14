object Main extends App {
  val a = 1
  val doubledA = double(a)

  println(doubledA)
}

def double(a: Int): Int = a * 2
