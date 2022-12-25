object MethodNotations extends App{

    class Person(val name: String, favMovie: String){
        def likes(movie: String): Boolean = movie == favMovie

        def hangOutWith(person: Person): String = s"This $name is hanging out with ${person.name}"
    }

    val dp = new Person("Durga Prasad", "RRR")
    // Calling likes methods using dp object.
    println(dp.likes("RRR"))
    // Different way of calling, likes method using dp object. Both above and below are equivalent.
    println(dp likes "RRR")
    // Above is called Infix Notation or Operator Notation. It only works with methods which have only one parameter.
    // object method parameter


    // "operators" in scala.
    println(dp.hangOutWith(new Person("AK", "Avatar 2")))
    

}