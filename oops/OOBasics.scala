/**
  * Object Oriented Programming with Scala.
  */

object OOBasics extends App{

    val person = new Person("John", 26)
    println(person.age)
    println(person.name)
    println(person.x)

    person.greet("Durga")
    person.greet()
    person.greetByThis()


}


// Class organizes data and behaviour (code)
// Class parameters(name, age) or not fields(class-variables), we cannot access them as person.age or person.name
// example: class Person(name: String, age: Int)    //constructor

// To convert a parameter to field, we must use val or var. as below:
    // Default values can also be passed to constructors also.
class Person(val name: String, val age: Int = 0){   // implementation of the class.
    //bpdy -> Implemention of class
    val x = 2

    println(1 + 3)      // Expression are executed during the Intialization of the class. so first output 4 will be printed. and later other.

    // Defining function in the classs. Behaviour of the class.
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")        // "this" refers to the class. this.name gives the name of person.name.

    // Function Overloading.
    def greet(): Unit = println(s"Hi, I am $name")      // we dont have any other name variable, so compiler understands programmer refering to person.name
    
    def greetByThis(): Unit = println(s"Hi, I am ${this.name}")     // here we can understadn this.name and name are same.


    // Overloading means, using the same method name for different functions but changing the parameters. but it cannot be overloaded with different return types.


    // Multiple Constructores or Overloading Constructors.
    // Auxilary Constructor calls the Primary constructor, or othr secondary constructor.
    def this(name: String) = this(name, 0)      // We can avoid this constructor by passing default value 0 to constructor varibale age.

    def this() = this("Durga Prasad")





}

