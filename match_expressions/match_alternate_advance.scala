val numbers = 0 to 11
val cmds = List("start", "go", "stop", "quit", "exit", "resume", "pause")

object Main extends App {
  numbers.foreach(i => println(s"${i} is ${oddEven(i)}"))

  cmds.foreach(i => println(s"${i} is ${cmdCase(i)}"))
}

def oddEven(i: Int):String = i match {
  case 1 | 3 | 5 | 7 | 9 => "odd"
  case 2 | 4 | 6 | 8 | 10 => "even"
  case _ => "other number"
}

def cmdCase(cmd: String): String = cmd match {
  case "start" | "go" => "starting"
  case "stop" | "quit" | "exit" => "stopping"
  case _ => "unknown cmd"
}
