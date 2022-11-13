object Main extends App {
  try {
    val foo = "foo".toInt
  } catch {
    case e: Exception => e.printStackTrace
    case _: Throwable => println("some other exception")
  } finally {
    println("exception recovered")
  }
}

