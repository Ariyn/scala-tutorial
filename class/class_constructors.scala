object Main extends App {
  println("create new instance")

  val p = new Person("Bill", "Panner")

  println("created")
}

class Person(var firstName: String, var lastName: String) {
  println("the construction begin")

  var age = 0

  private val HOME = System.getProperty("user.home")

  override def toString(): String = s"$firstName $lastName is $age years old"

  def printHome(): Unit = println(s"HOME = $HOME")
  def printFullName(): Unit = println(this)

  printHome()
  printFullName()
  println("you've reached the end of the constructor")
}
