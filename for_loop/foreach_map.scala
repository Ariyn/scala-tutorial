val ratings = Map(
  "Lord Of The Ring" -> 5.0,
  "Hobbit" -> 9.9
)

object Main extends App {
  ratings.foreach {
    case(name, rating) => println(s"name: ${name}, rating: ${rating}")
  }
}
