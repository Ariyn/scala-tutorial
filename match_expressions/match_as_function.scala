object Main extends App {
  val booleanString = convertBooleanToStringMessage(false)

  println(booleanString)
}

def convertBooleanToStringMessage(bool: Boolean):String = bool match {
  case false => "false"
  case true => "true"
}
