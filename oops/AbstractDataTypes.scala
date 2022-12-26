
// situations where you need to leave members and methods blank, those are called Abstract.
object AbstractDataTypes extends App{
    // Predef.println("Hello Worlds")


    // Abstract Class Animal
    abstract class Animal {
        val creatureType: String = "wild"
        def eat: Unit
    }
    // Abstract classes cannot be Instantiated. Abstract class can only be extended by classes and implemented by Derived classes.

    class Dog extends Animal {
        override val creatureType: String = "K9"
        def eat: Unit = println("crunch crunch")

    }

    /** Traits
      * created using keyword called trait
      * 
    */
    trait Carnivore {
        def eat(animal: Animal): Unit
        val prefereedMeal = "Fresh Meat"
    }

    trait ColdBlooded

    class Crocodile extends Animal with Carnivore with ColdBlooded {
        override val creatureType: String = "Croc"
        def eat: Unit = println("nomnom")
        def eat(animal: Animal): Unit = println(s"I am croc and I am eating ${animal.creatureType}")
    }    

    val dog = new Dog
    val croc = new Crocodile
    croc.eat(dog)

    // Traits vs Abstract Classes
    // Abstract classes can have abstract and non-abstract types. Where as Traits can also have both abstract and non-abstract tyypes.
    // 1. Traits dont have construtor prarmeters.
    // 2. yoiu can only extend one class, but you can mix in multiple triats by the same class.
    // 3. traits are behavioural, abstract class is a type of thing.


}