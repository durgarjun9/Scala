import scala.Nothing
// Exercise: Creating a own collection.

abstract class MyListG[+A] {
    /**
      * This list will be singly linked list which hold the Integers.
      * methods -
      * head: return Int which will be the first element of the list.
      * tail: remainder of the list
      * isEmpty: boolean
      * add(e): recieves an integer, we will return a new list, with element added.
      * toString: a string representation of the list.
    */

    def head: A
    def tail: MyListG[A]
    def isEmpty: Boolean
    def add[B >: A](element: B): MyListG[B]
    def printElements: String
    override def toString: String = "[" + printElements + "]"

}

object Empty extends MyListG[Nothing]{
    def head: Nothing = throw new NoSuchElementException
    def tail: MyListG[Nothing] = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def add[B >: Nothing](element: B): MyListG[B] = new Cons(element, Empty)
    def printElements: String = ""
}

class Cons[+A](h: A, t: MyListG[A]) extends MyListG[A] {
    def head: A = h
    def tail: MyListG[A]= t
    def isEmpty: Boolean = false
    def add[B >: A](element: B): MyListG[B] = new Cons(element, this)
    def printElements: String = 
        if (t.isEmpty) head.toString
        else s"$h " + t.printElements

}

object ListTest extends App {
    val listOfIntegers: MyListG[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
    val listOfStrings: MyListG[String] = new Cons("Hello", new Cons("Scala", Empty))
    println(listOfIntegers.toString)
    println(listOfStrings.toString)
}