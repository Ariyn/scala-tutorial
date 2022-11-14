object Main extends App {
  var dayOfWeek: DayOfWeek = Sunday
  println(dayOfWeek)

  var invalidDayOfWeek: DayOfWeek = 1
  println(invalidDayOfWeek)
}

sealed trait DayOfWeek
case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek
