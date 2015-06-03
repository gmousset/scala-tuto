

package tuto

class Complex(real: Double, imaginary: Double) {
  def re: Double = real
  def im(): Double = imaginary
  
  override def toString(): String = "complex: " + re + " " + im
  //override def toString() = "complex: " + re + " " + im
}

object ComplexNumber {
  def main(argv: Array[String]) {
    val cplx1 = new Complex(1.0, 2.2)
    println(cplx1)
  }
}