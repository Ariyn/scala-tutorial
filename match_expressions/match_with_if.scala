val nums = 1 to 10

object Main extends App {
  val mappedNums = for( n <- nums) yield someMapper(n)

  println(mappedNums)

}

def someMapper(i: Int): String = i match {
  case 1 => "one"
  case x if 2 to 4 contains x => "2 to 4"
  case x if x == 5 || x < 7 => "i equals 5 and lower then 7"
  case _ => "don't care"
}
