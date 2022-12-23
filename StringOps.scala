// String Operations in Scala.
object StringOps extends App{
    val str: String = "Hello, I am learning Scala."

    // charAt(index)
    println(str.charAt(1))

    // substring(inclusive index, exclusive index)
    println(str.substring(7, 11))

    // split(delimeter) = default return value will be Array.
    println(str.split(" ").toList)

    // startsWith("String") = returns true or false
    println(str.startsWith("Hello"))

    // replace("target", "replacement")
    println(str.replace(" ", "-"))

    // toLowerCase() and toUpperCase()
    println(str.toLowerCase())

    //length()
    println(str.length())

    // Above methods are form Java
    // Scala has its own utilites.

    // Converting a string to integer.
    val aNumberString = "2"
    val aNumber = aNumberString.toInt

    // Prepending and appending strings in scala.
    // +: used for prepending.
    // :+ used for appending.
    // while adding to a String use single quotes (') and while adding to a vector use double quotes (").
    println('a' +: aNumberString :+ 'z')    // return string.
    println("a" +: aNumberString :+ "z")    // return vetor.Vector(a, 2, z)

    // Reverse a string in scala.
    println(str.reverse)

    // if you want to take 2 characters out of string use take()
    println(str.take(2))    // he

    // Scala specific Stirng interpolators

    // S-interpolators
    val name = "David"
    val age = 12
    val greeting = s"Hello, my name is $name and I am $age years old."  // s-interpolated string.
    val anotherGreeting = s"Hello, my name is $name and I will turing ${age + 1} years old."  // s-interpolated string. with expression within { }

    println(greeting)
    println(anotherGreeting)

    // F-interpolators
    // These can do same as s-interpolators. but also they can
    // receive printf like formats.
    val speed = 1.2f
    val myth = f"$name%s can eat $speed%2.2f burgers per minutes"     // %2.2f means minimum 2 characters and 2 characters after precision.
    println(myth)

    // if tyeps doesn't match, then compiler will issue an error.
    // example speed is float, but if you specify %d which is for int its gonna throw an error.

    // RAW - interpolator
    // works same as s-interpolator, although it has a property which can print properties literally. Means escape sequence characters will also be printed.
    println(raw"This is a \n newline")       // output: This is a \n newline
    
    val escape = "This is a \n newline"     // However when you inject these escape sequence characters in varibale and use raw on them while printing. Then they can escape.
    println(raw"$escape")                   // output: This is a (and in new line) newline
    

}