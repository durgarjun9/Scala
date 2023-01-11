import java.util.Arrays
object Exceptions extends App{


    val x: String = null
    // below will crash the program.
    // Null Pointer Exception
    // println(x.length())

    //1. throwing and catching exceptions.
    // below line is throwing an exception.
    // throw new NullPointerException

    // below variable doesn't hold any value, so below will be Nothing.

    // val aWeirdValue = throw new NullPointerException

    // Throwable classes extend the Throwable class.
    // Exception and Error are the major Throwable subtypes.

    // 2. Catching Exceptions.
    def getInt(withExceptions: Boolean): Int = {
        if(withExceptions) throw new RuntimeException("No int for you!")
        else 42
    }

    // we can assign below try-catch-finally expression to a variable. to check the value.

    val potentialFail = try{
        // Code that might throw.
        getInt(true)
        // below lines will not be executed as exception is thrown, and code controll will be now in catch.
        getInt(false)
    } catch {
        // if we below try to catch Null Pointer Exception than, our code cannot handle RuntimeException and code crashes.
        // So a valid exception need to be given in the catch block, else catching cannot be done, which results in carshing.
        case e: RuntimeException => println("Caught A Runtime Exception")
        // case e: RuntimeException => 43
    } finally {
        // Finally block is otpional, and finally will not impact the return type of the try catch expression.
        // Use finally only for side effects like logging to file.
        //  code that will be executed no matter what.
        // Even exception thrown or not thrown.
        println("finally")
    }

    println(potentialFail)  // output: ()
    // output is Unit as AnyVal will be specified by the compiler.
    // Now try block is returing Int and catch is returning Unit, so thats why the value of the try catch will be unit.
    // If try, catch return Int then the potentialFail variable will also return Int value.

    // 3. How to define your own Exceptions.
    class MyException extends Exception
    val exception = new MyException
    // throw exception // This will crash the program. Exceptions$MyException


    /** Excersise
      * 1. Crash your program with a OutOfMemoryError. -> When we try to access more memory than JVM has.
      * 2. Crash with StackOverFlowError.
      * 3. PocketCalculator
      *     add(a,b)
      *     multiply(a,b)
      *     divide(a,b)
      *     subtract(a,b)
      *    
      *     Throw
      *     - Overflow exception if add(a,b) exceeds Int.MAX_VALUE.
      *     - Underflow exception if subtract(a,b) exceeds Int.MIN_VALUE.
      *     - MathCalculationException for divison by 0.
      * 
    */

    // 1. Crash your program with a OutOfMemoryError.

    // val array: Array[Int] = Array.ofDim[Int](Int.MaxValue)
    // output of above line: Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit


    // 2. Crash with StackOverFlowError.
    def infinite: Int = 1 + infinite
    // val noLimit = infinite
    // Above line will cause a StackOverFlow Exception.

    // 3. PocketCalculator

    class OverFlowException extends Exception
    class UnderFlowException extends Exception
    class MathCalculationException extends Exception

    object PocketCalculator {
        def add(x: Int, y: Int): Int = {
            val result = x + y
            if(x > 0 && y > 0 && result < 0)    // if both inputs are positive but result is negative.
                throw new OverFlowException
            else if(x < 0 && y < 0 && result > 0)    // if both inputs are negative but result is positive.
                throw new UnderFlowException
            else result
        }

        def subtract(x: Int, y: Int): Int = {
            val result = x - y
            if(x > 0 && y < 0 && result < 0)    
                throw new OverFlowException
            else if(x < 0 && y > 0 && result > 0)    
                throw new UnderFlowException
            else result
        }

        def multiply(x: Int, y: Int): Int = {
            val result = x * y
            if(x > 0 && y > 0 && result < 0)    
                throw new OverFlowException
            else if(x < 0 && y < 0 && result < 0)    
                throw new OverFlowException
            else if(x > 0 && y < 0 && result > 0)    
                throw new UnderFlowException
            else if(x < 0 && y > 0 && result > 0)    
                throw new UnderFlowException
            else result
        }

        def divide(x: Int, y: Int): Int = {
            if (y == 0)
                throw new MathCalculationException
            else
                x / y
            
        }
    }

    // println(PocketCalculator.add(Int.MaxValue, 10)) // output: -2147483639      after Overflow defined output: Exceptions$OverFlowException
    // println(PocketCalculator.add(Int.MinValue, -1))    // Exceptions$UnderFlowException
    // From above line, we can say that there is no big value than Int.MaxValue in Integer.
    // next big value will be the negative value.

    
    // println(PocketCalculator.divide(2, 0))  // Exceptions$MathCalculationException



}