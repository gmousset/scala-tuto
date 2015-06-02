
object TimeAnonymous {
 
  def oncePerSecond(callback: () => Unit) {
    while(true) {
      callback()
      Thread sleep 1000
    }
  }
  
  def main(argv: Array[String]) {
    oncePerSecond(() => println("hop..."))
  }
}