object Main extends App {
  val s1 = new Socket()
  val s2 = new Socket(1000)
  val s3 = new Socket(4000, 6000)

  println(s1)
  println(s2)
  println(s3)

}

class Socket(var timeout: Int = 2000, var linger: Int = 3000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}
