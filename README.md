* 화면에 출력하는 방법
> println(), print()

* 사용자 입력을 받는 방법
> val input = scala.io.StdIn.readLine("prompt> ")

* numeric type check
def isAllDigits(x: String) = x forall Character.isDigit

parse dot(.)
  implicit class OpsNum(val str: String) extends AnyVal {
    def isNumeric() = scala.util.Try(str.toDouble).isSuccess
  }
“10.5”.isNumeric

* parse int
“10”.toInt,  “200.5”.toDouble

* rount scale
(math rint amt / 100 * rate)