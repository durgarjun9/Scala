// Default and Named Arguments in Scala.

// We can pass default values to function rater than calling the same function mutliple times with the same value.
// If we dont pass any value to that particular value, then the default vlaue is used or else it will use the passed vlaue.

// NOTE: Always pass the default  values as the end parameters to the methods.
// naming the passing arguments can also be done, when you have multiple default arguments.

object DefaultArgs extends App{
    

    def trFact(n: Int, acc: Int = 1): Int = 
        if (n <= 1) acc
        else trFact(n-1, n * acc)
    println(trFact(5, 1))   // Passing Accumalator value, so default value will not be used.
    println(trFact(5))      // Here trFact() will use Default value 1 for acc.
    println(trFact(8, 2))   // Passing Accumalator value, so default value will not be used.

    // Features comes with some side effects as well.
    // When you have multiple default values for a method and you want to pass value for one of the default value, then you face sideeffects
    // As compiler might not understand what value, u are sending among all arrguments.

    def savePicture(format: String = "JPEG", height: Int = 800, width: Int = 800): Unit = println("Saving picture." + height + " " + width)

    savePicture("GIF")
    // savePicture(800)    // Scala will not be understand for which argument u are passing 800 for height or width.
    savePicture("PNG", 1080)    // Scala will set 1080 for height, and for width it will use default.

    // from above we can understand different issues we are facing bcoz of the default aruments, so here we can use name to pass arguemnts to methods.
    savePicture(width = 1080)
    savePicture(format = "PNG", width = 9000, height= 10000)


}