package scalabyexample

/**
 * @author gwen
 */
class PolygonCollection[+A] {
  
  def push[B >: A](e: B) = println("push an element")
}

/*
object PolygonManager {
  
  def main(argv : Array[String]) {
    val polygonCollection = new PolygonCollection[Polygon]
    val r1 = new Rectangle
    polygonCollection.push(r1)
    
    
    
    //val rectangleCollection = new PolygonCollection[Rectangle]
  }
  */
//}