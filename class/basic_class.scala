object Main extends App {
  val p = new Person("Bill", "Panner")

  println(s"${p.firstName} ${p.lastName}")

  p.firstName = "minuk"
  p.lastName = "hwang"

  println(s"${p.firstName} ${p.lastName}")
}

class Person(var firstName: String, var lastName: String)
