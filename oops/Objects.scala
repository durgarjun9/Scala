// Objects in Scala.
object Objects{
    // Scala doesn.t have static keyword.
    // It has even better which is object.
    // A object can have static like functionality.

    /**
      * Java code using static.
      * class Person{
      *     public static final int N_EYES = "2";
      * }
      * System.out.println(Person.N_EYES)
    */
    // As Scala doesn't have static it can use object as below:
    // Objects can contain, vars, vals and methods. 
    // object cannot contain parameters as class. object Person(parameters)
    object Person{
        // Class or Static level Functionality
        val N_EYES = 2
        def canFly: Boolean = false

        // Factory method. The sole purpose of this method is to create a Person Instance.
        // def from(mother: Person, father: Person) = new Person("Bobbie")
        // Instead of calling these methods with other names, they generally call these with apply()
        def apply(mother: Person, father: Person) = new Person("Bobbie")
    }

    // Generally we have object and person of same name.
    class Person(val name: String) {
        // Instance Level Functionality

    }

    def main(args: Array[String]): Unit = {
        // This pattern of writing object and class in the same scope is called COMPANIONS.
        println(Person.N_EYES)
        println(Person.canFly)
        // In Scala, we use object as a  Singelton Instance.
        val mary = Person     // dp is the instance of only instance Person. Person and dp are both equivalent.
        val jhon = Person
        println(mary == jhon)    // true, as dp and arjun are pointed to same instance.
        // In scala, a class can be Instantiated multiple time. TO create a Instance just use "new" keyword.
        val person1 = new Person("Mary")
        val person2 = new Person("John")
        println(person1 == person2)
        // val bobbie = Person.from(person1, person2)
        // val bobbie = Person.apply(person1, person2)
        val bobbie = Person(person1, person2)
        println(bobbie.name)
        
    }

   
    

    /**
      * Scala Application = Scala object with def main(args: Array[String]): Unit
      * If we remove the extends App from the Objects object, then Scala will not run the file as before, bcoz jvm tries to find the main method and will run it.
      * But as we have removed App extension, now we need to define the main() or else it will not run our code.
    */
   

}