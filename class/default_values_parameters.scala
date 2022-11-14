object Main extends App {
  val s1 = new Socket(timeout=2000, linger=3000) 
  println(s1)
}

class Socket(var timeout: Int=1000, var linger: Int=1000) {
  override def toString: String = s"timeout = $timeout, linger = $linger"
}
