package befaster.solutions.SUM

import befaster.runner.SolutionNotImplementedException

object Sum {

  def main(args: Array[String]): Unit = {
    val a = sum(10, 20)
    println(a)
  }
  def sum(x: Int, y: Int): Int = {
    x + y
  }
}

