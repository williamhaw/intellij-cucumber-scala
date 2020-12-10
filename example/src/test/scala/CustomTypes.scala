import io.cucumber.scala.ScalaDsl

trait CustomTypes extends ScalaDsl {
  ParameterType("speed", ".*\\s+km/h") { speed: String => Speed(speed.split(' ').head.toDouble) }
  ParameterType("time", ".*\\s+h") { time: String => Time(time.split(' ').head.toDouble) }

  ParameterType("speed-m-s", ".*\\s+m/s") { speed: String => Speed(speed.split(' ').head.toDouble) }
  ParameterType("time-s", ".*\\s+s") { time: String => Time(time.split(' ').head.toDouble) }
}

case class Speed(kmPerHour: Double)
case class Time(hours: Double)
