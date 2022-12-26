// Inheritance in Scala
object Inheritance extends App {
    
    // As most languages scala supports Single Level Inheritance.
    class Animal {
        val creatureType: String = "wild"
        def eat = println("nomnom")
    }

    // Single level Inheritance
    class Cat extends Animal {
        def crunch = {
            eat
            println("crunch crunch")
        }
    }

    val cat = new Cat
    // cat.eat  -> eat is protected so cannot be accessed.
    cat.crunch

    /**
      * Constructors
    */
    class Person(name: String, age: Int){
        def this(name: String) = this(name, 0)

    }
    
    // you dont have a constructore without parameters, so specifing extends Person will not be enough, you need to pass the arguments to the defined constructor as extends Person(name, age)
    class Adult(name: String, age: Int, idCard: String) extends Person(name)

    // overriding
    class Dog(override val creatureType: String) extends Animal{
        // override val creatureType: String = "domestic"
        override def eat = {
            super.eat
            println("crunch, crunch")
        }
    }

    // class Dog(val dogType: String) extends Animal{
    //     override val creatureType: String = "domestic"
    //     override def eat: Unit = println("Crunch, Crunch")
    // }

    val dog = new Dog("K9")
    dog.eat
    println(dog.creatureType)
    // println(dog.dogType)

    // Type Substitution -> polymorphism
    val unknownAnimal: Animal = new Dog("K9")
    unknownAnimal.eat

    // OverRiding vs OverLoading

    // super
    // super.eat within def eat in Dog.

    // Preventing overrides.
    // When cases are you need to limit overrides on your fields and methods
    // 1- use keyword final. if you put final on val or var or method, derived classes cannot override the Derived memebers or methods.
    // 2 - Final can be used on the class itself. no class can derive from final classes.
    // Numerical classes in scala are Final and also String class.
    // 3 - seal teh class. = can extend the classes in this file only, but prevents extension in other files. keyword "sealed"
    

}