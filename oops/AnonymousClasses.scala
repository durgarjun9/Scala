object AnonymousClasses extends App{


    abstract class Animal {
        def eat: Unit
    }

    // Anonymous class, we wrote new class implemention while intializing the class.
    // Internally Scala creates a class for the anonymus class and converts the line 10 to val funnyAnimal: Animal = new AnnonymusClasses$$anony$1
    val funnyAnimal: Animal = new Animal {
        override def eat: Unit = println("hahahahha")
    }
    
    println(funnyAnimal.getClass())

    class Person(name: String){
        def sayHi: Unit = println(s"Hi, my name is $name, how can I help")
    }
    // Definetly need to pass the parameters if the original class has the parameters in it. else its fine.
    val jim = new Person("Jim") {
        override def sayHi: Unit = println("Hi, my name is Jim. How may I assist you.")
    }

}