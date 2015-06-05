
package scalatutorial

object TreeLaunch {
  
  type Environment = String => Int;
  
  def eval(t: Tree, env: Environment) : Int =
    t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }
  
  def main(argv: Array[String]) {
    val tree: Tree = Sum(Const(1), Var("y"))
    val env: Environment = {case "x" => 2 case "y" => 4}
    val result = eval(tree, env)
    println("result: " + result)
  }
}