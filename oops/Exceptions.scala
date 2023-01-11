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
      * 
      */


}