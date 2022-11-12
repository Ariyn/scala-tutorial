val nums = Seq(1,2,3)

object Main extends App {
  val doubledNumbers = for (n <- nums) yield n * 2;

  println(doubledNumbers)
}
