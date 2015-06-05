package scalatutorial

/**
 * @author gwen
 */
class CDate(y: Int, m: Int, d: Int) extends Ord {
  
  def year = y
  def month = m
  def day = d
  
  override def toString(): String = year + "-" + month + "-" + day
  
  override def equals(that: Any): Boolean = {
    that.isInstanceOf[CDate] && {
      val o = this.asInstanceOf[CDate]
      o.day == day && o.month == month && o.year == year
    }
  }
  
  def <(that: Any) : Boolean = {
    if (!that.isInstanceOf[CDate])
      error("not a Date object")  
    
    val o = that.asInstanceOf[CDate]
    (year < o.year) || 
    (year == o.year && (month < o.month ||
                (month == o.month && day < o.day))) 
  }
}


object DateLaunch {
  
  def main(argv: Array[String]) {
    val d1 = new CDate(2015, 6, 4)
    val d2 = new CDate(2015, 6, 1)
    val d3 = new CDate(2015, 6, 4)
    
    println("d1 > d2 : " + (d1 > d2))
    println("d1 <= d2 : " + (d1 <= d2))
    println("d1 == d3 : " + (d1 == d3))
  }
  
  def test(s: String) : Int = {
    4
  }
}