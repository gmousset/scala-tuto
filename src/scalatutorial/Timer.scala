
package scalatutorial

object Timer {
  def timeFlies() {
    println("hop... ")
  }
  
  def oncePerSecond(callback: () => Unit) {
    while(true) {
      callback()
      Thread sleep 1000
    }
  }
  
  def main(argv: Array[String]) {
    oncePerSecond(timeFlies)
  }
}