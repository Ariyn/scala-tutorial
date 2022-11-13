// https://www.oreilly.com/library/view/scala-cookbook/9781449340292/ch03s17.html

object Main extends App {
  var foo = "foo"

  try {
    val x = foo.toInt
    println(x)
  } catch {
    case e: Exception => e.printStackTrace
  }
}
