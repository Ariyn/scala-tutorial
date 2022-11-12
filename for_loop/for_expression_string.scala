val names = List("adam", "david", "frank")

object Main extends App {
  val capNames = for(n <- names) yield n.capitalize

  println(capNames)

  val capNames2 = names.map( n => n.capitalize )
  println(capNames2)
}
