package part2basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object TailRecursion extends App {


  def efficientFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x-1, x*accumulator)
    }
    factorialHelper(n,1)
  }

//  println(efficientFactorial(5000))

  def efficientFibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(x: Int, a: Int, b: Int): Int = {
      if (x==0) a
      else if (x == 1) b
      else fibonacciHelper(x-1,b,a+b)
    }

    fibonacciHelper(n,0,1)
  }

  println(efficientFibonacci(8))

  def isPrime(number: Int): Boolean = {
    def isPrimeUntil(num: Int): Boolean = {
      if (num <= 1) true
      else number % num != 0 && isPrimeUntil(num - 1)
    }
    isPrimeUntil(number / 2)
  }

  def efficientIsPrime(n: Int): Boolean = {
    def isPrimeHelper(x: Int, accumulator: Boolean): Boolean = {
      if (x <= 1) accumulator
      else isPrimeHelper(x-1, n % x != 0 && accumulator)
    }
    isPrimeHelper(n/2,true)
  }
  println(efficientIsPrime(16))

}
