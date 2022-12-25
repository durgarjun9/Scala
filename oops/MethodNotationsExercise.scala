object MethodNotationsExercise extends App{
    
    class Person(val name: String, favMovie: String, var age: Int = 0){
        def likes(movie: String): Boolean = movie == favMovie

        def +(person: Person): String = s"This $name is hanging out with ${person.name}"
        def +(nickName: String): String = s"new person \"$name ($nickName)"

        def unary_! : String = s"$name what the heck !"

        def isAlive: Boolean = true

        def apply(): String = s"Hi, my name is $name. I like $favMovie"

        def unary_+ : Person = new Person(name, favMovie, age + 1)

        def learns(course: String): String = s"$name learns $course"

        def learnsScala: String = learns("scala")
    }
    
    /**
      * 1. overlaod the + operator, which receives String. And returns the new person with nick name.
      * dp + "chiki"  => new person "Durga Prasad (chiki)"
    */
    val dp = new Person("Durga Prasad", "RRR")
    val ak = new Person("AK", "Avatar")
    println(dp + ak)
    println(dp + "chikki")
    

    /**
      * 2. Add an age to Person class with default 0 value.
      * Add a unary + operator to increments the age of the person and returns new person.
    */
    val elderPerson = +dp
    println(s"Age of younger dp: ${dp.age}")
    println(s"Age of younger elder dp: ${elderPerson.age}")


    /**
      * 3. Add learns() in Person calss.
      * recieves string parameter and returns  dp learns scala(passed value)
      * Add learnsScala method, no param, it calls learns() with scala as param
      * use it in postfix notation.
    */
    println(dp.learnsScala)



}