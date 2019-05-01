package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {

  def fizzBuzz(number: Int): String = {

    var fizzFlag = false
    var buzzFlag = false

    if((number % 3 == 0) || (number.toString.contains("3")))
      fizzFlag = true

    if((number % 5 == 0) || (number.toString.contains("5")))
      buzzFlag = true

    if(fizzFlag && buzzFlag)
      "fizz buzz"
    else if(fizzFlag)
      "fizz"
    else if(buzzFlag)
      "buzz"
    else
      number.toString

  }
}




