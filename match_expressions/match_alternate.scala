val cases = List(1, 0, true, false, "test", "")

object Main extends App {
  cases.foreach(i => {
    println(s"${i} is ${isTrue(i)}")
  })
}

def isTrue(a: Any) = a match {
  case 0 | "" | false => false
  case _ => true
}
