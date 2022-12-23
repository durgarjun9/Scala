import java.util.Date
object OOBasicsExercise extends App{

    // Exercise
    /**
      * Implement Novel and Writer Class.
      * Writer: firstName, surName and yearOfBirth
      *     -  method: fullName -> Concat of firstName and surName
      * Novel: name, yearOfRelease, author(instance of type writer)
      *     -  method: authorAge -> Age of the author @ year of release.
      *     -  method: isWrittenBy(author)
      *     -  method: copy (new year of release) - return new Instance of Novel with new year of release.
    */


    class Writer(firstName: String, surName: String, val yearOfBirth: Int){
        
        def getFullName(): String = s"$surName $firstName"

    }
    
    class Novel(name: String, var yearOfRelease: Int, author: Writer){
        def authorAge(): Int = 2022 - author.yearOfBirth
        def isWrittenBy(): String = author.getFullName()
        def copy(newYear: Int): Novel = {
            val novel = new Novel(this.name, newYear, author)
            novel
        }
    }

    val author: Writer = new Writer("Durga Prasad", "Lakumarapu", 1998)
    var novel: Novel = new Novel("My Life as Dev", 2020, author)
    println(novel.authorAge())
    println(novel.isWrittenBy())
    println(novel.yearOfRelease)
    novel = novel.copy(2022)
    println(novel.yearOfRelease)

    
  /**
    * Counter Class
        * - receives an Int value
        * method: returns currentCount()
        * method: Increment/ Decrement by 1 => new Counter
        * overload: inc / dec to receive a parameter by which increment and decrement will be done. and return new Counter
  */
  
    class Counter(var count: Int){

      def currentCount(): Int = count

      def getIncrement(): Counter = new Counter(count + 1)

      def getIncrement(i: Int): Counter = new Counter(count + i)

      def getDecrement(): Counter = new Counter(count - 1)

      def getDecrement(i: Int): Counter = new Counter(count - i)

    }

    var counter: Counter = new Counter(10)

    println(counter.currentCount())

    counter = counter.getIncrement()
    println(counter.currentCount())

    counter = counter.getDecrement()
    println(counter.currentCount())

    counter = counter.getIncrement(3)
    println(counter.currentCount())

    counter = counter.getDecrement(4)
    println(counter.currentCount())
    
}