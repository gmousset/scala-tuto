
package scalatutorial

import java.util.{Date, Locale}
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    //val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE)
    //println(df.format(now))
    println(df format now)
  }
}