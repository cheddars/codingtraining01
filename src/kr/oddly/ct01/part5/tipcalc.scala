package kr.oddly.ct01.part5

import scala.io.StdIn._

object TipCalc {
  def main(args: Array[String]): Unit = {
    println("Input :")
    val amt = readLine("  bill amount : ")
    val tipRate = readLine("  tip rate : ")
    
    print("Expecte Result: ")
    if(amt.isNumeric && tipRate.isNumeric){
      val tip = calcTip(amt.toDouble, tipRate.toDouble)   
      println(tip)
    }else{
      println("Please enter a valid number for the bill amount.")
    }
  }
  
  def calcTip(amt: Double, rate: Double) = {
    (math rint amt / 100 * rate)
  }
  
  implicit class OpsNum(val str: String) extends AnyVal {
    def isNumeric() = scala.util.Try(str.toDouble).isSuccess
  }
}
