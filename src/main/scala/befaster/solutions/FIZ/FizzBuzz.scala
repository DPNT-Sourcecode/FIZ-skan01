package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {

  def main(args: Array[String]): Unit = {
    println(fizzBuzz(11))
    println(fizzBuzz(13))
    println(fizzBuzz(51))
    println(fizzBuzz(45))
    println(fizzBuzz(55))
    println(fizzBuzz(33))
  }

  def fizzBuzz(number: Int): String = {

    var fizzFlag = false
    var buzzFlag = false
    var deluxeFlag = false
    var fakeDeluxeFlag = false

    val numberList = number.toString.map(_.asDigit).toList

    //deluxe check
    if(number > 10) {
      val distinctNums = numberList.distinct
      if(distinctNums.size == 1) {
        if(number % 2 == 0)
          deluxeFlag = true
        else
          fakeDeluxeFlag = true
      }


    }

    if((number % 3 == 0) || (number.toString.contains("3")))
      fizzFlag = true

    if((number % 5 == 0) || (number.toString.contains("5")))
      buzzFlag = true

    if(fizzFlag && buzzFlag && deluxeFlag)
      "fizz buzz deluxe"
    else if(fizzFlag && deluxeFlag)
      "fizz deluxe"
    else if(buzzFlag && deluxeFlag)
      "buzz deluxe"
    else if(deluxeFlag)
      "deluxe"
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


