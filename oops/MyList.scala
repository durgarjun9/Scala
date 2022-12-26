// Exercise: Creating a own collection.

abstract class MyList {
    /**
      * This list will be singly linked list which hold the Integers.
      * methods -
      * head: return Int which will be the first element of the list.
      * tail: remainder of the list
      * isEmpty: boolean
      * add(e): recieves an integer, we will return a new list, with element added.
      * toString: a string representation of the list.
    */

    def head: Int
    def tail: MyList
    def isEmpty: Boolean
    def add(element: Int): MyList
    def printElements: String
    override def toString: String = "[" + printElements + "]"

}

object Empty extends MyList{
    def head: Int = throw new NoSuchElementException
    def tail: MyList = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def add(element: Int): MyList = new Cons(element, Empty)
    def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
    def head: Int = h
    def tail: MyList= t
    def isEmpty: Boolean = false
    def add(element: Int): MyList = new Cons(element, this)
    def printElements: String = 
        if (t.isEmpty) head.toString
        else s"$h " + t.printElements

}

object ListTest extends App {
    val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
    println(list.tail.head)
    println(list.add(4).head)
    println(list.isEmpty)

    println(list.toString)
}