package part2basics

object Functions extends App {

  def greetingFunction(name: String, age: Int): String = {
    val output = f"Hi, my name is $name and I am $age%d years old."
    output

  }

  println(greetingFunction("Sairam",28))

  def factorialNumber(number: Int): Int = {
    if (number == 1 ) number
    else number * factorialNumber(number - 1)

  }
  println(factorialNumber(5))

  def fibonacci(number: Int): Int = {
    if (number <= 1) number
    else fibonacci(number - 1) + fibonacci(number - 2)
  }

  println(fibonacci(8))

  def isPrime(number: Int): Boolean = {
    def isPrimeUntil(num: Int): Boolean = {
      if (num <= 1) true
      else number % num != 0 && isPrimeUntil(num - 1)
    }
    isPrimeUntil(number / 2)
  }

  println(isPrime(11))

}
