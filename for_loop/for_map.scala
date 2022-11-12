val ratings = Map(
  "바람과 함께 나타나다" -> 3.0,
  "12명의 행복한 사람들" -> 4.0,
)

object Main extends App {
  for ((name, rate) <- ratings)
    println(s"${name} is ${rate}")
}
