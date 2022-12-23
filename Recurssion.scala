/**
  * There are two types of recurssions.
  * 1. Stack 2. Tail
  * Stack based approach can run out of Stack memory and can throw StackOverflow Error.
  * In Tail, we use accumalator rather than stack based approach so that we will not go back to previous function call.
  */

object Recurssion extends App{
    // Concate a String N times. Using Tail Recursive Approach.
    // To make sure our compiler gets this fucntion as Tail Recursive, add @tailrec annotaion on top of the function.
    // @tailrec
    def concateString(name: String, n: Int, accumalator: String): String = {
        if (n<=0) accumalator
        else concateString(name, n-1, accumalator + name)
    }
    println(concateString("Durga ", 5, ""))

    // IsPrime Function using Tail Recursive Approach.
    def isPrime(num: Int): Boolean = {
        def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean = {
            if (!isStillPrime) false
            else if (t <= 1) true
            else isPrimeUntil(t-1, (num % t != 0) && isStillPrime)
        }
        isPrimeUntil(num/2, true)
    }
    println(isPrime(10))
    println(isPrime(5))

    // Fibonocci Number using Tail Recursive Approach
    def getFibonocci(n: Int): BigInt = {
        def fiboHelper(i: BigInt, last: BigInt, nextLast: BigInt): BigInt = {
            if(i >= n) last
            else fiboHelper(i + 1, last + nextLast, last)
        }
        if(n <= 2)  1
        else fiboHelper(2, 1, 1)
    }

    println(getFibonocci(8))
}