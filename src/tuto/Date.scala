package tuto

/**
 * @author gwen
 */
class Date(y: Int, m: Int, d: Int) extends Ord {
  
  def year = y
  def month = m
  def day = d
  
  override def toString(): String = year + "-" + month + "-" + day
  
  override def equals(that: Any): Boolean = {
    that.isInstanceOf[Date] && {
      val o = this.asInstanceOf[Date]
      o.day == day && o.month == month && o.year == year
    }
  }
  
  def <(that: Any) : Boolean = {
    if (!that.isInstanceOf[Date])
      error("not a Date object")  
    
    val o = that.asInstanceOf[Date]
    (year < o.year) || 
    (year == o.year && (month < o.month ||
                (month == o.month && day < o.day))) 
  }
}


object DateLaunch {
  
  def main(argv: Array[String]) {
    val d1 = new Date(2015, 6, 4)
    val d2 = new Date(2015, 6, 1)
    val d3 = new Date(2015, 6, 4)
    
    println("d1 > d2 : " + (d1 > d2))
    println("d1 <= d2 : " + (d1 <= d2))
    println("d1 == d3 : " + (d1 == d3))
  }
  
  def test(s: String) : Int = {
    4
  }
}