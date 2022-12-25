// NOTE:
// ALL OPERATORS IN SCALA are METHODS

object MethodNotations extends App{

    class Person(val name: String, favMovie: String){
        def likes(movie: String): Boolean = movie == favMovie

        def +(person: Person): String = s"This $name is hanging out with ${person.name}"

        def unary_! : String = s"$name what the heck !"

        def isAlive: Boolean = true

        def apply(): String = s"Hi, my name is $name. I like $favMovie"
    }


    /**
      * InFix Notation
    */

    val dp = new Person("Durga Prasad", "RRR")
    // Calling likes methods using dp object.
    println(dp.likes("RRR"))
    // Different way of calling, likes method using dp object. Both above and below are equivalent.
    println(dp likes "RRR")
    // Above is called Infix Notation or Operator Notation. (Syntactic Sugar) It only works with methods which have only one parameter.
    // object method parameter
    // Syntactic sugars are nicer ways of writing code, that are equivalent to more complex or more cumberstone ways pf wrtiing code. 1 + 2


    /**
      * Operator Notation.
    */
    // "operators" in scala.
    val ak = new Person("AK", "Avatar 2")
    println(dp.+(ak))
    // Infix stule
    println(dp + ak)
    // in scala we name the methods with the help of operators.
    // and expression dp + ak is a valid expression. Thats the fun with scala, when using operators as method name, they will be not the keywords.


    // + operator between the numbers is actually method as well, see below.
    println(1 + 2)  // 3
    println(1.+(2)) // 3


    /**
      * Prefix Notation
      * its all about unary operators.
      * -1 is equvialent to saying 1.unary_-
      * so, unary operators are methods with .unary_(operator). (operator can only be -, +, ~, !)
    */

    val x = -1
    val y = 1.unary_-

    println(x)  // -1
    println(y)  // -1

    println(dp.unary_!) // Durga Prasad what the heck !
    println(!dp)        // Durga Prasad what the heck !


    /**
      * Postfix Notation
      * The functions, that don't receive any parameters have the property that they can be used in postfix notation.
    */

    println(dp.isAlive)
    // println(dp isAlive)


    /**
      * apply()
      * apply() is special in Scala.
      * when an object is called like function, compiler does look out for apply() method within the class.
    */
    println(dp.apply())
    println(dp())   // it has same effect as above.



}