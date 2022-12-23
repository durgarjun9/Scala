// Call By Name vs Call By Value functions

object CBNvsCBV extends App{
    
    def callByVaue(x: Long): Unit = {
        println("Call by value: " + x)
        println("Call by value: " + x)
    }


    // => this is what says to compiler that its a byName call.
    // => this is used in streams for lazy loading.
    def callByName(x: => Long): Unit = {
        // Internally println("Call by name: " + System.nanoTime())
        println("Call by name: " + x)
        // Internally println("Call by name: " + System.nanoTime())
        println("Call by name: " + x)
    }

    callByVaue(System.nanoTime())
    callByName(System.nanoTime())


    // Example of Lazy loading using =>
    
    // Infinte function.
    def infinte(): Int = 1 + infinte()
    def printFirst(x: Int, y: => Int) = println(x)

    // Program crashes with StackOverFlow error. As infinite() method, uses all the stack memory.
    // printFirst(infinte(), 24)

    // Whereas below code executes sucesfully, because as we used lazy operator, it only calls infinite() method, when y is used.
    // But y value is not used in the printFirst() definition, so infinite() will not be called.
    printFirst(24, infinte())


    /**
      * Summary of Call by value and Call by name
      * Call By Value:
        1. value is computed before the call.
        2. same value is used everywhere.
      * Call By Name:
        1. we need to use => operator.
        2. expression is passed, rather then value.
        3. expression is evaluated at every use within fucntion definition.
      */



}