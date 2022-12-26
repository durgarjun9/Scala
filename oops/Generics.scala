import java.security.InvalidKeyException
// Generics in Scala
object Generics extends App {
    // when we pass value to a class within the [], those values will be treated as Generic.
    // MyList is a Generic class here.
    class MyList[+A] {
        // use the A in within the class Defintion
        def add[B >: A](element: B): MyList[B] = ???
        /**
          * A = Cat
          * B = Dog -> ANimal
          * 
          */
        
    }

    // Generics can also be placed on TRAITS.

    // key and value are Generic types.
    class MyMap[Key, Value] {

    }

    val listOfIntegers = new MyList[Int]
    val listOfStrings = new MyList[String]


    // Generic Methods
    object MyList {
        def empty[A]: MyList[A] = ???
    }

    val emptyListOfIntegers = MyList.empty[Int]

    // Variance Problem
    class Animal
    class Cat extends Animal
    class Dog extends Animal

    // question is: If Cat extends ANimal, thus the list of cats will also extend list of animals.

    /**
      * 3 Possible anwers
      * 
      * 1 - yes, List[Cat] extends List[Animal] = COVARIANCE
      * We return list of animals
    */

    // +A means its a Covariant List
    class CovaraintList[+A]

    // using
    val animal: Animal = new Cat
    val animalList: CovaraintList[Animal] = new CovaraintList[Cat]

    // animalList.add(dog) ??? but adding a dog will throw error. 


    /**
      * 2. No, List of cats and list of animals are 2 separeate things.
    */
    // Invariance

    // without any symbol just pass A.
    class InvariantList[A]
    val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]


    /**
      * 3. Hell No, CONTRAVARIANCE
      * Opposite to COVARIANCE
    */

    // uses - symbol before the A
    class ContravariantList[-A]

    // Derived class on left and super class at right. Relation is Opposite.
    val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]


    // Example of Contravariant
    class Trainer[-A]
    val trainer: Trainer[Cat] = new Trainer[Animal]


    // Bounded Types
    // add restriction using <:
    // Class Cage only accepts type parameter A which subtypes of Animal
    // Upper bounded type is <:
    // Lower bounded type is >:
    class Cage[A <: Animal](animal: A)

    val cage = new Cage[Dog](new Dog)

    // class Car
    // val cage = new Cage(new Car)

    // bounded types solved the variance problem


    // Exercise
    // Expand my list to Generic,
    





}