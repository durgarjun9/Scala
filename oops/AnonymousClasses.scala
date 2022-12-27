object AnonymousClasses extends App{


    abstract class Animal {
        def eat: Unit
    }

    // Anonymous class, we wrote new class implemention while intializing the class.
    val funnyAnimal: Animal = new Animal {
        override def eat: Unit = println("hahahahha")
    }
    
    println(funnyAnimal.getClass())


}