// Call By Name vs Call By Value functions

object CBNvsCBV extends App{
    
    def callByVaue(x: Long): Unit = {
        println("Call by value: " + x)
        println("Call by value: " + x)
    }


    def callByName(x: => Long): Unit = {
        println("Call by name: " + x)
        println("Call by name: " + x)
    }

    callByVaue(System.nanoTime())
    callByName(System.nanoTime())

}