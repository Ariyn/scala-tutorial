object Main extends App {
  var p = new Person("BIll", "Panner")

  p.firstName = "minuk"
  p.lastName = "hwang"

  println(s"${p.firstName} ${p.lastName}")

}

class Person(val firstName: String, val lastName: String)
