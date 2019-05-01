package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {

  def main(args: Array[String]): Unit = {
    println(fizzBuzz(11))
    println(fizzBuzz(13))
    println(fizzBuzz(51))
    println(fizzBuzz(45))
    println(fizzBuzz(55))
    println(fizzBuzz(11))
  }

  def fizzBuzz(number: Int): String = {

    var fizzFlag = false
    var buzzFlag = false
    var identicalDigits = true
    var deluxeFlag = false

    val numberArray = number.toString.toCharArray

    var tempChar: Char = ' '
    for(numberChar <- numberArray) {
      println(tempChar + "," + numberChar + ", " + tempChar.isSpaceChar)
      if(!tempChar.equals(numberChar) && !tempChar.isSpaceChar)
        identicalDigits = false
      tempChar = numberChar
    }

    if(number > 10 && identicalDigits)
      deluxeFlag = true
    if((number % 3 == 0) || (number.toString.contains("3")))
      fizzFlag = true

    if((number % 5 == 0) || (number.toString.contains("5")))
      buzzFlag = true

    if(fizzFlag && buzzFlag && deluxeFlag)
      "fizz buzz deluxe"
    else if(fizzFlag && buzzFlag)
      "fizz buzz"
    else if(fizzFlag)
      "fizz"
    else if(buzzFlag)
      "buzz"
    else
      number.toString

  }
}



