object CaseClasses extends App{
    // case keyword
    case class Person(name: String, age: Int)

    // 1. class perameters are promoted to fields
    val jim = new Person("jim", 34)
    println(jim.name)   // here its a valid thing as its a case class. if its not a class erorr must have been throughn by compiler.

    // 2. Sensible toString
    println(jim.toString()) // output: Peroson(jim, 24), if its not a case class then output will be some object hashcode.
    println(jim)    // it converts interanlly to toString

    // 3. equals and hashcode implements OOTB
    val jim2 = new Person("jim", 34)
    println(jim == jim2)    // true. if not case class it must have been false.

    // 4. case classes have handy copy methods.
    val jim3 = jim.copy(age = 45)
    println(jim3)

    // 5. case classes have companion objects.
    val thePerson = Person  // thePerson is the companion object of case class Person.
    val mary = Person("Mary", 23)   // no new method, as case classes have apply method deafulty applied on the parameters of class.

    // 6. case classes are Serializable.
    // while using a distibuted framework like AKKA. case classes are good to use.


    // 7. case classes have extractor patterns.
    // case classes can be used, in pattern matching. 

    case object UnitedKingdom {
        def name: String = "The UnitedKingdom of Great Britan and Northen Island"
    }


    // Summary:
        // Quick lightweight data structures with little boilerplate.
        // companion objects are already implemented with the handy apply methods.
        // Sensible methods like equlas, hashCode and toString are already implemented.
        // AutoPromote Parameters to fields, without specifing var or val. default val.
        // Cloning, Serializable
        // case Objects

}