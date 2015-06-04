package tuto

/**
 * @author gwen
 */
class Reference[T] {
  
  private var contents: T = _
  
  def set(value: T) {
    contents = value
  }
  
  def get: T = contents
}


object ReferenceLaunch {
  
  def main(args: Array[String]) {
    val cellInt = new Reference[Int]
    val cellString = new Reference[String]
    val cellBool = new Reference[Boolean]
    println("Int cell: " + cellInt.get)
    println("String cell: " + cellString.get)
    println("Bool cell: " + cellBool.get)
    cellInt.set(13)
    cellString.set("coucou")
    cellBool.set(true)
    println("-----------------------------------------------")
    println("Int cell: " + cellInt.get)
    println("String cell: " + cellString.get)
    println("Bool cell: " + cellBool.get)
    println("-----------------------------------------------")
  }
}